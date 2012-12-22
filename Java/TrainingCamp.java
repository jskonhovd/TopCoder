
public class TrainingCamp {
	String[] determineSolvers(String[] a, String[] p)
	{
		int n = a.length;
		int k = p.length;
		boolean pato = true;
		String duck[] = new String[a.length];
		for(int i = 0; i<n; i++)
		{
			String s = "";
			for(int j = 0; j<k; j++)
			{
				pato = true;
				for(int r =0; r<p[j].length(); r++)
				{
					if(p[j].charAt(r) == 'X' && a[i].charAt(r) == '-')
					{
						pato = false;
						break;		
					}
				}	
					if(pato)
					{
						s += 'X';
					}
					else
					{
						s += '-';
					}
				
			}
			duck[i] = s;
		}
		return duck;	
	}
	

}
