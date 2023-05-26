package br.com.rafaeletarigo.database.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//Criando Table Restaurante//
@Entity
@Table(name = "restaurante")
public class Restaurante {

    //Atribuindo valores a table Retaurante//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short id;
    @Column(nullable = false, unique = true, length = 30)
    private String nome;
    @Column(nullable = false, length = 16, unique = true)
    private String telefone;
    @OneToOne
    @JoinColumn (name = "endereco_id")
    private Endereco endereco;


    //Getters e Setters//
    public short getId() {
        return id;
    }
    public void setId(short id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome_restaurante) {
        this.nome = nome_restaurante;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone_restaurante) {
        this.telefone = telefone_restaurante;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static boolean validPhone (String telefone_restaurante){
        return telefone_restaurante.matches("^(1[1-9]|[4689][0-9]|2[12478]|3([1-5]|[7-8])|5([13-5])|7[193-7])9[0-9]{8}$");
    }
    public String getPlaceEndereco(){
        String actualEndereco = endereco.getRua() + ", " + endereco.getNumero() + ", " + endereco.getBairro() +", " + endereco.getCidade()+ ", " + endereco.getEstado();
        return actualEndereco;
    }
    
}
