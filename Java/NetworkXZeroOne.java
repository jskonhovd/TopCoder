
public class NetworkXZeroOne 
{
	public String reconstruct(String message)
	{
		int l = message.length();
		int x = 0;
		int o = 0;
		int q = 0;
		StringBuffer d = new StringBuffer(l);
		for(int i = 0; i < l; i++)
		{
			if(message.charAt(i) == '?')
			{
				if(x<o)
				{
					d.append('x');
					x++;
					continue;
				}
				if(o<x)
				{
					d.append('o');
					o++;
					continue;
				}
				if(x == o)
				{
					d.append('o');
					o++;
					continue;
				}
			}
			if(message.charAt(i) == 'x')
			{
				d.append('x');
				x++;
			}
			if(message.charAt(i) == 'o')
			{
				d.append('o');
				o++;
			}
		}
		return d.toString();
	}

}
