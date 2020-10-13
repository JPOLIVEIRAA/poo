package com.company.RevisaoExercicio3;

public class Porta {

    private boolean aberta = false;
    private String cor;
    private float dimensaoX;
    private float dimensaoY;
    private float dimensaoZ;

    public Porta(boolean aberta, String cor, float dimensaoX, float dimensaoY, float dimensaoZ) {
        this.aberta = aberta;
        this.cor = cor;
        this.dimensaoX = dimensaoX;
        this.dimensaoY = dimensaoY;
        this.dimensaoZ = dimensaoZ;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(float dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public float getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(float dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public float getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(float dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public void abre(){
        this.aberta = true;
        System.out.println("A porta foi aberta!");
    }

    public void fecha(){
        this.aberta = false;
        System.out.println("A porta foi fechada!");
    }

    public void pinta(String cor){
        this.cor = cor;
        System.out.println("A porta foi pintada de:" + this.cor);
    }

    public boolean aberta(){
        if(this.aberta){
             System.out.println("A porta está aberta!");
        }else{
            System.out.println("A porta está fechada!");
        }
        return false;
    }

    public void imprimi(){
        System.out.println("cor = " + cor);
        System.out.println("dimensaoX = " + dimensaoX);
        System.out.println("dimensaoY = " + dimensaoY);
        System.out.println("dimensaoZ = " + dimensaoZ);
    }

}
