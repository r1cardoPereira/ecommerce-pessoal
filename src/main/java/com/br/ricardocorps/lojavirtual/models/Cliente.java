package com.br.ricardocorps.lojavirtual.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Clientes")
public class Cliente {

    
    @Id
    @Column(name = "ID" )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    
    @Column(name = "Nome", nullable = false , length = 60)
    private String nome;
    
    @Column(name = "Email", nullable = false, length = 50)
    private String email;
    
    @Column(name = "Telefone", nullable = false, length = 60)
    private String telefone;
    
    
    
    public String getNome() {
        return nome.toUpperCase();
    }
    public void setNome(String nome) {
        this.nome = nome;
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
