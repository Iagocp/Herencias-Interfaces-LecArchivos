package Interfaz04_LaLiga;

public class Test {
	public static void main(String[] args) {

		PartidoFutbolLaliga pfle = new PartidoFutbolLaliga();
		pfle.setEquipoLocal("Naranjito");
		pfle.setEquipoVisitante("Atenea");
		pfle.setGolesEquipoLocal(4);
		pfle.setGolesEquipoVisitante(2);

		System.out.println("tiempo de juego: " + PartidoFutbol.duracionPartidoFutbol);
		System.out.println(pfle.toString());


		PartidoBaloncestoEuroLiga pbe = new PartidoBaloncestoEuroLiga();
		pbe.setEquipoLocal("Naranjito");
		pbe.setEquipoVisitante("Atenea");
		pbe.setPuntosEquipoLocal(69);
		pbe.setPuntosEquipoVisitante(45);

		System.out.println("tiempo de juego: " + PartidoBaloncesto.duracionPartidoBaloncesto);
		System.out.println(pbe.toString());

		PartidoTennisLiga ptm = new PartidoTennisLiga();
		ptm.setEquipoLocal("Naranjito");
		ptm.setEquipoVisitante("Atenea");
		ptm.setJuegosLocal(6);
		ptm.setJuegosVisitante(2);

		System.out.println(ptm.toString());

}
}