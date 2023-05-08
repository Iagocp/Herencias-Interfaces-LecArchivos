package Herencia5_Universidad;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Persona> gentes = new ArrayList<Persona>();

		Persona p = new Persona("Pepito", "Avenida Europa");
		Estudiante e = new Estudiante("Ramoncin", "Avenida de las Azucenas", "DAM", 2);
		Profesor pr = new Profesor("Aurelio ", " Montepinar nº30 ", "Departamento de Bellas Artes", "Escultura");

		gentes.add(p);
		gentes.add(e);
		gentes.add(pr);

		for (Persona pe : gentes)
			System.out.println(pe.toString());

	}

}
