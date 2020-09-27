package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class variant1 {
	public static void DoVariant1()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("¬ведите количество чисел > ");
		int N = sc.nextInt();
		
		double a;
		ArrayList<Double> aa = new ArrayList();
		
		for (int i = 0; i < N; i++)
        {
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
		
		double b = 0;
		//¬ведЄм дополнительную переменную с (в нее будут записыватьс€ суммы a(i)) 
		double c = 0;
        System.out.println("результат: ");
        for (int i = 0; i < N; i++)
        {
        	c += aa.get(i);
        	b = Math.pow((c-(i+1)), 2);
        	System.out.println(b);
        }
        
        sc.close();
	}
}
