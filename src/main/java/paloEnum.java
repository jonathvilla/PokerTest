
public enum paloEnum {

	TREBOL(1), CORAZONES(2), DIAMANTES(3), ESPADAS(4);
	
	private int palo;
	
	private paloEnum(int palo) {
		this.palo = palo;
		
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}
	
	
	
	
}
