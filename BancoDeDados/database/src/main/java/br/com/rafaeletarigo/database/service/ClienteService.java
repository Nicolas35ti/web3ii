package br.com.rafaeletarigo.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaeletarigo.database.model.Cliente;
import br.com.rafaeletarigo.database.repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }
    
    
}