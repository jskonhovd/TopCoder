
public class test {

	static  int  gcd(int a, int b)
    {
    	if(b==0)
    	{
    		return a;
    	}
    	else
    	{
    		return gcd(b, a%b);
    	}
    }
	 static boolean isPrime(int N)
	    {
	    	for( int i = 2; i*i <=N; i++)
	    	{
	    		if(N%i == 0)
	    		{
	    			return false;
	    		}
	    	}
	    	return true;
	    }
	public static void main(String[] args) {
		int N  = 8;
		int t = 4;
		int p = (int)(Math.sqrt((double)t) + 0.5);
		if(p*p == t && isPrime(p) && N >= p*p)
		{
		while(N%p == 0)
			N /= p;
		if(N==1)
			System.out.println("Yes");
		}
		boolean k = isPrime(6);
		System.out.print(p);
	}

}
