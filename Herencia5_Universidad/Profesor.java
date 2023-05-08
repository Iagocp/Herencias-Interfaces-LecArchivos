package Herencia5_Universidad;

public class Profesor extends Persona {
	
	protected String departamento;
	protected String categoría;
	
	public Profesor() {
		super();
	}

	public Profesor(String nombre, String dirección,String departamento, String categoría) {
		super(nombre, dirección);
		// TODO Auto-generated constructor stub
		this.categoría= categoría;
		this.departamento= departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCategoría() {
		return categoría;
	}

	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}

	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", categoría=" + categoría + ", nombre=" + nombre
				+ ", dirección=" + dirección + "]";
	}
	
	
	
	

}
