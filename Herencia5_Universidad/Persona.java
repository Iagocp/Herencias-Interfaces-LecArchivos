package Herencia5_Universidad;

public class Persona {
	protected String nombre;
	protected String dirección;
	
	public Persona() {}
	
	public Persona(String nombre, String dirección) {
		this.nombre= nombre;
		this.dirección= dirección;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dirección=" + dirección + "]";
	}
	
	
	

}
