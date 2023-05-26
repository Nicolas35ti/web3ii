package br.com.rafaeletarigo.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.rafaeletarigo.database.model.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante,Long>{
    @Query("select restaurante from Restaurante restaurante where restaurante.nome LIKE :nome||'%'")
List<Restaurante> findCustomByNome( @Param("nome") String nome);
    // public List<Restaurante> findByNome(String nome_restaurante);
    // public List<Restaurante> findByPhone(String telefone_restaurante);
    // public List<Restaurante> findByEndereco(Endereco endereco_restaurante);
}
