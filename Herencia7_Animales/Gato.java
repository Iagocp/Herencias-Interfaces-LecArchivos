package Herencia7_Animales;

public class Gato extends Felino {

	public Gato(String sonido, String alimento, String habitat, String nombreCientifico) {
		super(sonido,alimento,habitat,nombreCientifico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
	

	
}
