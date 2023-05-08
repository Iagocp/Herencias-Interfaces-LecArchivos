package Herencia3;

import java.awt.Color;

@SuppressWarnings("rawtypes")
public class Camion extends Vehiculo implements Comparable, EstacionServicio {
	private byte NumeroDeEjes;

	Camion(byte NumeroDeRuedas) {
		super(NumeroDeRuedas);
	}

	Camion(Color color, byte NumeroDeRuedas) {
		super(color, NumeroDeRuedas);
	}

	Camion(Color color, byte NumeroDeRuedas, short Cilindrada) {
		super(color, NumeroDeRuedas, Cilindrada);
	}

	Camion(Color color, byte NumeroDeRuedas, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);

	}

	Camion(Color color, byte NumeroDeRuedas, byte NumeroDeEjes, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
		EstableceNumeroDeEjes(NumeroDeEjes);
	}

	public byte DimeNumeroDeEjes() {
		return NumeroDeEjes;
	}

	public void EstableceNumeroDeEjes(byte NumeroDeEjes) {
		this.NumeroDeEjes = NumeroDeEjes;
	}

	public byte getNumeroDeEjes() {
		return NumeroDeEjes;
	}

	public void setNumeroDeEjes(byte numeroDeEjes) {
		NumeroDeEjes = numeroDeEjes;
	}

	@Override
	public String toString() {
		return "Camion [NumeroDeEjes=" + NumeroDeEjes + ", ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas
				+ ", Cilindrada=" + Cilindrada + ", Potencia=" + Potencia + "]";
	}

	@Override
	public double pagarRodaje() {
		// TODO Auto-generated method stub
		return super.pagarRodaje() + (2.17 * getCilindrada());
	}

	@Override
	public double pagarCarburante() {
		// TODO Auto-generated method stub
		return super.pagarCarburante() + Precio_Gasoil*pideLitros();
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