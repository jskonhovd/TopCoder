
public class FortunateNumbers 
{
	public int getFortunate(int[] a, int[] b, int[] c)
	{
		int temp = 0;
		int count = 0;
		boolean[] foo = new boolean[100000];
		
		for(int i = 0; i < foo.length; i++)
		{
			foo[i]=false;
		}

		for(int i = 0; i < a.length; i++)
		{
			for(int j =0; j < b.length; j++)
			{
				for(int k = 0; k<c.length; k++)
				{
					
					temp = a[i] + b[j] + c[k];
					
					if(foo(temp) && !foo[temp])
					{
						foo[temp] = true;
						count++;
					}
			}
			}
		}
		return count;
	}
	boolean foo(int t)
	{
		if(t == 0)
		{
			return false;
		}
		while(t>0)
		{
			if(t%10 != 5 && t%10 !=8)
				return false;
			t = t/10;
		}
		return true;
	}


}
