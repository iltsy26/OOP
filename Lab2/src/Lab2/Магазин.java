package Lab2;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Vector;

public class ������� {
	
	Hashtable<��������, Vector<������>> �������� = new Hashtable<��������, Vector<������>>();
	
	private �������() { }
	
	public static ������� �������������() {
		������� res = new �������();
		�������� ����� = new ��������();
		�����.������������ = "�������� ������ ��������� �������";
		�����.��� = "003";
		�����.���� = "2810 RUB";
		�����.������ = ��������������.����������������;
		�����.���������� = ����������.Renault_Logan;
		�����.��������� = ���������.���������;
		res.��������.put(�����,new Vector<>());
		
		����� = new ��������();
		�����.������������ = "������ ������� � ����������� ���������";
		�����.��� = "001";
		�����.���� = "19669 RUB";
		�����.������ = ��������������.�����;
		�����.���������� = ����������.Kia_Rio;
		�����.��������� = ���������.�������;
		res.��������.put(�����,new Vector<>());
		
		����� = new ��������();
		�����.������������ = "��������� ������������������� �������� ����������";
		�����.��� = "002";
		�����.���� = "98288 RUB";
		�����.������ = ��������������.����������;
		�����.���������� = ����������.����_�����;
		�����.��������� = ���������.��������;
		res.��������.put(�����,new Vector<>());
		
		
		return res;
	}
	
	public void ������������(String �����������, ������ ������) {
		Optional<Entry<��������, Vector<������>>> find =
				��������.entrySet().stream().filter(e->e.getKey().���.equals(�����������)).findFirst();
		
		if(find.isPresent()) {
			if(find.get().getKey().��������� == ���������.��������� || find.get().getKey().��������� == ���������.��������) {
				find.get().getKey().��������� = ���������.������;
				find.get().getValue().add(������);
				System.out.println("������ �������� �������������.");
				}
			else
				System.out.println("��� � �������. ���������� ����������� ��������� �������� �� �����.");
		}
		else
			System.out.println("�������� � ����� ����� ����������� � �������!!!");
	}
	
	public void �����������(String �����������, ������ ������) {
		Optional<Entry<��������, Vector<������>>> find =
				��������.entrySet().stream().filter(e->e.getKey().���.equals(�����������)).findFirst();
		
		if(find.isPresent()) {
			if(find.get().getKey().��������� == ���������.�������) {
				find.get().getKey().��������� = ���������.��������;
				find.get().getValue().add(������);
				System.out.println("����� ��������.");
				}
			else
				System.out.println("�������� ���� �� ������ ��� � ��������.");
		}
		else
			System.out.println("�������� � ����� ����� ����������� � �������!!!");
	}
	
	public void �������() {
		��������.entrySet().stream().forEach(e->{
			�������� tek = e.getKey();
			System.out.println(tek.������������ + "\n" + tek.���������� + "\n" + tek.���� + "\n" + tek.��� + "\n");
		});
	}
}
