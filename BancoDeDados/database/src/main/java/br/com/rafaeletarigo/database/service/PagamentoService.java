package br.com.rafaeletarigo.database.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.rafaeletarigo.database.model.Pagamento;
import br.com.rafaeletarigo.database.repository.PagamentoRepository;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository repository;

    public List<Pagamento> findAll(){
        return repository.findAll();
    }

    public Pagamento save(Pagamento pagamento){
        return repository.save(pagamento);
    }
    
}
