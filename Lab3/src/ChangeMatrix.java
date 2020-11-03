
public class ChangeMatrix 
{
	public double[][] ModifiedMatrix(double[][] mass, double srAr)
	{
		double[][] ModMatrix = mass;
		for (int i = 0; i < mass.length; i++)
        {
            for (int j = 0; j < mass[i].length; j++)
            {
                if(mass[i][j] < srAr)
                	ModMatrix[i][j] = 0;
                if(mass[i][j] > srAr)
                	ModMatrix[i][j] = 1;
            }
        }
		return ModMatrix;
	}
}
