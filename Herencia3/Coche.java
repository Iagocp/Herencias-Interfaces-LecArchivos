package Herencia3;

import java.awt.Color;

@SuppressWarnings("rawtypes")
public class Coche extends Vehiculo implements Comparable, EstacionServicio {
	@SuppressWarnings("unused")
	private int NumPuertas;

	Coche(byte NumeroDeRuedas) {
		super(NumeroDeRuedas);
	}

	Coche(Color color, byte NumeroDeRuedas) {
		super(color, NumeroDeRuedas);
	}

	Coche(Color color, byte NumeroDeRuedas, short Cilindrada) {
		super(color, NumeroDeRuedas, Cilindrada);
	}

	Coche(Color color, byte NumeroDeRuedas, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);

	}

	Coche(Color color, byte NumeroDeRuedas, int NumPuertas, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
		setNumeroDeEjes(NumRuedas);
	}

	public byte getNumeroDeEjes() {
		return NumRuedas;
	}

	public void setNumeroDeEjes(byte numeroDeEjes) {
		NumRuedas = numeroDeEjes;
	}

	@Override
	public String toString() {
		return "Coche [NumeroDeEjes=" + NumRuedas + ", ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas
				+ ", Cilindrada=" + Cilindrada + ", Potencia=" + Potencia + "]";
	}

	@Override
	public double pagarRodaje() {
		// TODO Auto-generated method stub
		return super.pagarRodaje();
	}

	@Override
	public double pagarCarburante() {
		// TODO Auto-generated method stub
		if(esDiesel()) return super.pagarCarburante() +Precio_Gasoil*pideLitros();
		else return	super.pagarCarburante()+ Precio_Gasolina*pideLitros();
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
