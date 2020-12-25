
public class Trapecia extends Mnogougolnik {
	protected Double A;
	protected Double B;
	protected Double C;
	protected Double D;
	
	public Trapecia(String pFigName, String pFigColor, Double pA, Double pB, Double pC, Double pD) {
		super(pFigName, pFigColor);
		A = pA;
		B = pB;
		C = pC;
		D = pD;
		Shape = 4;
		Vertex = 4;
	}
	
	@Override
	public Double Mnogougolnik_P() {
		return this.A + this.B +  this.C + this.D;
	}
	
	@Override
	public Double Mnogougolnik_S() {
		return (this.A + this.B)/2*
				Math.sqrt(Math.pow(this.C, 2) - 
						Math.pow((Math.pow((this.B - this.A), 2) + Math.pow(this.C, 2) - Math.pow(this.D, 2))
								/(2*(this.B - this.A)), 2));
	}
}



