package com.company.ExercicioRevisao2;

public class Pessoa {

    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void proximaIdade(int valor){
        int novaIdade = this.idade += valor;
        System.out.println("A idade de " + this.nome + " daqui a " + valor + " anos será de " + novaIdade + " anos!");
    }

}