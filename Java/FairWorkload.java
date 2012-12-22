import java.math.*;

public class FairWorkload {
	
public int getMostWork(int[] folders, int workers)
{
	int lo = 0;
	int hi = 0;
	int n = folders.length; 
	for(int i = 0; i < n; i++)
	{
		hi += folders[i];
	}
	for(int i = 0; i < n; i++)
	{
		if(lo <= folders[i])
		{
			lo = folders[i];
		}
	}		
	while(lo < hi)
	{
	int m = lo + (hi - lo)/2;
	int l = 0;
	int r = 1;		
	for(int i = 0; i<n; i++)
	{
		if(l + folders[i] <= m)
		{
			l += folders[i];
		}
		else
		{
			++r;
			l = folders[i];
		}
	}
	if(r <= workers)
	{
		hi = m;
	}
	else
	{
		lo = m + 1 ;
	}
	}
	return lo;		
}
}
