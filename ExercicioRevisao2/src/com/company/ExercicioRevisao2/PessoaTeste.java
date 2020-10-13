package com.company.ExercicioRevisao2;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("João");
        pessoa.setIdade(18);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("idade: " + pessoa.getIdade());
        pessoa.proximaIdade(10);
    }
}
