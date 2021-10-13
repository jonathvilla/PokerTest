
public enum GanadorEnum {
	
	MAYOR(1), PAR(2), DOSPARES(3),TERNA(4), ESCALERA(5), COLOR(7), FULL(8), POKER(9), ESCALERACOLOR(10);
	
	private int ganador;

	private GanadorEnum(int ganador) {
		this.ganador = ganador;
	}
	
	public int getganador() {
		return ganador;
	}

}
