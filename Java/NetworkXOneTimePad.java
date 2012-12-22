import java.util.HashSet;
import java.util.Set;

public class NetworkXOneTimePad 
{
	public int crack(String[] p, String[] c)
	{	
		String foo = "";
		Set<String> set = new HashSet<String>();
		
		for(int i =0; i <p.length; i++)
		{
			for(int j =0; j<c.length; j++)
			{
				foo = "";
				for(int k =0; k<p[i].length(); k++)
				{
					if(p[i].charAt(k) != c[j].charAt(k))
					{
						foo+= '1';
					}
					else
					{
						foo +='0';
					}
				}			
				set.add(foo);
		}
		}	
		return set.size();	
	}
}
