package MainTask;

import java.util.Scanner;

public class WorkExample {

	public static void main(String[] args) {
		FilmLibrary task = new FilmLibrary();
		Scanner sc = new Scanner(System.in);
		int operation = 0;
		do {
			System.out.print("�������� ��������: 1 - �������� ���������� � ������, 2 - �������� ������, 3 - ���������� ������ > ");
			operation = sc.nextInt();
			switch(operation) {
			case 1:
				System.out.print("������� ����� ������ > ");
				String filmNum = sc.next();
				System.out.print("������� ����� ����� (1-�������, 2 - �����, 3 - �������) > ");
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
					System.out.println("����� ����������� � ��������!");
				break;
			case 2:
				System.out.print("������� ����� ������ > ");
				String filmNum1 = sc.next();
				System.out.print("������� ����� ����� (1-�������, 2 - �����, 3 - �������) > ");
				String genNum1 = sc.next();
				task.DropFilm(filmNum1,genNum1);
				break;
			case 3:
				System.out.print("������� ����� ������ > ");
				String filmNum2 = sc.next();
				System.out.print("������� ����� ����� (1-�������, 2 - �����, 3 - �������) > ");
				String genNum2 = sc.next();
				String gen = "";
				if(Integer.parseInt(genNum2) == 1 )
					gen = "Comedy";
				else if(Integer.parseInt(genNum2) == 2)
					gen = "Horror";
			    else if(Integer.parseInt(genNum2) == 3)	
			    	gen = "Action";
				System.out.print("������� �������� ������ > ");
				String filmName = sc.next();
				System.out.print("������� ��� �������� > ");
				String producerName = sc.next();
				System.out.print("������� ������� �������� > ");
				String producerSername = sc.next();
				String producer = producerName +" " + producerSername;
				System.out.print("������� ��� ������ ������ �� ������ > ");
				String year = sc.next();
				task.AddFilm(filmNum2, genNum2, filmName, gen, producer, year);
				break;
			default: break;
			}
		} while (operation != 0);
	}

}
