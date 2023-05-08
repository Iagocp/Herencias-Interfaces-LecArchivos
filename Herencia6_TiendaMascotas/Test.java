package Herencia6_TiendaMascotas;

import java.util.ArrayList;



public class Test {
	
	public static void main(String[] args) {
		ArrayList<Mascota> animales = new ArrayList<Mascota>();
		{
		PerroGrande pg = new PerroGrande(45,true,"Rocky",5,"Negro",PerroGrande.razas.DOBERMAN);
		PerroMed pm = new PerroMed(30,false,"Budy",8,"Marrón",PerroMed.razas.BULLDOG);
		PerroPequeño pp = new PerroPequeño(10,true,"TOOCACOJONES",1,"Marrón",PerroPequeño.razas.CHIHUAHUA);
		GatoSinPelo gs = new GatoSinPelo(75,75,5,"Tous","Carne",GatoSinPelo.pelajes.ESFINGE);
		GatoPeloLargo gl = new GatoPeloLargo(64,65,8,"Kitty","Gris",GatoPeloLargo.pelajes.SOMALÍ);
		GatoPeloCorto gc = new GatoPeloCorto(55,55,10,"Puskas","Negro",GatoPeloCorto.pelajes.AZUL_RUSO);
		Perros p = new Perros(20, false, "Manolo", 6, "Verde");
		Gatos g = new Gatos(55, 55, 5, "Peaches", "Azul");
		Mascota ma = new Mascota("Piolin", 3 , "Amarillo") {
			
			@Override
			public String Sonido() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		animales.add(ma);
		animales.add(p);
		animales.add(g);
		animales.add(pg);
		animales.add(pm);
		animales.add(pp);
		animales.add(gs);
		animales.add(gl);
		animales.add(gc);

		for (Mascota m : animales) {
			System.out.println(m.toString());
			if(m instanceof Perros|| m instanceof Gatos)   System.out.println(m.Sonido());
		}
			
		

	}
	}

}
