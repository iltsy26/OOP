
public class PryamParallelepiped extends Mnogougolnik implements IDrawable {
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
	
	public void Draw() {
		String s = 
						"    *********\n"+
						"   *       **\n"+
						"  *       * *\n"+
						" *       *  *\n"+
						"*********   *\n"+
						"*       *  *\n"+
						"*       * *\n"+
						"*       **\n"+
						"*********\n";
		System.out.println(s);
	}
	
	public String Str() {
		return "������: ������������� �������������� " + "A = " + A + "B = " + B +  "� = " + C;
	}
}


