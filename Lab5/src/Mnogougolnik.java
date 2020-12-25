public class Mnogougolnik extends Geometria {
	protected Integer Shape;
	protected Integer Vertex;
	protected String S_V;
	
	public Mnogougolnik(String pFigName, String pFigColor) {
		super(pFigName, pFigColor);
		Shape = null;
		Vertex = null;
		S_V = "Shapes: " + Shape + " " + "Vertexes: " + Vertex;
	}
	
	@Override
	public String getFigData() {
		return "Многоугольник: " + this.data;
	}
	
	public String getMnogData() {
		return this.S_V;
	}
}
