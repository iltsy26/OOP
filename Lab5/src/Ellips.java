
public class Ellips extends Geometria implements IDrawable {
	protected Double Axis_A;
	protected Double Axis_B;
	
	public Ellips(String pFigName, String pFigColor, Double pA, Double pB) {
		super(pFigName, pFigColor);
		Axis_A = pA;
		Axis_B = pB;
	}
	
	@Override
	public String getFigData() {
		return "Ёллипс: " + this.data;
	}
	
	public void Draw() {
		String s = 
						"          ******* \n"+
						"      **          **\n"+
						"    **              **\n"+
					    "  **                  **\n"+
					    " **                    **\n"+
					    "**                      **\n"+
					    "**                      **\n"+
					    " **                    **\n"+
					    "  **                  **\n"+
						"    **              **\n"+
						"      **          **\n"+
						"          ******* \n";
		System.out.println(s);
	}
	
	public String Str() {
		return "‘игура: Ёллипс " + "A = " + Axis_A + "B = " + Axis_B;
	}
}
