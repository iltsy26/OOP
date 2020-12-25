
public class PravShestiugolnik extends Mnogougolnik implements IDrawable {
	protected Double A;
	
	public PravShestiugolnik(String pFigName, String pFigColor, Double pA) {
		super(pFigName, pFigColor);
		A = pA;
		Shape = 6;
		Vertex = 6;
	}
	
	public void Draw() {
		String s = 
						"    ******  \n"+
						"  *        * \n"+
						" *          *\n"+
						"*            *\n"+
						" *          *\n"+
						"  *        * \n"+
						"    ******   \n";
		System.out.println(s);
	}
	
	public String Str() {
		return "Фигура: Правильный шестиугольник " + "A = " + A;
	}
}
