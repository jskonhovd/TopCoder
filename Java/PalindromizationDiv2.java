
public class PalindromizationDiv2 
{
	public int getMinimumCost(int duck)
	{
		int foo = 0;
		int bar = 0;
		int n = duck;
		
		while(true)
		{
			if(checkPal(n)) break;
			n--;
			foo++;
		}
		n = duck;
		while(true)
		{
			if(checkPal(n)) break;
			n++;
			bar++;
		}
		int min = (foo > bar)?foo:bar;
		System.out.println(foo);
		System.out.println(bar);
		return min;
	}
	
	public boolean checkPal(int N)
	{
		String s = Integer.toString(N);
		String r = reverse(s);
		if(s.equals(r))
		return true;
		else
		return false;
		}
	
	
	public String reverse(String s)
	{
		
		int i = 0;
		int l = s.length();
		StringBuffer d = new StringBuffer(l);
		for(i = (l-1); i>=0; i--)
		{
			d.append(s.charAt(i));
		}
		
		return d.toString();
	}
}
