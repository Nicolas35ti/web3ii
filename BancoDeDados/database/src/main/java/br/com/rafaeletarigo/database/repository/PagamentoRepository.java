package br.com.rafaeletarigo.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaeletarigo.database.model.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento,Long>{
    // public List<Pagamento> findByPagamento(short id);

    
}
