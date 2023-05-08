package Herencia6_TiendaMascotas;

public class PerroGrande extends Perros {

	public enum razas {
		PASTORALEMAN, DOBERMAN, ROTWEILLER
	};

	protected razas raza;

	public PerroGrande() {
		super();
	}

	public PerroGrande(double peso, boolean mordisco, String nombre, int edad, String color, razas raza) {
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
		return "PerroGrande [raza=" + raza + ", peso=" + peso + ", mordisco=" + mordisco + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}
	
	

}
