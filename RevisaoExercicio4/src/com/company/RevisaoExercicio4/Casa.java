package com.company.RevisaoExercicio4;



public class Casa {

    private String cor;
    private int porta1;
    private int porta2;
    private int porta3;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPorta1() {
        return porta1;
    }

    public void setPorta1(int porta1) {
        this.porta1 = porta1;
    }

    public int getPorta2() {
        return porta2;
    }

    public void setPorta2(int porta2) {
        this.porta2 = porta2;
    }

    public int getPorta3() {
        return porta3;
    }

    public void setPorta3(int porta3) {
        this.porta3 = porta3;
    }

    public void pinta(String cor){

        this.cor = cor;

    }

    public int portaAberta(){
        return 1;
    }

    public int portaFechada(){
        return 0;
    }

    public void quantasPortasEstaoAbertas(){

        int soma = porta1 + porta2 + porta3;
        if(soma == 3){
            System.out.println("Todas as portas foram abertas!");
        }if(soma == 0){
            System.out.println("Todas as portas foram fechadas!");
        }

    }

}
