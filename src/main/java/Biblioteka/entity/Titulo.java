package Biblioteka.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Titulo {

    private String nome;

    public Titulo() {
    }

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}