package Interfaz03_Vehiculos;

public class Terrestre extends Vehiculo implements Motor {

	Terrestre(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
	}

	void acelerar(int incremento) {
		int vel = velocidadActual + incremento;
		if (vel > velocidadMaxima) {
			System.out.println("Supera la velocidad maxima");
		}else {
			velocidadActual = vel;
		}
		
	}
	void frenar(int incremento) {
		int vel = velocidadActual - incremento;
		if (vel < 0) {
			System.out.println("La velocidad no puede ser negativa");
		}else {
			velocidadActual = vel;
		}
	}
	
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return (fuerza * radio);
	}

	@Override
	public String toString() {
		return "Terrestre [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	
	
}
