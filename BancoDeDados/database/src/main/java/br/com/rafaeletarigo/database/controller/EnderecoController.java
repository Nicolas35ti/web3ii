package br.com.rafaeletarigo.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaeletarigo.database.model.Endereco;
import br.com.rafaeletarigo.database.service.EnderecoService;

//Criando controle de fluxo de dados//
@RestController
@RequestMapping("api/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService service;

    public List<Endereco> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Endereco endereco){
        try{
            return new ResponseEntity<>(service.save(endereco),HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>("Houve um erro inesperado em nosso sistema, tente novamente mais tarde!!!",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
