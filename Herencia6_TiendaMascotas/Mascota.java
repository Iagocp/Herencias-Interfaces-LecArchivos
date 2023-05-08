package Herencia6_TiendaMascotas;

public abstract class Mascota {
	protected String nombre;
	protected int edad;
	protected String color;

	public Mascota() {}
	
	public Mascota(String nombre, int edad, String color) {
		this.color= color;
		this.edad= edad;
		this.nombre= nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	abstract public String Sonido();
	
	
	
	
	
}
