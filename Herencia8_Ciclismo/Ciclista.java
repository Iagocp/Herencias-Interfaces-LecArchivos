package Herencia8_Ciclismo;

public abstract class Ciclista {
	int id;
	String nombre;
	int tiempoAcumulado=0;
	public Ciclista(int id, String nombre, int tiempoAcumulado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tiempoAcumulado = tiempoAcumulado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	@Override
	public String toString() {
		return "Ciclista [id=" + id + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado + "]";
	}

	
	

}
