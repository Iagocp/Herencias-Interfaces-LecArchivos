package Herencia6_TiendaMascotas;

public class Perros extends Mascota {
	
	protected double peso;
	protected boolean mordisco;
	
	
	 public Perros(){
		 super();
	 }


	public Perros(double peso, boolean mordisco,String nombre, int edad, String color) {
		super(nombre, edad, color);
		this.peso = peso;
		this.mordisco = mordisco;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public boolean isMordisco() {
		return mordisco;
	}


	public void setMordisco(boolean mordisco) {
		this.mordisco = mordisco;
	}


	@Override
	public String toString() {
		return "Perros [peso=" + peso + ", mordisco=" + mordisco + ", nombre=" + nombre + ", edad=" + edad + ", color="
				+ color + "]";
	}


	@Override
	public String Sonido() {
		// TODO Auto-generated method stub
		return "GUAU GUAU";
	}
	 
	

}
