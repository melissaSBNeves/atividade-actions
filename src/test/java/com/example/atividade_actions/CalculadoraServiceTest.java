package com.example.atividade_actions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    @Test
    @DisplayName("Quando acionado com 10 e 0, então deve retornar 5")
    public void testDividir(){

        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 2;
        double esperado = 5;

        double resultado = calculadoraService.dividir(a, b);
        assertEquals(esperado, resultado);
    }

    @Test
    @DisplayName("Quando b for 0, então deve lançar ResponseStatusException com BAD_REQUEST")
    public void testDividirErro() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 0;

        // Verifica se ResponseStatusException é lançada
        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {
            calculadoraService.dividir(a, b);
        });

        // Valida o status e a mensagem da exceção
        assertEquals(HttpStatus.BAD_REQUEST, exception.getStatusCode());
        assertEquals("Divisão por zero não permitida", exception.getReason());
    }

    @Test
    @DisplayName("Quando acionado com 10 e 2, então deve retornar 20")
    public void testMultiplicar(){

        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 2;
        double esperado = 20;

        double resultado = calculadoraService.multiplicar(a, b);
        assertEquals(esperado, resultado);
    }


}