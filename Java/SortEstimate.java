import java.math.*;

public class SortEstimate {
	
public double howMany(int c, int time)
{
	double hi = 2000000000;
	double lo = 1;
	double n = 0;
	double m = 0;
	while (hi/lo > 1 + 1e-14)
	{
	    m = (hi + lo)/2;
		n = c*m*Math.log(m)/Math.log(2);
		if(n<time)
		{
		lo = m;
		}
		else
		{
			hi = m;
		}
	}
	return lo;	
}

}
