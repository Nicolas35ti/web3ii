package br.com.rafaeletarigo.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaeletarigo.database.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
    // public List<Produto> findByProduto(short id);
    
}
