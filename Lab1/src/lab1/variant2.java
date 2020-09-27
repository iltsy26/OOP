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
		System.out.print("¬ведите количество чисел > ");
		N = sc.nextInt();
		
		double a;
		for(int i = 0; i < N; i++) {
			System.out.print("¬ведите число " + String.valueOf(i+1) +" > ");
			a = sc.nextDouble();
			if ((a>0) && (a<10))
            {
            	aa.add(a);
            }
            else
            {
            	System.out.print("¬ведите число " + String.valueOf(i+1) +" (не выходите за границы интервала от 0 до 10) > ");
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
		System.out.println("результат: ");
		for (int i = 0; i < N; i++)
        {
        	c += aa.get(i);
        	b = Math.pow((c-(i+1)), 2);
        	System.out.println(b);
        }
	}
}
