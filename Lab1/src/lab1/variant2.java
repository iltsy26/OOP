package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class variant2 {
	private ArrayList<Double> aa = new ArrayList<Double>();
	private int N;
	
	public void InputArray()
	{
		aa.clear();
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� > ");
		N = sc.nextInt();
		
		double a;
		for(int i = 0; i < N; i++) {
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
		sc.close();
	}
	
	public void PrintResult()
	{
		double c = 0;
		double b = 0;
		System.out.println("���������: ");
		for (int i = 0; i < N; i++)
        {
        	c += aa.get(i);
        	b = Math.pow((c-(i+1)), 2);
        	System.out.println(b);
        }
	}
}
