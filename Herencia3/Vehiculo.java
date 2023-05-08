package Herencia3;

import java.awt.Color;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
public class Vehiculo implements Comparable, EstacionServicio {
	protected Color ColorVehiculo;
	protected byte NumRuedas;
	protected short Cilindrada;
	protected short Potencia;

	Vehiculo(Color color) {
		EstableceColor(color);
	}

	Vehiculo(byte NumRuedas) {
		this.NumRuedas = NumRuedas;
	}

	public Color getColorVehiculo() {
		return ColorVehiculo;
	}

	public void setColorVehiculo(Color colorVehiculo) {
		ColorVehiculo = colorVehiculo;
	}

	public byte getNumRuedas() {
		return NumRuedas;
	}

	public void setNumRuedas(byte numRuedas) {
		NumRuedas = numRuedas;
	}

	public short getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(short cilindrada) {
		Cilindrada = cilindrada;
	}

	public short getPotencia() {
		return Potencia;
	}

	public void setPotencia(short potencia) {
		Potencia = potencia;
	}

	Vehiculo(short Cilindrada) {
		this.Cilindrada = Cilindrada;
	}

	Vehiculo(Color color, byte NumRuedas) {
		this(color);
		this.NumRuedas = NumRuedas;
	}

	Vehiculo(Color color, byte NumRuedas, short Cilindrada) {
		this(color, NumRuedas);
		this.Cilindrada = Cilindrada;
	}

	Vehiculo(Color color, byte NumRuedas, short Cilindrada, short Potencia) {
		this(color, NumRuedas, Cilindrada);
		this.Potencia = Potencia;
	}

	public void EstableceColor(Color color) {
		ColorVehiculo = color;
	}

	public Color DimeColor() {
		return ColorVehiculo;
	}

	public byte DimeNumRuedas() {
		return NumRuedas;
	}

	public short DimeCilindrada() {
		return Cilindrada;
	}

	public short DimePotencia() {
		return Potencia;
	}

	public double pagarRodaje() {
		return 53.27d;
	}
	
	@SuppressWarnings("resource")
	public  boolean esDiesel() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Es Diesel");
		char respuesta =sc.nextLine().charAt(0);
		if(respuesta =='s')
		return true;
		else
		return false;
		
	}
	
	@Override
	public double pagarCarburante() {
		System.out.println("Impuesto general: ");
		return 1.55;
	}
	
	
	@SuppressWarnings("resource")
	public double pideLitros(){
		Scanner sc= new Scanner(System.in);
		System.out.println();
		double litros =sc.nextDouble();
		return litros;
		
		
	}

	@Override
	public String toString() {
		return "Vehiculo [ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas + ", Cilindrada=" + Cilindrada
				+ ", Potencia=" + Potencia + "]";
	}

	@Override
	public int compareTo(Object o) {
		Vehiculo v = (Vehiculo) o;
		if (this.pagarRodaje() > v.pagarRodaje())
			return -1;
		else if (this.pagarRodaje() == v.pagarRodaje())
			return 0;
		else
			return 1;
	}


}
