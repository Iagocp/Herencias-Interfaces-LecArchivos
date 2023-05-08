package Herencia6_TiendaMascotas;

public class GatoPeloCorto extends Gatos {
	public enum pelajes {AZUL_RUSO,BRITÁNICO,MANX,DEVON_REX  };
	public pelajes pelaje;
	public GatoPeloCorto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GatoPeloCorto(double alturaSalto, double longitudSalto, int edad, String nombre, String color, pelajes pelaje) {
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
		return "GatoPeloCorto [pelaje=" + pelaje + ", alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto
				+ ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	

}
