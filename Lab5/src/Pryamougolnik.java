
public class Pryamougolnik extends Mnogougolnik implements IDrawable {
	protected Double A;
	protected Double B;
	
	public Pryamougolnik(String pFigName, String pFigColor, Double pA, Double pB) {
		super(pFigName, pFigColor);
		A = pA;
		B = pB;
		Shape = 4;
		Vertex = 4;
	}
	
	public void Draw() {
		String s = 
						"********\n"+
					    "*      *\n"+
						"*      *\n"+
						"********\n";
		System.out.println(s);
	}
	
	public String Str() {
		return "Фигура: Прямоугольник " + "A = " + A + "B = " + B;
	}
}
