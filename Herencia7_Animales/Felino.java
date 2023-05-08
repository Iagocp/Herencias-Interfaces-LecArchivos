package Herencia7_Animales;

public class Felino extends Animal {

	public Felino(String sonido,String alimento, String habitat, String nombreCientifico) {
		super(sonido,alimento,habitat,nombreCientifico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Felino [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
	

}
