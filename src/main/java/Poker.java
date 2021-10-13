import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
	
	private List<Carta> cartas = new ArrayList<Carta>();
	
	public Poker() {
		super();
	}

	public Poker(List<Carta> cartas) {
		super();
		this.cartas = cartas;
	}
	
	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
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
