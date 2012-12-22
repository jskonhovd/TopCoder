import java.util.Arrays;


public class HairCuts {
public double maxCut(String[] enter, String lastExit)
{
	double lo = 0;
	double hi = 600;
	double m = 0;
	int h = 0;
	int mm = 0;
	int l = enter.length;
	double exit = 0;
	double[] foo = new double[l];
	for(int i = 0; i<l; i++)
	{
	 String[] result = enter[i].split(":");
	 h = Integer.parseInt(result[0]);
	 mm = Integer.parseInt(result[1]);
	 if(h<9)
	 {
		 h +=12;
	 }
	 foo[i] = h*60 + mm;
	}
	Arrays.sort(foo);
	String[] result = lastExit.split(":");
	h = Integer.parseInt(result[0]);
	mm = Integer.parseInt(result[1]);
	if(h<9)
	 {
		 h +=12;
	 }
	exit = h*60 + mm;
	
	
	while(hi/lo > 1 + 1e-14)
	{
	m = (hi + lo)/2;
	boolean over = true;
	for(int i =0; i<foo.length; i++)
	{
		if(exit - foo[i] < m*(foo.length - i))
		{
			over = false;
		}
	}
    if(over)
    {
        lo = m;
    }
    else
    {
        hi = m;
    }
	}
	
	double d = (lo + hi)/2;
	if(d<5.0)
	{
		return -1;
	}
	return d;

}
}
