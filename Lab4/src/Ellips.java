
public class Ellips extends Geometria {
	protected Double Axis_A;
	protected Double Axis_B;
	
	public Ellips(String pFigName, String pFigColor, Double pA, Double pB) {
		super(pFigName, pFigColor);
		Axis_A = pA;
		Axis_B = pB;
	}
	
	@Override
	public String getFigData() {
		return "έλλθορ: " + this.data;
	}
	
	public Double Ellipe_S() {
		return Math.PI * Axis_A * Axis_B;
	}
	
	public Double Ellipe_P() {
		return 2*Math.PI * Math.sqrt((Math.pow(Axis_A, 2) * Math.pow(Axis_B, 2))/2);
	}
}
