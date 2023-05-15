package Interfaz03_Vehiculos;

public abstract class Vehiculo {

	int velocidadActual;
	int velocidadMaxima;
	
	public Vehiculo(int velocidadActual, int velocidadMaxima) {
		super();
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	abstract void acelerar(int velocidad);
	
	abstract void frenar(int velocidad);
	
}
