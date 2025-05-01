package br.com.cod3r.exerciciosb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciosb.models.ProdutoRepository;
import br.com.cod3r.exerciciosb.models.entidades.Produto;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid @RequestBody Produto produto) {
        produtoRepository.save(produto);

        return produto;
    }

    @PostMapping("/lista")
    public @ResponseBody List<Produto> salvarListaProduto(@Valid @RequestBody List<Produto> produtos) {
       

        for(Produto p : produtos){
            produtoRepository.save(p);
        }

        return produtos;
    }
}
