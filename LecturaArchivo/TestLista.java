package LecturaArchivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestLista {
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) throws Exception {

		ArrayList<Asignatura> arrayEscribir = new ArrayList<Asignatura>();
		ArrayList<Asignatura> arrayLeer=null;

		System.out.println("Asignaturas que se van a escribir en el fichero: ");
		for (int i = 0; i < 5; i++) {
			Asignatura newObject = new Asignatura(i, "cadena", 5 * i);
			arrayEscribir.add(newObject);
			System.out.println("ArrayEscribir[" + i + "] = " + arrayEscribir.get(i).toString());
		}
		try {
			System.out.println("Guardando Arraylist en el fichero objectos.dat ...");
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("objetos.dat"));
			escribiendoFichero.writeObject(arrayEscribir);
			escribiendoFichero.close();
			System.out.println("ok");

			System.out.println("Leyendo Arraylist del fichero objetos.dat...");
			ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("objetos.dat"));

			arrayLeer = (ArrayList<Asignatura>) leyendoFichero.readObject();
			leyendoFichero.close();

			System.out.println("Leido Correctamente");
			System.out.println("Los datos son los siguientes: ");

			for (int i = 0; i < arrayLeer.size(); i++) {
				System.out.println("Array leer" + i + "] = " + arrayLeer.get(i).toString());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}