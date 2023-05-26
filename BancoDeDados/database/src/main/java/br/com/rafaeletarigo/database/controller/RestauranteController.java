package br.com.rafaeletarigo.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafaeletarigo.database.model.Restaurante;
import br.com.rafaeletarigo.database.service.EnderecoService;
import br.com.rafaeletarigo.database.service.RestauranteService;

//Criando controle de fluxo de dados//
@RestController
@RequestMapping("api/restaurante")
public class RestauranteController {

    
    @Autowired
    private RestauranteService service;

    @GetMapping
    public List<Restaurante> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Restaurante save (Restaurante restaurante) throws IllegalArgumentException{
        if (restaurante.getNome() == null || restaurante.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do RESTAURANTE não pode ficar em branco");
        }
        
        if (restaurante.getPlaceEndereco() == null || restaurante.getPlaceEndereco() != EnderecoService.getRua() +", " + EnderecoService.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCidade() + ", " + endereco.getEstado()) {
            throw new IllegalArgumentException("O ENDEREÇO inserido não é válido");
        }

        if (restaurante.getTelefone() == null || restaurante.getTelefone() != restaurante.getTelefone()){
            throw new IllegalArgumentException("O TELEFONE inserido não é válido!");
        }

        return repository.save(restaurante);
    }
    
}

