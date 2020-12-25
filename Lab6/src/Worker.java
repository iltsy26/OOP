
public class Worker {
	String WorkerFIO;
	String WorkerPosition;
	Integer Age;
	Integer ShelfLife;
	
	public Worker(String pFio, String pPos, Integer pAge, Integer pShelf)
	{
		WorkerFIO = pFio;
		WorkerPosition = pPos;
		Age = pAge;
		ShelfLife = pShelf;
	}	
	
	public static <A> void PrintInf(A a) {
		System.out.print(a);
	}
}
