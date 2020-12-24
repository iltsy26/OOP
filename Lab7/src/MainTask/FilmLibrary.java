package MainTask;

import java.util.Hashtable;

public class FilmLibrary {

	private Hashtable<TableInfo, FilmInfo> data;
	
	public FilmLibrary()
	{
		data = new Hashtable<TableInfo, FilmInfo>();
		data.put(new TableInfo("1", "1"),
				new FilmInfo("Intouchables", "Comedy", "Olivier Nakache", "2011"));
		data.put(new TableInfo("2", "1"),
				new FilmInfo("The Cabin in the Woods", "Comedy", "Drew Goddard", "2012"));
		data.put(new TableInfo("3", "1"),
				new FilmInfo("Major Payne", "Comedy", "Nick Castle", "1995"));
		
		data.put(new TableInfo("1", "2"),
				new FilmInfo("Saw", "Horror", "James Wan", "2000"));
		data.put(new TableInfo("2", "2"),
				new FilmInfo("The Conjuring", "Horror", "James Wan", "2013"));
		
		data.put(new TableInfo("1", "3"),
				new FilmInfo("The Mechanic", "Action", "Simon West", "2010"));
		data.put(new TableInfo("2", "3"),
				new FilmInfo("Riddick", "Action", " David Neil Twohy", "2013"));
	
	}
	
	public FilmInfo AddFilm(String Fn, String Gn, String name, String gen, String prod, String year)
	{
		TableInfo t1 = new TableInfo(Fn, Gn);
		FilmInfo f1 = new FilmInfo(name, gen, prod, year);
		return data.put(t1, f1);
	}
	
	/*public FilmInfo DropFilm(String Fn, String Gn, String name, String gen, String prod, String year)
	{
		TableInfo t1 = new TableInfo(Fn, Gn);
		//FilmInfo f1 = new FilmInfo(name, gen, prod, year);
		return data.remove(t1);
	}*/
	
	public FilmInfo DropFilm(String Fn, String Gn)
	{
		TableInfo t1 = new TableInfo(Fn, Gn);
		return data.remove(t1);
	}
			
	public FilmInfo getFilm(TableInfo ob) {
		if (data.containsKey(ob))
			return data.get(ob);
		else return null;
	}
}
