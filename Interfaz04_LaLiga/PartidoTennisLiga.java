package Interfaz04_LaLiga;

public class PartidoTennisLiga implements PartidoTennis {
	int puntosLocal;
	int puntosVisitante;
	String EquipoLocal;
	String EquipoVisitante;

	@Override
	public void setEquipoLocal(String nombreEquipo) {
		// TODO Auto-generated method stub
		this.EquipoLocal=nombreEquipo;
	}

	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		// TODO Auto-generated method stub
		this.EquipoVisitante=nombreEquipo;
	}

	@Override
	public void setJuegosLocal(int juegos) {
		// TODO Auto-generated method stub
		this.puntosLocal=juegos;
	}

	@Override
	public void setJuegosVisitante(int juegos) {
		// TODO Auto-generated method stub
		this.puntosVisitante=juegos;
		
	}

	@Override
	public String toString() {
		return "PartidoTennisLiga [puntosLocal=" + puntosLocal + ", puntosVisitante=" + puntosVisitante
				+ ", EquipoLocal=" + EquipoLocal + ", EquipoVisitante=" + EquipoVisitante + "]";
	}
	

}
