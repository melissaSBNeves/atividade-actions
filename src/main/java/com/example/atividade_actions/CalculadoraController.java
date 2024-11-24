package com.example.atividade_actions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/api")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @PostMapping("/dividir/{a}/{b}")
    public ResponseEntity<Double> dividir(@PathVariable double a, @PathVariable double b){
       return ok(service.dividir(a, b));
    }

    @PostMapping("/multiplicar/{a}/{b}")
    public ResponseEntity<Double> multiplicar(@PathVariable double a, @PathVariable double b){
        return ok(service.multiplicar(a, b));
    }
}
