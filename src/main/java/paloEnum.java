
public enum paloEnum {

	CORAZONES("C"), TREBOL("H"), DIAMANTES("D"), ESPADAS("S");
	
	private String palo;
	
	private paloEnum(String palo) {
		this.palo = palo;
		
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	
	
	
}
