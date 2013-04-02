using System;
 
public class CandyShop
{
  public int countProbablePlaces(int[] X, int[] Y, int[] R)
  {
		int duck = 0;
	for(int i = -100; i<=100; i++)
		{
			for(int j = -100; j <=100; j++)
			{
				int z = 0;
				for(int z = 0; z < X.GetLength; z++)
				{
					if(Math.Abs(X[z] - i) + Math.Abs(Y[z] - j) > R[z])
					   break;
				}
				if( z == X.GetLength)
					duck++;
			}	
		}
		return duck;
	}
}
	
