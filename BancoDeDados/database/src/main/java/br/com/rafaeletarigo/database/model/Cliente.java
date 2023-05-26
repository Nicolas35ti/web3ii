package br.com.rafaeletarigo.database.model;


import java.util.regex.Pattern;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Criando table Cliente//
@Entity
@Table(name = "cliente")
public class Cliente {
    //Atribuindo valores a table Cliente//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 20)
    private String nome_cliente;
    @Column(nullable = false, length = 50)
    private String sobrenome_cliente;
    @Column(nullable = false)
    private String dataNascimento;
    @Column(nullable = false, unique = true)
    private String email_cliente;
    @Column(nullable = false, length = 16)
    private String senha;


    //Getters e Setters//
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome_cliente() {
        return nome_cliente;
    }
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public String getSobrenome_cliente() {
        return sobrenome_cliente;
    }
    public void setSobrenome_cliente(String sobrenome_cliente) {
        this.sobrenome_cliente = sobrenome_cliente;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEmail_cliente() {
        return email_cliente;
    }
    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
    public String getSenha() {
        return senha;
    }

    public static boolean validateName (String nome_cliente) {
        return nome_cliente.matches("[A-Z][a-z]");
    }

    public static boolean validateSobrenome (String sobrenome_cliente) {
        return sobrenome_cliente.matches("[a-zA-z]+([ '-][a-zA-Z]+)*");
    }
    public boolean validateEmail(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }
     
}
//como é dificil ter um penis na minha buceuta
