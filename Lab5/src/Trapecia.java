
public class Trapecia extends Mnogougolnik implements IDrawable {
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
	
	public void Draw() {
		String s = 
						"  ****\n"+
					    " *    *\n"+
						"*      *\n"+
						"********\n";
		System.out.println(s);
	}
	
	public String Str() {
		return "Фигура: Трапеция " + "A = " + A + "B = " + B + "C = " + C + "D = " + D;
	}
}



