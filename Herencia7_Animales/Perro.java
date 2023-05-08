package Herencia7_Animales;

public class Perro extends Canido {

	public Perro(String sonido, String alimento, String habitat, String nombreCientifico) {
		super(sonido,alimento,habitat,nombreCientifico);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Perro [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	

}
