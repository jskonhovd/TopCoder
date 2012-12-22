
import java.util.*;

public class TallPeople {

	static int[] getPeople(String[] people)
	{
		String[] stk = people[0].split("\\s");
		int i = stk.length;
		int y = people.length;
		int min = 0, max = 0;
		int[][] duck =  new int[y][i];
		for (int j=0; j<y; j++)
		{
			String[] st = people[j].split("\\s");
		for (int x=0; x<i; x++)
		{
	         //System.out.println(st[x]);
			 duck[j][x] = Integer.parseInt(st[x]);
		}
		}
		int m[] = new int[y];
		max = 1000;
		for (int j=0; j<y; j++)
		{	
			m[j] = 1000;
			for (int x=0; x<i; x++)
			{
				m[j] = Math.min(duck[j][x], m[j]);	
			}
			min = Math.max(min, m[j]);
		}
		m = new int[i];
		for (int j=0; j<i; j++)
		{	
			m[j] = -1;
			for (int x=0; x<y; x++)
			{
				m[j] = Math.max(duck[x][j], m[j]);	
			}
			max = Math.min(max, m[j]);
		}
		
		
		return new int[] {min, max};
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] people = {"5 6 3 6 4 9 2 1 6 2 6 8 7 7 5 3 2 6 9 9 7 1 3 6 9", "5 1 5 5 3 8 3 2 9 7 6 3 6 6 8 5 1 4 8 9 3 9 2 5 1", "7 7 8 3 2 6 8 4 8 4 8 9 1 3 4 8 1 2 6 7 9 6 4 1 1", "9 1 1 9 3 7 4 1 3 4 7 1 8 9 9 5 5 8 8 9 6 9 5 2 7", "7 7 9 9 2 2 5 4 6 2 8 1 1 5 4 7 1 6 4 2 7 2 1 5 2", "6 6 3 8 9 4 5 3 3 9 1 9 3 4 9 6 6 4 5 8 9 2 7 8 5", "1 6 2 4 1 8 2 2 8 6 3 8 7 5 4 1 4 8 1 7 1 3 3 7 3", "7 7 1 8 8 8 4 2 4 1 8 6 2 4 9 4 2 9 3 3 1 5 5 5 1", "3 5 4 4 6 1 3 2 8 1 6 8 8 8 2 4 2 7 8 7 1 8 7 4 4", "7 6 4 7 4 7 1 6 8 1 5 6 6 3 5 8 3 7 9 7 3 1 8 9 1", "8 6 7 1 5 7 7 1 6 2 6 5 9 5 7 9 8 4 5 6 7 1 3 7 9", "7 7 1 7 4 7 7 5 1 3 1 7 7 7 4 2 2 9 9 3 3 2 1 4 2", "3 3 5 9 7 7 5 6 1 1 8 2 4 6 3 4 7 8 5 2 8 7 4 2 4", "4 7 1 6 9 8 5 6 7 8 9 4 2 4 6 7 5 1 9 7 8 3 5 3 7", "9 9 7 9 2 5 4 6 5 6 4 2 6 8 6 8 1 6 4 9 7 2 8 3 8", "3 2 7 8 8 5 8 4 3 1 8 3 5 5 7 3 7 2 2 1 2 7 3 8 3", "9 6 1 1 6 5 3 3 2 5 3 6 3 2 5 2 4 1 9 7 9 1 8 3 1", "1 8 6 5 8 2 2 9 8 8 1 5 5 8 3 1 7 8 5 5 3 5 2 4 4", "8 2 4 9 2 3 1 5 2 4 2 8 6 7 9 5 2 6 4 1 4 2 9 6 8", "7 7 7 5 4 3 2 1 1 7 6 4 9 2 3 5 8 2 4 5 4 3 5 9 4", "4 4 1 4 6 5 3 7 5 2 8 6 7 2 7 6 4 2 1 8 5 3 7 2 7", "2 6 3 7 5 4 9 9 6 5 2 3 3 1 9 2 5 5 2 5 4 1 2 9 3", "9 5 3 5 8 7 1 9 2 4 5 2 9 4 2 5 8 2 8 2 7 5 6 4 3", "9 7 6 9 4 8 2 8 4 8 2 9 8 6 8 5 7 4 6 1 9 2 1 4 9", "1 2 1 4 2 2 5 2 8 6 4 2 4 3 1 5 5 7 3 6 2 7 8 4 3", "6 6 2 9 6 2 4 7 2 7 4 4 5 3 1 5 1 3 8 7 7 1 4 3 3", "7 8 4 8 2 8 6 2 8 9 7 2 3 8 9 4 9 1 2 5 5 6 3 5 9", "4 7 1 1 7 5 7 5 5 5 4 2 7 3 6 9 7 5 3 7 2 6 6 7 6", "1 9 5 4 3 6 5 6 6 3 7 3 7 1 9 4 8 7 2 5 5 5 3 4 3", "9 5 1 9 2 4 9 8 9 7 1 2 6 9 5 6 5 5 6 7 4 9 4 3 2", "3 4 9 4 1 3 7 4 7 1 5 8 1 3 5 8 6 3 4 2 5 6 8 5 2", "7 7 7 8 4 2 8 9 4 6 6 6 7 9 4 9 1 2 5 3 1 2 8 8 5", "5 2 9 8 2 8 1 6 8 2 8 2 1 1 5 3 2 6 4 1 8 1 5 7 1", "8 4 2 4 7 3 4 2 5 8 6 4 5 2 7 9 5 1 8 7 1 2 6 3 7", "2 4 9 7 8 1 8 9 6 2 4 4 2 4 5 6 3 9 1 7 4 4 8 2 7", "9 5 7 4 9 7 1 5 4 6 4 3 6 2 1 8 7 7 4 8 6 1 4 6 2", "6 7 6 7 3 6 3 6 6 9 8 2 7 7 1 5 7 3 3 9 1 4 4 5 4", "1 3 5 9 1 8 2 1 3 7 6 6 9 5 3 7 4 9 9 9 4 2 6 7 8", "3 3 9 5 3 4 9 3 9 2 5 5 5 4 6 3 1 2 4 5 2 3 7 8 8", "1 8 5 1 1 8 8 6 4 2 5 5 9 8 1 6 4 1 6 5 9 8 2 8 8", "8 5 2 6 7 4 4 7 7 3 8 3 2 9 9 9 5 8 8 5 2 2 3 3 6", "3 1 3 7 4 7 9 5 5 9 8 5 8 1 8 5 8 5 2 8 2 5 6 2 3", "9 8 6 4 9 1 9 4 8 7 1 4 8 1 5 7 3 8 8 1 9 7 2 2 6", "2 9 7 4 3 6 1 8 8 7 5 1 7 6 6 9 7 6 4 2 5 5 4 3 9", "5 7 5 8 3 7 7 6 3 6 6 9 7 5 3 5 9 5 1 9 5 5 8 2 7", "7 7 1 3 9 2 9 2 6 2 1 4 9 1 4 4 4 5 4 5 3 4 6 9 3", "5 5 5 8 3 4 7 5 4 6 1 5 1 4 2 3 1 9 1 9 3 4 9 4 2", "1 9 7 8 5 9 7 6 5 5 2 1 7 2 4 2 2 5 3 5 5 3 1 5 4", "3 9 5 1 4 5 3 9 8 9 5 7 3 8 1 2 6 9 7 8 3 4 9 4 1", "3 3 9 1 9 2 2 9 6 5 4 8 7 1 7 1 2 2 5 5 5 2 3 6 5"};
		//int a = checkPeopleConstraint(people);
		//int c = checkElementConstraint(people);
		int[] b = getPeople(people);
		//System.out.println(a);
		//System.out.println(c);
		for (int x=0; x<b.length; x++)
			System.out.println(b[x]);
		
	}
	
	public static int checkPeopleConstraint(String[] people)
	{
		//Checks the number of elements in people.
		int j = people.length;
		int high = 50;
		int low = 2;
		int a = 0;
		int b = 0;
		if (j >= low )
		{
			a = 1;
		}
		if (j <= high)
		{
			b = 1;
		}
		if ((a == 1) && (b == 1))
		{
			 return 1;
		}
		else
		{
			return 0;
		}		
	}
	public static int checkElementConstraint(String[] people)
	{
		int control = 0;
		int j = people.length;
		for(int i = 0; i<j; i++)
		{
			String temp = people[i];
			if(temp.matches("^[0-9]+$"))
			 {
				 control = 1;
			 }
			else
			{
				control = 0;
				break;
			}
			if((temp.length() <= 50) && (temp.length() >= 3))
			{
				control = 1; 
			}
			else
			{
				
				control = 0;
				break;
			}
		}
		return control;		
	}

}
