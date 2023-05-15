package Interfaz03_Vehiculos;

public class Acuatico extends Vehiculo implements Motor, Vela {

	public Acuatico(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);

		
	}

	@Override
	void acelerar(int velocidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void frenar(int velocidad) {
		// TODO Auto-generated method stub
		
	}
	
	public int calcularRevolucionesMotor(int fuerza, int radio) {
		return (fuerza * radio);
	}
	
	public void recomendarVelocidad(int velocidadViento) {
		if (velocidadViento >80 || velocidadViento < 10) {
			velocidadActual = 0;
		}
	}

	@Override
	public String toString() {
		return "Acuatico [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	
	

}
