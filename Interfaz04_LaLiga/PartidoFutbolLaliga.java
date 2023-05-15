package Interfaz04_LaLiga;

public class PartidoFutbolLaliga implements PartidoFutbol {
	
	int golesLocal;
	int golesVisitante;
	String equipoLocal;
	String equipoVisitante;
	@Override
	public void setEquipoLocal(String nombreEquipo) {
		// TODO Auto-generated method stub
		this.equipoLocal= nombreEquipo;
		
	}
	@Override
	public void setEquipoVisitante(String nombreEquipo) {
		// TODO Auto-generated method stub
		this.equipoVisitante=nombreEquipo;
	}
	@Override
	public void setGolesEquipoLocal(int marcador) {
		// TODO Auto-generated method stub
		this.golesLocal=marcador;
		
	}
	@Override
	public void setGolesEquipoVisitante(int marcador) {
		// TODO Auto-generated method stub
		this.golesVisitante=marcador;
	}
	@Override
	public String toString() {
		return "PartidoFutbolLaliga [golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + ", equipoLocal="
				+ equipoLocal + ", equipoVisitante=" + equipoVisitante + "]";
	}

	

}
