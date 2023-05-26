package br.com.rafaeletarigo.database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Criando table Endereço//
@Entity
@Table(name = "endereco")
public class Endereco{
    //Atribuindo valores a table Endereço//
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;
    @Column(nullable = false, length = 22)
    private String estado;
    @Column(nullable = false, length = 20)
    private String cidade;
    @Column(nullable = false, length = 20)
    private String bairro;
    @Column(nullable = false, length = 20)
    private String rua;
    @Column(nullable = false, length = 20, unique = true)
    private String numero;
    


    //Getters e Setters//
    public short getId() {
        return id;
    }
    public void setId(short endereco_id) {
        this.id = endereco_id;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public static boolean validateEstado(String estado) {
        return estado.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateCidade(String cidade) {
        return cidade.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateBairro(String bairro) {
        return bairro.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateRua(String rua) {
        return rua.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateNumero(String numero) {
        return numero.matches("([0-9] | [A-Z] + \\d[0-9])");
    }

    
}
