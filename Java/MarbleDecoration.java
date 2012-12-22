import java.util.Arrays;
public class MarbleDecoration {
	
	public int maxLength(int r, int g, int b)
	{
		int duck[] = {r,g,b};
		Arrays.sort(duck);
		int max = duck[2];
		int min = duck[1];
		int count = 2*duck[1];
		if (max > min)
		{
			count++;
		}
		return count;
		
	}

}
