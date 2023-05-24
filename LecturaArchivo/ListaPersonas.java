package LecturaArchivo;

import java.util.ArrayList;

public class ListaPersonas  {
	ArrayList<Persona>ListaPersonas;
	
	
	public ListaPersonas(ArrayList<Persona> listaPersonas) {
		super();
		ListaPersonas = listaPersonas;
	}
	public ListaPersonas() {
		ListaPersonas = new ArrayList<>();
	}
public void añadirPersona(Persona p) {
	ListaPersonas.add(p);
}


public ArrayList<Persona> getListaPersonas() {
	return ListaPersonas;
}
public void setListaPersonas(ArrayList<Persona> listaPersonas) {
	ListaPersonas = listaPersonas;
}
public void eliminarPersona(int i) {
	if(i<ListaPersonas.size())
		ListaPersonas.remove(i);
	else 
		System.out.println("Indice erroneo");
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

