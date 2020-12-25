import java.util.Vector;

public class WorkExample {

	public static void main(String[] args) {
		Vector <Mnogougolnik> allMn = new Vector<Mnogougolnik>();
		allMn.add(new Treugolnik("����������� 1", "Blue", 2.0, 3.4, 5.1));
		allMn.add(new PryamParallelepiped("������������ �������������� 1", "Yellow", 6.0, 4.5, 2.005));
		allMn.add(new Trapecia("�������� 1", "Red", 2.0, 0.7, 0.5, 4.5));
		
		Vector <Ellips> allEllips = new Vector<Ellips>();
		allEllips.add(new Ellips("������ 1", "Violet", 6.0, 2.5));
		allEllips.add(new Ellips("������ 2", "Green", 1.1, 1.1));
		allEllips.add(new Ellips("������ 3", "Silver", 5.0, 8.3));
		
		Vector <Geometria> allFig = new Vector<Geometria>();
		allFig.add(new Ellips("������ 1", "Violet", 6.0, 2.5));
		allFig.add(new PravShestiugolnik("���������� ������������� 1", "Maroon", 4.0));
		allFig.add(new Trapecia("�������� 2", "Black", 2.0, 1.4, 5.1, 4.5));
		
		
		System.out.println("� ������ ������ �������� null ��������� ���� ��� ������ �� ��������� ��������������� �����");
		System.out.println();
		System.out.println("����� ���� ���������������");
		System.out.println();
		for(int i = 0; i < allMn.size(); i++)
		{
			System.out.println(allMn.get(i).getFigData());
			System.out.println("�������� ������: ");
			System.out.println(allMn.get(i).Mnogougolnik_P());
			System.out.println("����� ������ ������: ");
			System.out.println(allMn.get(i).Mnogougolnik_V());
			System.out.println();
		}
		
		System.out.println("����� ���� ��������");
		System.out.println();
		for(int i = 0; i < allEllips.size(); i++)
		{
			System.out.println(allEllips.get(i).getFigData());
			System.out.println("�������� ������: ");
			System.out.println(allEllips.get(i).Ellipe_P());
			System.out.println("������� ������: ");
			System.out.println(allEllips.get(i).Ellipe_S());
			System.out.println();
		}
		
		System.out.println("����� ���� �����");
		System.out.println();
		for(int i = 0; i < allFig.size(); i++)
		{
			System.out.println(allFig.get(i).getName());
			System.out.println();
		}
	}

}
