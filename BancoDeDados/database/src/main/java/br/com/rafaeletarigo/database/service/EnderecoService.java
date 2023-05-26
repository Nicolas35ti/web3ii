package br.com.rafaeletarigo.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaeletarigo.database.model.Endereco;
import br.com.rafaeletarigo.database.repository.EnderecoRepository;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findAll(){
        return repository.findAll();
    }

    public Endereco save(Endereco endereco){
        return repository.save(endereco);
    }
    
}
