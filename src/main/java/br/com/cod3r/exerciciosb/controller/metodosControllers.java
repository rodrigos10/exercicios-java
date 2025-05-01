package br.com.cod3r.exerciciosb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class metodosControllers {
    @GetMapping
    public String get(){
        return "Reqisição GET";
    }
    @PostMapping
    public String post(){
        return "Reqisição POS";
    }
    @PutMapping
    public String put(){
        return "Reqisição PUT";
    }
    @PatchMapping
    public String patch(){
        return "Reqisição PATCH";
    }
    @DeleteMapping
    public String delete(){
        return "Reqisição DELETE";
    }
}
