import java.util.Arrays;


public class SRMCards 
{
	public int maxTurns(int[] cards)
	{
		Arrays.sort(cards);
		int count = 0;
		for(int i =0; i< cards.length; i++)
		{
			if(cards[i] == cards[i+1] - 1 && i < cards.length -1)
			{
				count++;
				i++;
			}
			else
			{
			count++;
			}
		}
		
		return count;
		
	}
}
