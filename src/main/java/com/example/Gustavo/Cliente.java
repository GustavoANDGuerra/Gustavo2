package com.example.Gustavo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cliente")
public class Cliente {
    @Id
    @Column(name = "Cliente_id", nullable = false)
    private Long id;
    @Column(name = "Cliente_nome", nullable = false)
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(){}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
