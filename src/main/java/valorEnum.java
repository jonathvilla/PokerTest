
public enum valorEnum {
	
	DOS(2), TRES(3),CUATRO(4),CINCO(5), SEIS(6),SIETE(7),OCHO(8),NUEVE(9),DIEZ(10), J(11), Q(12), K(13), AS(14);

	
	private int valorNumero;
	
	private valorEnum(int valor) {
		this.valorNumero= valor;
	}
	public int getValorNumero() {
		return this.valorNumero;
	}
}
