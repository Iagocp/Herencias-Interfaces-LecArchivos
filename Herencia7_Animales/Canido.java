package Herencia7_Animales;

public class Canido extends Animal {

	public Canido(String sonido, String alimento, String habitat, String nombreCientifico) {
		super(sonido,alimento,habitat,nombreCientifico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Canido [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}


	
	

	

}
