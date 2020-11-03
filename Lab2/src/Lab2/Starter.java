package Lab2;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Магазин мойМагазин = Магазин.Инициализация();
		System.out.println("Магазин готов к работе!");
		System.out.println("Идентификация клиента:");
		System.out.print("ФИО > ");
		String фиоК	= sc.nextLine();
		System.out.print("Индивидуальный номер клиента > ");
		String билетК	= sc.nextLine();
		Клиент покупатель = new Клиент(фиоК, билетК);
		int операция = 0;
		do {
			System.out.print("Уважаемый " + покупатель.фио + ", Выберите действие: \n1 - Вывод Каталога\n" +
							 "2 - Выдача Запчасти\n3 - Заказ Запчасти\n" + "0 - выход\n Ваш выбор>");
			операция = sc.nextInt();
			switch(операция){
			case 1: мойМагазин.Каталог();
			break;
			case 2:
				System.out.print("Код запчасти ?> ");
				String код1 = sc.next();
				мойМагазин.ВыдачаЗаказа(код1, покупатель);
				break;
			case 3:
				System.out.print("Код запчасти ?> ");
				String код2 = sc.next();
				мойМагазин.ЗаказДетали(код2, покупатель);
				break;
			default:break;
			}
		} while (операция != 0);
		
		sc.close();
		System.out.println("Магазин. Работа завершена!");
			}
	}
