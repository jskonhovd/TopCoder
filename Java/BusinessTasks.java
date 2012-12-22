import java.util.ArrayList;
import java.util.Collections;


public class BusinessTasks {

	public static String[] RemoveItemFromArray(String[] array, int index)
	{
	    ArrayList list = CreateStringList(array);
	    list.remove(index);
	    return ConvertToStringArray(list);
	}
	public static ArrayList<String> CreateStringList(String ... values)
	{
	    ArrayList<String> results = new ArrayList<String>();
	    Collections.addAll(results, values);
	    return results;
	}
	public static String[] ConvertToStringArray(ArrayList list)
	{
	    return (String[])list.toArray(new String[0]);
	}
	
	public static int checkIntConstraint(int n) 
	{
		//This method is to make sure n is between 1 and 10000000
		//It will return a 1 if true and a 0 if false.
		int high = 10000000;
		int low = 1;
		int a = 0;
		int b = 0;
		if (n >= low )
		{
			a = 1;
		}
		if (n <= high)
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
	public static int checkElementConstraint(String[] list)
	{
		int control = 0;
		int j = list.length;
		for(int i = 0; i<j; i++)
		{
			String temp = list[i];
			if(temp.matches("^[a-zA-Z]+$"))
			 {
				 control = 1;
			 }
			else
			{
				control = 0;
				break;
			}
			if((temp.length() <= 50) && (temp.length() >= 1))
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
	public static int checkListConstraint(String[] list)
	{
		int j = list.length;
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
	
	static String getTask(String[] list, int n)
	{
		int count = 0;
		String[] newList = list;
		int j = newList.length;	
		int c = checkListConstraint(list);
		int a = checkElementConstraint(list);
		int b = checkIntConstraint(n);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		if((a == 1) && (b == 1) && (c == 1))
		{
			
			while(j != 1)
			{
			for(int i = 0; i<j; i++)
			{		
			 if(n==1)
			 {
				 count = 27;
				 newList[0] = newList[j-1];
				 for(int l = 0; l<j-2; l++)
				 {
					 newList = RemoveItemFromArray(newList,j-1-l);
				 }
				 j = 1;
				 break;
			 }
			 if (count  == n-1)
			 {
				 newList = RemoveItemFromArray(newList,i);
				 count = 0;
				 i = i - 1;
				 j = j - 1;
			 }	
			 count++;
			}
			}
		}
		return newList[0];
	}
	
	public static void main(String[] args) 
	{
		int n = 1000;
		String[] list = {"a","b"};
		String k = getTask(list,n);
		System.out.println(k);

	}
}


