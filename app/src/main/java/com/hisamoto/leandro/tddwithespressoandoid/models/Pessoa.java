package com.hisamoto.leandro.tddwithespressoandoid.models;

/**
 * Created by leandro on 29/09/15.
 */
public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean podeVotar() {

        return this.idade > 16;
    }

}
