package Herencia6_TiendaMascotas;

public class GatoSinPelo extends Gatos{
	public enum pelajes {ESFINGE,ELFO,DONSHOY };
	public pelajes pelaje;
	public GatoSinPelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GatoSinPelo(double alturaSalto, double longitudSalto, int edad, String nombre, String color, pelajes pelaje) {
		super(alturaSalto, longitudSalto, edad, nombre, color);
		// TODO Auto-generated constructor stub
		this.pelaje=pelaje;
		
	}
	public pelajes getPelaje() {
		return pelaje;
	}
	public void setPelaje(pelajes pelaje) {
		this.pelaje = pelaje;
	}
	@Override
	public String toString() {
		return "GatoSinPelo [pelaje=" + pelaje + ", alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto
				+ ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	

}
