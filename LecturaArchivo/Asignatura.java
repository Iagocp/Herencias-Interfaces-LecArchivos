package LecturaArchivo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Asignatura implements Serializable {
	int codigo;
	String nombre;
	int credits;

	Asignatura(int codigo, String nombre, int creditos) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.credits = creditos;
	}

	void imprimir() {
		System.out.println("Codigo de la clase:" + codigo);
		System.out.println("Nombre de la clase:" + nombre);
		System.out.println("Creditos de la clase:" + credits);
	}

	void escribirAsignatura() throws Exception {
		try {
			FileOutputStream archivo = new FileOutputStream("Asignatura.dat");
			ObjectOutputStream salida = new ObjectOutputStream(archivo);
			salida.writeObject(this);
			salida.close();
		} catch (IOException e) {
			System.out.println("No se pudo escribir el archivo");

		}
	}

	void leerAsignatura() throws Exception {
		try {
			FileInputStream archivo = new FileInputStream("Asignatura.dat");
			ObjectInputStream entrada = new ObjectInputStream(archivo);
			Asignatura asignatura = (Asignatura) entrada.readObject();
			asignatura.imprimir();
			entrada.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo escribir el archivo");
		} catch (IOException e) {
			System.out.println("No se pudo escribir el archivo");

		} catch (Exception e) {
			System.out.println("No se pudo escribir el archivo");

		}
	}

	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + ", credits=" + credits + "]";
	}

}
