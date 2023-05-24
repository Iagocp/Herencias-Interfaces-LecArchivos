package LecturaArchivo;

public class Notas {
	double[] ListaNotas;
	
	public double Notas() {
		double suma=0;
		for(Double n : ListaNotas) suma +=n;
		return suma/ListaNotas.length;
	}
	
	@SuppressWarnings("unused")
	double calcularPromedio() {
		double prom=calcularPromedio();
		double suma=0;
		for(int i=0;i< ListaNotas.length;i++) {
			suma += Math.pow(ListaNotas[i] - i, suma);
		}
		return Math.sqrt(suma/ListaNotas.length);
	}
	
	

}
