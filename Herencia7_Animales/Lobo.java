package Herencia7_Animales;

public class Lobo extends Canido {

	public Lobo(String sonido, String alimento, String habitat, String nombreCientifico) {
		super(sonido,alimento,habitat,nombreCientifico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lobo [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	

}
