package Herencia8_Ciclismo;

public abstract class Ciclista {
	int id;
	String nombre;
	int tiempoAcumulado=0;
	int posicion;
	public Ciclista(int id, String nombre, int tiempoAcumulado,int posicion ) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tiempoAcumulado = tiempoAcumulado;
		this.posicion=posicion;
	}
	public abstract void getTipo();

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
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public int getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	@Override
	public String toString() {
		return "Ciclista [id=" + id + ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado + ", posicion="
				+ posicion + "]";
	}
	

	
	

}
