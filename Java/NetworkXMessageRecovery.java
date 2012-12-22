
public class NetworkXMessageRecovery {
	
	boolean a[][];
	boolean dd[];
	boolean us[];
	int b[];
	int s1;
	
	void init(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			if(!dd[s.charAt(i)])
			{
				dd[s.charAt(i)]= true;
				s1++;
			}
			if(i< s.length() -1)
			{
				if(a[s.charAt(i)][s.charAt(i+1)] == false)
				{
					b[s.charAt(i+1)]++;
					a[s.charAt(i)][s.charAt(i+1)] = true;
				}	
			}
		}
	}
	
	public String recover(String[] m)
	{
		int n = m.length;
		b = new int[256];
		dd = new boolean[256];
		us = new boolean[256];
		a = new boolean[256][256];
		
		s1 = 0;
		for(int i =0; i < n; i++) init(m[i]); 
		String foo = "";
		for(int i = 0; i < s1; i++) {
			for(int j = 'A'; j<= 'z'; j++) {
				if((j <= 'Z' || j >= 'a') && dd[j] && us[j] == false && b[j] == 0) {
					foo = foo + (char)j;
					for(int k = 'A'; k <= 'z'; k++)
						if(a[j][k]) b[k]--;
					us[j] = true;
					break;
				}
			}
				
		}
		
		
		
		return foo;
	}

}
