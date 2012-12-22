import java.util.Scanner;


public class NearlyLuckyNumber {
	
	static void isLucky(long N)
	{
		long bar = N;
		int count = 0;
		
		while(bar > 0)
		{
			if((bar % 10 == 4 || bar % 10 == 7))
			{
				count++;
			}
			bar = bar/10;
		}
		if(count==4 || count==7)
		{
           System.out.println("YES");
		}
		else
		{
           System.out.println("NO");
		}
		

	}
	
	public static void main(String[] args) {
	   	Scanner s=new Scanner(System.in);
    	Long a=s.nextLong();
    	isLucky(a);
	}
	

}
