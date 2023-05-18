package LecturaArchivo;

public class testConsola {
	
	public static void main(String[] args) {
		ListaPersonas alumnos = new ListaPersonas();
		alumnos.añadirPersona(new Persona("Pepe","Hermengardo","698523642","Hector Del Mar nº23"));
		alumnos.listar();
		alumnos.añadirPersona(new Persona("Angel","Onofredo","691283672","Hector Del Mar nº22"));
		alumnos.listar();
		alumnos.añadirPersona(new Persona("Chiquito","Comorl","698523698","Hector Del Mar nº21"));
		alumnos.listar();
		
		alumnos.eliminarPersona(4);
		alumnos.listar();
		alumnos.eliminarPersona(1);
		alumnos.listar();
		
		
		alumnos.borrarLista();
		System.out.println("Lista borrada");
		
		
	}

}
