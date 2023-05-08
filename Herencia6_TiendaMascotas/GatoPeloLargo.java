package Herencia6_TiendaMascotas;


public class GatoPeloLargo extends Gatos{
public enum pelajes {ANGORA,HIMALAYO,BALINÉS,SOMALÍ};
public pelajes pelaje;
public GatoPeloLargo() {
	super();
	// TODO Auto-generated constructor stub
}
public GatoPeloLargo(double alturaSalto, double longitudSalto, int edad, String nombre, String color, pelajes pelaje) {
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
	return "GatoPeloLargo [pelaje=" + pelaje + ", alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto
			+ ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
}


}
