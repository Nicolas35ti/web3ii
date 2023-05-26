package br.com.rafaeletarigo.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaeletarigo.database.model.Produto;
import br.com.rafaeletarigo.database.service.ProdutoService;


//Criando controle de fluxo de dados//
@RestController
@RequestMapping("api/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @PostMapping
    public List<Produto> findAll(){
        return service.findAll();
    }

    public ResponseEntity<Object> save(@RequestBody Produto produto){
        try{
            return new ResponseEntity<>(service.save(produto),HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>("Houve um erro inesperado em nosso sistema. Tente novamente mais tarde!",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
