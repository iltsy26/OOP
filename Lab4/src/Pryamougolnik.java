
public class Pryamougolnik extends Mnogougolnik {
	protected Double A;
	protected Double B;
	
	public Pryamougolnik(String pFigName, String pFigColor, Double pA, Double pB) {
		super(pFigName, pFigColor);
		A = pA;
		B = pB;
		Shape = 4;
		Vertex = 4;
	}
	
	@Override
	public Double Mnogougolnik_P() {
		return (this.A + this.B) * 2;
	}
	
	@Override
	public Double Mnogougolnik_S() {
		return this.A * this.B;
	}
}
