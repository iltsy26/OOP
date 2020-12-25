public class Geometria {
	protected String figName;
	protected String figColor;
	protected String data;
	
	
	public Geometria (String pFigName, String pFigColor)
	{
		figName = pFigName;
		figColor = pFigColor;
	    data = figName + " " + figColor;
	}
	
	public String getFigData() {
		return this.data;
	}
	
	public String getName() {
		return this.figName;
	}
}
