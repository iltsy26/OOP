
public class PryamParallelepiped extends Mnogougolnik {
	protected Double A;
	protected Double B;
	protected Double C;
	
	public PryamParallelepiped(String pFigName, String pFigColor, Double pA, Double pB, Double pC) {
		super(pFigName, pFigColor);
		A = pA;
		B = pB;
		C = pC;
		Shape = 8;
		Vertex = 12;
	}
	
	@Override
	public Double Mnogougolnik_S() {
		return (this.A * this.B +  this.A * this.C +  this.C * this.B) * 2;
	}
	
	@Override
	public Double Mnogougolnik_V() {
		return this.A * this.B * this.C;
	}
	
	@Override
	public Double Mnogougolnik_L() {
		return (this.A + this.B + this.C) * 4;
	}
	
	@Override
	public Double Mnogougolnik_D() {
		return Math.pow(this.A, 2) + Math.pow(this.B, 2) + Math.pow(this.C, 2);
	}
}
