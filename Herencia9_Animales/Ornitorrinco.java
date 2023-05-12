package Herencia9_Animales;

public class Ornitorrinco extends Mamifero implements Oviparo{

	public void amamantarCrias() {
		System.out.println("Mamando");
	}

	public void ponerHuevos() {
		System.out.println("Poniendo huevos");
	}
	
}
