package Herencia6_TiendaMascotas;

public class Gatos extends Mascota{
	
	protected double alturaSalto;
	protected double longitudSalto;
	
	public Gatos() {
		super();
	}

	public Gatos(double alturaSalto, double longitudSalto, int edad, String nombre, String color) {
		super(nombre,edad,color);
		this.alturaSalto = alturaSalto;
		this.longitudSalto = longitudSalto;
	}

	public double getAlturaSalto() {
		return alturaSalto;
	}

	public void setAlturaSalto(int alturaSalto) {
		this.alturaSalto = alturaSalto;
	}

	public double getLongitudSalto() {
		return longitudSalto;
	}

	public void setLongitudSalto(int longitudSalto) {
		this.longitudSalto = longitudSalto;
	}

	@Override
	public String toString() {
		return "Gatos [alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}

	@Override
	public String Sonido() {
		// TODO Auto-generated method stub
		return "MIAU GRRR";
	}
	
	

}
