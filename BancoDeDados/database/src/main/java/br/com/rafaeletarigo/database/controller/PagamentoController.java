package br.com.rafaeletarigo.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaeletarigo.database.model.Pagamento;
import br.com.rafaeletarigo.database.service.PagamentoService;

//Criando controle de fluxo de dados//
@RestController
@RequestMapping("api/pagamento")
public class PagamentoController {
    @Autowired
    private PagamentoService service;

    public List<Pagamento> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Pagamento pagamento){
        try{
            return new ResponseEntity<>(service.save(pagamento),HttpStatus.CREATED);
        } catch (Exception e){
            return new ResponseEntity<>("Houve um erro inesperado em nosso sistema. Tente novamente mais tarde!!!",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
