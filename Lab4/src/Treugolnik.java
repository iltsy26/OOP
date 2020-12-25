
public class Treugolnik extends Mnogougolnik {
	protected Double A;
	protected Double B;
	protected Double C;
	
	public Treugolnik(String pFigName, String pFigColor, Double pA, Double pB, Double pC) {
		super(pFigName, pFigColor);
		A = pA;
		B = pB;
		C = pC;
		Shape = 3;
		Vertex = 3;
	}
	
	@Override
	public Double Mnogougolnik_P() {
		return this.A + this.B +  this.C;
	}
	
	@Override
	public Double Mnogougolnik_S() {
		return Math.sqrt(Mnogougolnik_P()/2 * (Mnogougolnik_P()/2 - this.A) * (Mnogougolnik_P()/2 - this.B) * (Mnogougolnik_P()/2 - this.B));
	}
}
