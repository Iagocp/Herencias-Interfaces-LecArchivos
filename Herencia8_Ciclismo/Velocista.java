package Herencia8_Ciclismo;

public class Velocista extends Ciclista {
	double potenciaPromedio;
	double velocidapromedio;

	public Velocista(int id, String nombre, int tiempoAcumulado, int potenciaPromedio, int velocidadPromedio,
			int posicion) {
		super(id, nombre, tiempoAcumulado, posicion);
		// TODO Auto-generated constructor stub
	}

	public double getPotenciaPromedio() {
		return potenciaPromedio;
	}

	public void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}

	public double getVelocidapromedio() {
		return velocidapromedio;
	}

	public void setVelocidapromedio(double velocidapromedio) {
		this.velocidapromedio = velocidapromedio;
	}
	

	@Override
	public String toString() {
		return "Velocista [potenciaPromedio=" + potenciaPromedio + ", velocidapromedio=" + velocidapromedio + ", id="
				+ id + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado + ", posicion=" + posicion + "]";
	}

	public void getTipo() {
		// TODO Auto-generated method stub

	}

}
