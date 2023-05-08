package Herencia8_Ciclismo;

public class Escalador extends Ciclista{
	double aclereracionPromedio;
	double gradoRampa;


	public Escalador(int id, String nombre, int tiempoAcumulado, double aclereracionPromedio, double gradoRampa) {
		super(id, nombre, tiempoAcumulado);
		this.aclereracionPromedio = aclereracionPromedio;
		this.gradoRampa = gradoRampa;
	}


	@Override
	public String toString() {
		return "Escalador [aclereracionPromedio=" + aclereracionPromedio + ", gradoRampa=" + gradoRampa + ", id=" + id
				+ ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado + "]";
	}
	
	
	

}
