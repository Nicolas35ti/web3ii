package br.com.rafaeletarigo.database.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rafaeletarigo.database.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    // public List<Cliente> findByCliente(Long id);
}
