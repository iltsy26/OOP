package Lab2;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		������� ���������� = �������.�������������();
		System.out.println("������� ����� � ������!");
		System.out.println("������������� �������:");
		System.out.print("��� > ");
		String ����	= sc.nextLine();
		System.out.print("�������������� ����� ������� > ");
		String ������	= sc.nextLine();
		������ ���������� = new ������(����, ������);
		int �������� = 0;
		do {
			System.out.print("��������� " + ����������.��� + ", �������� ��������: \n1 - ����� ��������\n" +
							 "2 - ������ ��������\n3 - ����� ��������\n" + "0 - �����\n ��� �����>");
			�������� = sc.nextInt();
			switch(��������){
			case 1: ����������.�������();
			break;
			case 2:
				System.out.print("��� �������� ?> ");
				String ���1 = sc.next();
				����������.������������(���1, ����������);
				break;
			case 3:
				System.out.print("��� �������� ?> ");
				String ���2 = sc.next();
				����������.�����������(���2, ����������);
				break;
			default:break;
			}
		} while (�������� != 0);
		
		sc.close();
		System.out.println("�������. ������ ���������!");
			}
	}
