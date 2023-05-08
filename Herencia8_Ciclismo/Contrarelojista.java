package Herencia8_Ciclismo;

public  class Contrarelojista extends Ciclista{
	double velocidadMaxima;

	public Contrarelojista(int id, String nombre, int tiempoAcumulado, double velocidadMaxima, int posicion) {
		super(id, nombre, tiempoAcumulado,posicion);
		this.velocidadMaxima = velocidadMaxima;
	}

	
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}


	
	public void getTipo() {
		// TODO Auto-generated method stub
		
	}


	
}
	










