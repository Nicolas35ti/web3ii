package br.com.rafaeletarigo.database.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rafaeletarigo.database.model.Endereco;
import br.com.rafaeletarigo.database.model.Restaurante;
import br.com.rafaeletarigo.database.repository.RestauranteRepository;

@Service
public class RestauranteService {
    Endereco endereco;
    
    @Autowired
    private RestauranteRepository repository;

    public List<Restaurante> findAll(){
        return repository.findAll();
    }

    public Restaurante save (Restaurante restaurante) throws IllegalArgumentException{
        if (restaurante.getNome() == null || restaurante.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do RESTAURANTE não pode ficar em branco");
        }
        
        if (restaurante.getPlaceEndereco() == null || !restaurante.getPlaceEndereco().equals(endereco.getRua() +", " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCidade() + ", " + endereco.getEstado())) {
            throw new IllegalArgumentException("O ENDEREÇO inserido não é válido");
        }

        if (restaurante.getTelefone() == null || !restaurante.getTelefone().equals( restaurante.getTelefone())){
            throw new IllegalArgumentException("O TELEFONE inserido não é válido!");
        }

        return repository.save(restaurante);
    }
    
}
