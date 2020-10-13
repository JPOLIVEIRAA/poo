package com.company.RevisaoExercicio4;

public class CasaTeste {

    public static void main(String[] args) {

        Casa casa1 = new Casa();

        casa1.setPorta1(casa1.portaAberta());
        casa1.setPorta2(casa1.portaAberta());
        casa1.setPorta3(casa1.portaAberta());


        String [] cor = {"Verde", "Azul", "Preto"};
        casa1.pinta(cor [0]);

        System.out.println("a casa foi pintada de " + casa1.getCor());
        casa1.quantasPortasEstaoAbertas();

    }
}
