package Interfaz04_LaLiga;

public class PartidoBaloncestoEuroLiga implements PartidoBaloncesto {
	int puntosLocal;
	int puntosVisitante;
	String equipoVisitante;
	String equipoLocal;
	

	@Override
	public void setEquipoLocal(String nombreEquipo) {
		// TODO Auto-generated method stub
		this.equipoLocal=nombreEquipo;
		
	}

	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		// TODO Auto-generated method stub
		this.equipoVisitante= nombreEquipo;
	}

	@Override
	public void setPuntosEquipoLocal(int marcador) {
		// TODO Auto-generated method stub
		this.puntosLocal=marcador;
		
	}

	@Override
	public void setPuntosEquipoVisitante(int marcador) {
		// TODO Auto-generated method stub
		this.puntosVisitante=marcador;
	}

	@Override
	public String toString() {
		return "PartidoBaloncestoEuroLiga [puntosLocal=" + puntosLocal + ", puntosVisitante=" + puntosVisitante
				+ ", equipoVisitante=" + equipoVisitante + ", equipoLocal=" + equipoLocal + "]";
	}

	
}
