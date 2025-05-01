package br.com.cod3r.exerciciosb.models;

import org.springframework.data.repository.CrudRepository;

import br.com.cod3r.exerciciosb.models.entidades.Produto;

public interface ProdutoRepository 
extends CrudRepository <Produto, Integer> {

    

}
