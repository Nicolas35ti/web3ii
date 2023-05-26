package br.com.rafaeletarigo.database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Criando table Pagamento//
@Entity
@Table(name = "pagamento")
public class Pagamento {
    //Atribuindo valores a table Pagamento//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;
    @Column(length = 20)
    private String formaPagamento;
    @Column(length = 10)
    private Double valor;


    //Getters e Setters//
    public short getId() {
        return id;
    }
    public void setId(short id) {
        this.id = id;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }



    
    
}
