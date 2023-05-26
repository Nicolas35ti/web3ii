package br.com.rafaeletarigo.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Criando table Produto//
@Entity
@Table(name = "produto")
public class Produto {
    //Atribuindo valores a table Produto//
    @Id
    private short id;
    private String nome_produto;

    //Getters e Setters//
    public short getId() {
        return id;
    }
    public void setId(short id) {
        this.id = id;
    }
    public String getNome_produto() {
        return nome_produto;
    }
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

}
