package Herencia7_Animales;

public class Leon extends Felino{

	public Leon(String sonido, String alimento, String habitat, String nombreCientifico) {
		super(sonido,alimento,habitat,nombreCientifico);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Leon [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	

}
