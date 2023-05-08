package Herencia5_Universidad;

public class Estudiante extends Persona {
	
	protected String carrera;
	protected int semestre;

	public Estudiante() {
		super();
	}
	
	public Estudiante( String nombre, String dirección,String carrera, int semestre) {
		super(nombre,dirección);
		this.carrera= carrera;
		this.semestre= semestre;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return "Estudiante [carrera=" + carrera + ", semestre=" + semestre + ", nombre=" + nombre + ", dirección="
				+ dirección + "]";
	}
	
	
	
	
	
}
