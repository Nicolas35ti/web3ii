package br.com.rafaeletarigo.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaeletarigo.database.model.Cliente;
import br.com.rafaeletarigo.database.service.ClienteService;

//Criando controle de fluxo de dados//
@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Cliente cliente){
        try{
            return new ResponseEntity<>(service.save(cliente),HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>("Houve um erro inesperado em nosso sistema. Tente novamente mais tarde!!!",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
