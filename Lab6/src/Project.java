import java.util.ArrayList;

public class Project {
	String PrNum;
	String PrName;
	ArrayList<String> Tasks;

	public Project(String pNum, String pName, ArrayList<String> pTask)
	{
		PrNum = pNum;
		PrName = pName;
		Tasks = pTask;
	}
	
	public static <A> void PrintInf(A a) {
		System.out.print(a);
	}
}
