package Herencia8_Ciclismo;

public class Velocista extends Ciclista {
	double potenciaPromedio;
	double velocidapromedio;

	public Velocista(int id, String nombre, int tiempoAcumulado,int potenciaPromedio,int velocidadPromedio) {
		super(id, nombre, tiempoAcumulado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Velocista [potenciaPromedio=" + potenciaPromedio + ", velocidapromedio=" + velocidapromedio + ", id="
				+ id + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado + "]";
	}



	
	

}
