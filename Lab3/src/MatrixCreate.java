import java.util.Random;

public class MatrixCreate 
{
	public double[][] MatrixCreate(int N, int M)
    {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis()); 
        double[][] mass = new double [N][M];
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                mass[i][j] = r.nextDouble();
            }
        }
        return mass;
    }
    
}
