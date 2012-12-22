import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CBR85d2
{
		public static void ifSame(String a, String b)
		{
		boolean duck = false;
		int foo = 0;
		a = a.toLowerCase();
		b = b.toLowerCase();
		for(int i = 0; i < a.length(); i++)
		{
			
			if(a.charAt(i) != b.charAt(i))
			{
				duck = true;
				if(a.charAt(i) < b.charAt(i))
				{
					foo = -1;
					break;
				}
				else
				{
					foo = 1;
					break;
				}
			}
		}
		if(!duck)
		{
		System.out.println(0);
		}
		else
		{
		System.out.println(foo);
		}
		}
		
        public static void main(String[] args) {
        	Scanner s=new Scanner(System.in);
        	String a=s.nextLine();
        	String b=s.nextLine();
        	a=a.toLowerCase();
        	b=b.toLowerCase();
        	ifSame(a,b);
        }
}