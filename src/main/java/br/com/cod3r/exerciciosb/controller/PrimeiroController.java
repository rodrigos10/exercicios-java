package br.com.cod3r.exerciciosb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {

    int qual = 0;

    @GetMapping(path = "/ola")
    public String ola(){
        return "ola Spring boot " + qual++;
    }
    @PostMapping(path = "/saudacao")
    public String saudacao(){
        return "ola Spring boot (POST)! " + qual++;
    }
}
