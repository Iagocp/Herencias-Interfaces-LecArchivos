package Herencia6_TiendaMascotas;

public class PerroPequeño extends Perros {
	 
	public enum razas {YORKSHIRE,SCHNAUZER,CANICHE,CHIHUAHUA};
	
	protected razas raza;

	public PerroPequeño() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PerroPequeño(double peso, boolean mordisco, String nombre, int edad, String color,razas raza) {
		super(peso, mordisco, nombre, edad, color);
		// TODO Auto-generated constructor stub
		this.raza=raza;
	}

	public razas getRaza() {
		return raza;
	}

	public void setRaza(razas raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "PerroPequeño [raza=" + raza + ", peso=" + peso + ", mordisco=" + mordisco + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}
	
	
	
	
	

}
