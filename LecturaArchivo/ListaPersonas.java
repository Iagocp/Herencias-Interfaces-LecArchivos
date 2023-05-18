package LecturaArchivo;

import java.util.ArrayList;

public class ListaPersonas {
	ArrayList<Persona>ListaPersonas;
	
	public ListaPersonas() {
		ListaPersonas = new ArrayList<>();
	}
public void añadirPersona(Persona p) {
	ListaPersonas.add(p);
}

public void eliminarPersona(int i) {
	ListaPersonas.remove(i);
}
public void borrarLista() {
	ListaPersonas.removeAll(ListaPersonas);
}
public void listar() {
	for(int i =0; i<ListaPersonas.size();i++) {
		System.out.println("posicion: " + i + ": " + ListaPersonas.get(i).toString());
	}
}
}

