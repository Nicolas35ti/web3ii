package br.com.rafaeletarigo.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaeletarigo.database.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Long>{
    // public List<Endereco> findByEndereco(short name);
 
}
