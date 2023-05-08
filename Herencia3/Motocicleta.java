package Herencia3;

import java.awt.Color;

@SuppressWarnings("rawtypes")
public class Motocicleta extends Vehiculo implements Comparable, EstacionServicio {

	private byte NumeroDePlazas;

	Motocicleta() {
		super((byte) 2);
	}

	Motocicleta(byte NumeroDePlazas) {
		super((byte) 2);
		EstableceNumeroDePlazas(NumeroDePlazas);
	}

	Motocicleta(Color color) {
		super(color, (byte) 2);
	}

	Motocicleta(Color color, short Cilindrada) {
		super(color, (byte) 2, Cilindrada);
	}

	Motocicleta(Color color, short Cilindrada, short Potencia) {
		super(color, (byte) 2, Cilindrada, Potencia);
	}

	public byte DimeNumeroDePlazas() {
		return NumeroDePlazas;
	}

	public void EstableceNumeroDePlazas(byte NumeroDePlazas) {
		this.NumeroDePlazas = NumeroDePlazas;
	}

	public byte getNumeroDePlazas() {
		return NumeroDePlazas;
	}

	public void setNumeroDePlazas(byte numeroDePlazas) {
		NumeroDePlazas = numeroDePlazas;
	}

	@Override
	public String toString() {
		return "Motocicleta [NumeroDePlazas=" + NumeroDePlazas + ", ColorVehiculo=" + ColorVehiculo + ", NumRuedas="
				+ NumRuedas + ", Cilindrada=" + Cilindrada + ", Potencia=" + Potencia + "]";
	}

	@Override
	public double pagarRodaje() {
		// TODO Auto-generated method stub
		return super.pagarRodaje() + (1.24 * getPotencia());
	}

	@Override
	public double pagarCarburante() {
		// TODO Auto-generated method stub
		return super.pagarCarburante()+ Precio_Gasolina*pideLitros();
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

