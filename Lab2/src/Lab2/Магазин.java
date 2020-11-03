package Lab2;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Vector;

public class Магазин {
	
	Hashtable<Запчасть, Vector<Клиент>> запчасти = new Hashtable<Запчасть, Vector<Клиент>>();
	
	private Магазин() { }
	
	public static Магазин Инициализация() {
		Магазин res = new Магазин();
		Запчасть новый = new Запчасть();
		новый.наименование = "Комплект задних тормозных колодок";
		новый.код = "003";
		новый.цена = "2810 RUB";
		новый.раздел = РазделКаталога.ТормознаяСистема;
		новый.автомобиль = МодельАвто.Renault_Logan;
		новый.состояние = Состояние.ВМагазине;
		res.запчасти.put(новый,new Vector<>());
		
		новый = new Запчасть();
		новый.наименование = "Защита порогов с алюминиевой площадкой";
		новый.код = "001";
		новый.цена = "19669 RUB";
		новый.раздел = РазделКаталога.Кузов;
		новый.автомобиль = МодельАвто.Kia_Rio;
		новый.состояние = Состояние.НаЗаказ;
		res.запчасти.put(новый,new Vector<>());
		
		новый = new Запчасть();
		новый.наименование = "Усилитель электромеханический рулевого управления";
		новый.код = "002";
		новый.цена = "98288 RUB";
		новый.раздел = РазделКаталога.Управление;
		новый.автомобиль = МодельАвто.Лада_Веста;
		новый.состояние = Состояние.НаСкладе;
		res.запчасти.put(новый,new Vector<>());
		
		
		return res;
	}
	
	public void ВыдачаЗаказа(String кодЗапчасти, Клиент клиент) {
		Optional<Entry<Запчасть, Vector<Клиент>>> find =
				запчасти.entrySet().stream().filter(e->e.getKey().код.equals(кодЗапчасти)).findFirst();
		
		if(find.isPresent()) {
			if(find.get().getKey().состояние == Состояние.ВМагазине || find.get().getKey().состояние == Состояние.НаСкладе) {
				find.get().getKey().состояние = Состояние.Выдана;
				find.get().getValue().add(клиент);
				System.out.println("Выдача запчасти зафиксирована.");
				}
			else
				System.out.println("Нет в наличии. Существует возможность получения запчасти на заказ.");
		}
		else
			System.out.println("Запчасть с таким кодом отсутствует в реестре!!!");
	}
	
	public void ЗаказДетали(String кодЗапчасти, Клиент клиент) {
		Optional<Entry<Запчасть, Vector<Клиент>>> find =
				запчасти.entrySet().stream().filter(e->e.getKey().код.equals(кодЗапчасти)).findFirst();
		
		if(find.isPresent()) {
			if(find.get().getKey().состояние == Состояние.НаЗаказ) {
				find.get().getKey().состояние = Состояние.Заказана;
				find.get().getValue().add(клиент);
				System.out.println("Заказ оформлен.");
				}
			else
				System.out.println("Запчасть есть на складе или в магазине.");
		}
		else
			System.out.println("Запчасть с таким кодом отсутствует в реестре!!!");
	}
	
	public void Каталог() {
		запчасти.entrySet().stream().forEach(e->{
			Запчасть tek = e.getKey();
			System.out.println(tek.наименование + "\n" + tek.автомобиль + "\n" + tek.цена + "\n" + tek.код + "\n");
		});
	}
}
