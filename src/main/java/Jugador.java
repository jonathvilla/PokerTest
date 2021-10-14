import java.util.List;

public class Jugador {

	private String player;
	private List<Carta>mano;

	public Jugador(List<Carta> mano) {
		super();
		this.mano = mano;
	}

	public List<Carta> getMano() {
		return mano;
	}

	@Override
	public String toString() {
		return "Jugador [mano=" + mano + ", getMano()=" + getMano() + "]";
	}

	public void setMano(List<Carta> mano) {
		this.mano = mano;
	}
	
	
}
