
public class PravShestiugolnik extends Mnogougolnik {
	protected Double A;
	
	public PravShestiugolnik(String pFigName, String pFigColor, Double pA) {
		super(pFigName, pFigColor);
		A = pA;
		Shape = 6;
		Vertex = 6;
	}
	
	@Override
	public Double Mnogougolnik_P() {
		return 6 * this.A;
	}
	
	@Override
	public Double Mnogougolnik_S() {
		return 3 * Math.sqrt(3) / 2 * Math.pow(this.A, 2);
	}
}
