
public class Carta implements Comparable<Carta> {
	
	private valorEnum valor;
	private paloEnum palo;
	
	
	public Carta(valorEnum valor, paloEnum palo) {
		
		this.valor = valor;
		this.palo = palo;
	}


	public valorEnum getValor() {
		return valor;
	}

	public void setValor(valorEnum valor) {
		this.valor = valor;
	}


	public paloEnum getPalo() {
		return palo;
	}


	public void setPalo(paloEnum palo) {
		this.palo = palo;
	}
	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + ", getValor()=" + getValor() + ", getPalo()=" + getPalo()
				+ "]";
	}


	public int compareTo(Carta o) {
		int comparar = this.valor.compareTo( o.valor);
		if(comparar!=0) {
			return comparar;
		}
		return 0;
	}
}
