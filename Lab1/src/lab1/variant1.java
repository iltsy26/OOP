package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class variant1 {
	public static void DoVariant1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� > ");
		int N = sc.nextInt();
		
		double a;
		ArrayList<Double> aa = new ArrayList();
		
		for (int i = 0; i < N; i++)
        {
            System.out.print("������� ����� " + String.valueOf(i+1) +" > ");
            a = sc.nextDouble();
            if ((a>0) && (a<10))
            {
            	aa.add(a);
            }
            else
            {
            	System.out.print("������� ����� " + String.valueOf(i+1) +" (�� �������� �� ������� ��������� �� 0 �� 10) > ");
                a = sc.nextDouble();
                aa.add(a);
            }
        }
		
		double b = 0;
		//����� �������������� ���������� � (� ��� ����� ������������ ����� a(i)) 
		double c = 0;
        System.out.println("���������: ");
        for (int i = 0; i < N; i++)
        {
        	c += aa.get(i);
        	b = Math.pow((c-(i+1)), 2);
        	System.out.println(b);
        }
        
        sc.close();
	}
}
