package br.com.rafaeletarigo.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.rafaeletarigo.database.model.Produto;
import br.com.rafaeletarigo.database.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll(){
        return repository.findAll();
    }
    
    public Produto save(Produto produto){
        return repository.save(produto);
    }
}
