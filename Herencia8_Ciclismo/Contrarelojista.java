package Herencia8_Ciclismo;

public class Contrarelojista extends Ciclista{
	double velocidadMaxima;

	public Contrarelojista(int id, String nombre, int tiempoAcumulado, double velocidadMaxima) {
		super(id, nombre, tiempoAcumulado);
		this.velocidadMaxima = velocidadMaxima;
	}

	
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	@Override
	public String toString() {
		return "Contrarelojista [velocidadMaxima=" + velocidadMaxima + ", id=" + id + ", nombre=" + nombre
				+ ", tiempoAcumulado=" + tiempoAcumulado + "]";
	}









}
