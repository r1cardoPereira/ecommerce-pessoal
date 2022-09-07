package com.br.ricardocorps.lojavirtual.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Cliente {

    
    @Id
    @Column(name = "ID" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Integer codigo;
    private String nome;
    private String email;
    private String telefone;
    
    
    
    public String getNome() {
        return nome.toUpperCase();
    }
    public void setNome(String nome) {
        this.nome.equalsIgnoreCase(nome);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
