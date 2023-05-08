package Herencia2;

import java.awt.Color;
import java.util.Arrays;

public class Cuadrado extends Figura {
	private double[] Lados = new double[2];

	Cuadrado(double[] Lados) {
		EstableceLados(Lados);
	}

	Cuadrado(double[] Lados, Color color) {
		super(color);
		EstableceLados(Lados);
	}

	public void EstableceLados(double[] Lados) {
		this.Lados[0] = Lados[0];

	}

	public double[] DimeLados() {
		return Lados;
	
	}

	@Override
	public String toString() {
		return "Cuadrado [Lados=" + Arrays.toString(Lados) + "]";
	}
	
	

}
