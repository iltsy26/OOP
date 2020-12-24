package MainTask;

import java.util.Scanner;

public class WorkExample {

	public static void main(String[] args) {
		FilmLibrary task = new FilmLibrary();
		Scanner sc = new Scanner(System.in);
		int operation = 0;
		do {
			System.out.print("¬ыберите операцию: 1 - просмотр информации о фильме, 2 - удаление фильма, 3 - добавление фильма > ");
			operation = sc.nextInt();
			switch(operation) {
			case 1:
				System.out.print("¬ведите номер фильма > ");
				String filmNum = sc.next();
				System.out.print("¬ведите номер жанра (1-комедии, 2 - ужасы, 3 - боевики) > ");
				String genNum = sc.next();
				FilmInfo film = task.getFilm(new TableInfo(filmNum, genNum));
				if(film != null)
				{
					System.out.println(film.FilmName);
					System.out.println(film.genre);
					System.out.println(film.Producer);
					System.out.println(film.ReleaseYear);
				}
				else
					System.out.println("‘ильм отсутствует в каталоге!");
				break;
			case 2:
				System.out.print("¬ведите номер фильма > ");
				String filmNum1 = sc.next();
				System.out.print("¬ведите номер жанра (1-комедии, 2 - ужасы, 3 - боевики) > ");
				String genNum1 = sc.next();
				task.DropFilm(filmNum1,genNum1);
				break;
			case 3:
				System.out.print("¬ведите номер фильма > ");
				String filmNum2 = sc.next();
				System.out.print("¬ведите номер жанра (1-комедии, 2 - ужасы, 3 - боевики) > ");
				String genNum2 = sc.next();
				String gen = "";
				if(Integer.parseInt(genNum2) == 1 )
					gen = "Comedy";
				else if(Integer.parseInt(genNum2) == 2)
					gen = "Horror";
			    else if(Integer.parseInt(genNum2) == 3)	
			    	gen = "Action";
				System.out.print("¬ведите название фильма > ");
				String filmName = sc.next();
				System.out.print("¬ведите им€ режисера > ");
				String producerName = sc.next();
				System.out.print("¬ведите фамилию режисера > ");
				String producerSername = sc.next();
				String producer = producerName +" " + producerSername;
				System.out.print("¬ведите год выхода фильма на экраны > ");
				String year = sc.next();
				task.AddFilm(filmNum2, genNum2, filmName, gen, producer, year);
				break;
			default: break;
			}
		} while (operation != 0);
	}

}
