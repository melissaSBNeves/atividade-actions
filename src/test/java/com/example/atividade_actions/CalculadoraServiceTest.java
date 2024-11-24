package com.example.atividade_actions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

}