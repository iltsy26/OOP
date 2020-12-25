import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		System.out.print("");
		Worker W1 = new Worker("Petrov A. P.", "Manager", 35, 8);
		Worker W2 = new Worker("Antonov V. A.", "Engeener", 45, 15);
		Worker W3 = new Worker("Sverdlova A. E.", "Accountant", 25, 4);
		ArrayList<String> Tasks1 = new ArrayList<>();
		Tasks1.add("Task1");
		Tasks1.add("Task2");
		Tasks1.add("Task3");
		Tasks1.add("Task4");
		Project P1 = new Project("1-01", "Project 1", Tasks1);	
		Project P2 = new Project("1-02", "Project 2", Tasks1);	
		OfficeEquip Eq1 = new OfficeEquip(11, "Kyosera P21", "Принтер", "Свободен");
		OfficeEquip Eq2 = new OfficeEquip(12, "HP L-400", "Принтер", "В работе");
		OfficeEquip Eq3 = new OfficeEquip(21, "Acer A45", "ПК", "Свободен");
		OfficeEquip Eq4 = new OfficeEquip(22, "Apple Mac mini", "ПК", "Требует ремонта");
		OfficeEquip Eq5 = new OfficeEquip(31, "Lenovo ideapad 330", "Ноутбук", "Свободен");	
		System.out.println("Вывод имени и номера проекта с помощью метода println обощенного метода и обобщенного класса:");
		System.out.println(P1.PrNum + " " + P1.PrName);
		P1.PrintInf(P1.PrNum);
		P1.PrintInf(" ");
		P1.PrintInf(P1.PrName);
		System.out.println();
		PrintSinglInf<String> A1 = new PrintSinglInf<String>(P1.PrName);
		PrintSinglInf<String> A2 = new PrintSinglInf<String>(P1.PrNum);
		A2.getInf();
		A1.getInf();
		
		System.out.println();
		System.out.println("Вывод информации о проекте 2");
		P2.PrintInf(P2.PrNum + " " + P2.PrName + "\n");
		W1.PrintInf(W1.WorkerFIO + " " + W1.WorkerPosition + "\n");
		W1.PrintInf(W1.Age);
		System.out.println();
		W1.PrintInf(W1.ShelfLife);
		System.out.println();
		PrintSinglInf<String> B1 = new PrintSinglInf<String>(Eq1.EqName);
		PrintSinglInf<String> B2 = new PrintSinglInf<String>(Eq1.EqType);
		B1.getInf();
		B2.getInf();
	}

}
