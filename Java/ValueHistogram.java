import java.util.*;
public class ValueHistogram {
	
	public String makeString(int h, int[] num)
	{
		String ret = "";
		for(int i = 0; i < num.length; i++)
		{
			if(h > num[i])
			{
				
				ret = ret + ".";
			}
			else
			{
				ret = ret + "X";
			}
			
		}
		
		return ret;
	}
	
	
	public int findLargest(int[] num)
	{
		int max = 0;
		for(int i =0; i < num.length; i++)
		{
			max = Math.max(max, num[i]);
		}
		return max;
	}
    public String[] build(int[] values) {
        String[] res = {""};
        
        int[] num = new int[10];
        for(int i = 0; i < values.length; i++)
        {
        	num[values[i]]++;
        }
        
        int h = findLargest(num);
        h = h + 1;
        
        List<String> ret = new ArrayList<String>();
        
        while(h > 0)
        {
        	ret.add(makeString(h, num));
        	h--;
        }
        return ret.toArray(new String[0]);
    }
}
