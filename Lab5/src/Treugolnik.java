
public class Treugolnik extends Mnogougolnik implements IDrawable {
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
	
	public void Draw() {
		String s = 
						"    *    \n"+
						"   * *   \n"+
						"  *   *  \n"+
						" ******* \n";
		System.out.println(s);
	}
	
	public String Str() {
		return "Фигура: треугольник " + "A = " + A + "B = " + B + "C = " + C;
	}
}
