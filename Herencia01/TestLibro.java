package Herencia01;

public class TestLibro {
	public static void main(String[] args) {
		
	
	Libro MiLibro = new Libro(575,15.2f,"El manifiesto negro","Dura","","Frederick Forsyth","Circulo de lectores");
	System.out.println(MiLibro.toString());
	Periodico TuPeriodico= new Periodico(62,1.5f,"Fora de Bigo","14 de Abril de 2023");
	System.out.println(TuPeriodico.toString());
	}

}
