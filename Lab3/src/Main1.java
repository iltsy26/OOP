import java.util.Scanner;

public class Main1 
{

		public static void main(String[] args) 
		{
			
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Set up matrix size, please.");
				int N = scan.nextInt();
				int M = scan.nextInt();
				
				
				MatrixCreate MCreate = new MatrixCreate();
				double[][] mass = MCreate.MatrixCreate(N, M);
				
				System.out.println("Source matrix");
				 for (int i = 0; i < N; i++) 
				 {
				    for (int j = 0; j < M; j++) 
				    {
				        System.out.printf("%.5f", mass[i][j]);
				        System.out.print(" ");
				    }
				    System.out.println();
				 }
				 
				System.out.println();
				 
				double srAr = 0;
				 for (int i = 0; i < N; i++) 
				 {
				    for (int j = 0; j < M; j++) 
				    {
				        srAr += mass[i][j];
				    }
				 }
				 srAr = srAr / (N*M);
				 System.out.println("Average of matrix elements");
				 System.out.printf("%.5f %n",srAr);
				 
				 System.out.println();
				 
				 System.out.println("Mogified Matrix");
				 
				 ChangeMatrix Mod = new ChangeMatrix();
				 double[][] ModMatrix = Mod.ModifiedMatrix(mass, srAr);
				 
				 for (int i = 0; i < N; i++) 
				 {
				    for (int j = 0; j < M; j++) 
				    {
				    	System.out.printf("%.0f", ModMatrix[i][j]);
				        System.out.print(" ");
				    }
				    System.out.println();
				 }
			}
		}
}
