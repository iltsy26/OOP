package MainTask;


public class FilmInfo {

	public FilmInfo(String pFname, String pGenre, String pFprod, String pFYear)
	{
		FilmName = pFname;
		arg0 = pGenre;
		genre = Genres.valueOf(arg0);
		Producer = pFprod;
		ReleaseYear = pFYear;
	}
	
	public String FilmName;
	public String arg0;
	public Genres genre;
	public String Producer;
	public String ReleaseYear;
}
