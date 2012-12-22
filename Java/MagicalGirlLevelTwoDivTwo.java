
public class MagicalGirlLevelTwoDivTwo {
	public String isReachable(int[] jumpTypes, int x, int y)
	{
		boolean duck = (x+y) % 2 == 0;
		for(int n: jumpTypes)
		{	
			duck |= n % 2 == 0;
		}
			return duck ? "YES": "NO";	
}	
}
