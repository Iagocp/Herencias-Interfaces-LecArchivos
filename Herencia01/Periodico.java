package Herencia01;

public class Periodico extends Publicacion{
	public String nombre;
	public String fecha;
	
	
	public Periodico() {
		super();
	}
	public Periodico(int NumeroDePaginas ,float Precio,String nombre, String fecha) {
		super(NumeroDePaginas,Precio);
		this.nombre = nombre;
		this.fecha = fecha;
	}
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		return "Periodico [nombre=" + nombre + ", fecha=" + fecha + ", NumeroDePaginas=" + NumeroDePaginas + ", Precio="
				+ Precio + "]";
	}
}
