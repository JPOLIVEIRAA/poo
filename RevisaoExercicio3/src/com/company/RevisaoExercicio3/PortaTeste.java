package com.company.RevisaoExercicio3;

public class PortaTeste {

    public static void main(String[] args) {
	        Porta porta1 = new Porta(true, "Verde", 60,1.80f,2);

	        porta1.imprimi();
	        porta1.aberta();
	        porta1.fecha();
	        porta1.abre();
	        porta1.pinta("Azul");
    }
}
