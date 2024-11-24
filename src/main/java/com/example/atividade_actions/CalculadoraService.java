package com.example.atividade_actions;


import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CalculadoraService {

    public double dividir(double a, double b){


        if (b == 0){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Divisão por zero não permitida");
        }

        return a / b;
    }

    public Double multiplicar(double a, double b) {
        return a * b;
    }
}