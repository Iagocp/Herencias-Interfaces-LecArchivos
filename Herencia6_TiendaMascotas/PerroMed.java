package Herencia6_TiendaMascotas;

public class PerroMed extends Perros {
	public enum razas {COLLIE,DÁLMATA,BULLDOG,GALGO,SABUESO};
	
	protected razas raza;

	public PerroMed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PerroMed(double peso, boolean mordisco, String nombre, int edad, String color, razas raza) {
		super(peso, mordisco, nombre, edad, color);
		this.raza=raza;
		
		// TODO Auto-generated constructor stub
	}

	public razas getRaza() {
		return raza;
	}

	public void setRaza(razas raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "PerroMed [raza=" + raza + ", peso=" + peso + ", mordisco=" + mordisco + ", nombre=" + nombre + ", edad="
				+ edad + ", color=" + color + "]";
	}
	
	
	
	
}
