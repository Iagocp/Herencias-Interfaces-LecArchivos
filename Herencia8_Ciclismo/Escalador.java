package Herencia8_Ciclismo;

public class Escalador extends Ciclista {
	double aclereracionPromedio;
	double gradoRampa;

	public Escalador(int id, String nombre, int tiempoAcumulado, double aclereracionPromedio, double gradoRampa,
			int posicion) {
		super(id, nombre, tiempoAcumulado, posicion);
		this.aclereracionPromedio = aclereracionPromedio;
		this.gradoRampa = gradoRampa;
	}

	public double getAclereracionPromedio() {
		return aclereracionPromedio;
	}

	public void setAclereracionPromedio(double aclereracionPromedio) {
		this.aclereracionPromedio = aclereracionPromedio;
	}

	public double getGradoRampa() {
		return gradoRampa;
	}

	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}
	

	@Override
	public String toString() {
		return "Escalador [aclereracionPromedio=" + aclereracionPromedio + ", gradoRampa=" + gradoRampa + ", id=" + id
				+ ", nombre=" + nombre + ", tiempoAcumulado=" + tiempoAcumulado + ", posicion=" + posicion + "]";
	}

	public void getTipo() {
		// TODO Auto-generated method stub

	}

}
