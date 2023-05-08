package Herencia3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@SuppressWarnings("unused")
public class test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Vehiculo> carros = new ArrayList<Vehiculo>();
		Vehiculo vehiculo = new Vehiculo(Color.yellow, (byte) 4);

		Motocicleta MotoBarata = new Motocicleta(Color.red, (short) 125, (short) 25);
		Motocicleta MotoBarata2 = new Motocicleta(Color.red, (short) 125, (short) 25);
		Motocicleta MotoCara = new Motocicleta(Color.yellow, (short) 1000, (short) 90);

		Camion CamionNormal = new Camion(Color.red, (byte) 4, (byte) 2, (short) 4000, (short) 300);
		Camion CamionEnorme = new Camion(Color.red, (byte) 24, (byte) 6, (short) 15000, (short) 800);
		Coche Coche = new Coche(Color.red, (byte) 4, 5, (short) 1200, (short) 120);
		carros.add(vehiculo);
		carros.add(MotoBarata);
		carros.add(MotoBarata2);
		carros.add(MotoCara);
		carros.add(CamionNormal);
		carros.add(CamionEnorme);
		carros.add(Coche);

		for (Vehiculo v : carros) {
			System.out.println(v.toString());
			System.out.println("Impuesto rodaje " + v.pagarRodaje());

		}

		System.out.println("------------------------------------------------");
		System.out.println("Ordenamos de mayor a menor: ");
		Collections.sort(carros);

		for (Vehiculo v : carros) {
			System.out.println(v.toString());
			System.out.println("Impuesto rodaje " + v.pagarRodaje());
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Repostamos: ");
		for (Vehiculo v : carros) {
			System.out.println(v.toString());
			System.out.println(v.pagarCarburante());
		}

	}
}
