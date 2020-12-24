package MainTask;

public class TableInfo {

	private String FilmNum;
	private String GenreKey;
	
	public TableInfo(String pFnum, String pGnum)
	{
		FilmNum = pFnum;
		GenreKey = pGnum;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(!(ob instanceof TableInfo))
			return false;
		TableInfo a = (TableInfo)ob;
		if((this.FilmNum.equals(a.FilmNum)) && (this.GenreKey.equals(a.GenreKey)))
			return true;
		return false;
	}
	
	@Override
	public int hashCode() 
	{
		int res = 1;
		res = res * 31 + FilmNum.length();
		res = res * 31 + GenreKey.length();
		return res;
	}
}
