package LecturaArchivo;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {
	public static void main(String[] args) throws Exception {
		FileWriter archivo=null;
		PrintWriter impresor=null;
		try {
		archivo = new FileWriter("C:\\Users\\Primero DAM\\Documents\\Iago Centeno\\Programación\\eclipse-workspace\\3aEvaluacion\\src\\LecturaArchivo\\prueba02.txt");
		impresor = new PrintWriter(archivo);
		for(int i=0;i<10;i++)impresor.println("Round: " + i);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(archivo != null)archivo.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
