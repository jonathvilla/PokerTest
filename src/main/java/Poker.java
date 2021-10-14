import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
	
	private List<Jugador> jugador = new ArrayList<Jugador>();
	
	public Poker() {
		super();
	}


	public List<Jugador> getJugador() {
		return jugador;
	}

	public void setJugador(List<Jugador> jugador) { 
		this.jugador = jugador;
	}
	
	public String ganador() {
		
	    List<Carta>cartaM = null;
		Jugador jugador =null;
		
		Boolean manoGanadora = null;
		
        cartaM = jugador.getMano();
		
		Collections.sort(jugador.getMano());
		
		for(int i=0; i<=4; i++) {
			if(jugador.getMano().get(i).getValor().getValorNumero() > cartaM.get(i).getValor().getValorNumero()){
				
				manoGanadora = true;
			}
			else {
				manoGanadora = false;
				break;
			}
		}
		
		return jugador.getGanador();
	}
	

	
	
public int verificarPar(List<Carta> cartas ) {
	Collections.sort(cartas);
	int esPar = 0;
	for(int i=1; i<cartas.size(); i++) {
		if(cartas.get(i-1).getValor().getValorNumero()== cartas.get(i).getValor().getValorNumero()) {	
			esPar++;
		}
	}
	return esPar;
}


public Carta cartaAlta(List<Carta>cartas) {	
	return Collections.max(cartas);	
}


/*public boolean par(List<Carta>cartas) {
	boolean par = esparSetpar(cartas) == 1 ? true : false;
	return par;
			
	}*/


	
}
