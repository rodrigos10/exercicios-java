package br.com.cod3r.exerciciosb.controller;

import br.com.cod3r.exerciciosb.models.Clintes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Clintes obterCliente(){
        return new Clintes(28,"pedro", "076.558.105-18");
    }
    @GetMapping("/{id}")
    public Clintes obterClientePorID1(@PathVariable int id) {
        return new Clintes(28, "sara haha", "076.558.105-18");
    }
    @GetMapping
    public Clintes obterClientePorId2(@RequestParam(name = "id") int id){
        return new Clintes(id, "João", "2554.1165.16546-99");
    }
}
