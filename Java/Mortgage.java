import java.lang.Math;
import java.util.*;
import java.awt.geom.*;

public class Mortgage {

public int monthlyPayment(int loan, int interest, int term)
{
	long lo = 0;
	long hi = loan;
	long m = 0;
	
	
	while(lo <= hi)
	{
		
		m = (lo+hi)/2;
		long temp = loan;
		for(int i = 0; i < term * 12; i++)
		{	
			
			temp -= m;
			if(temp <= 0)
			{			
			break;
			}
			temp = (long) Math.ceil((double)temp*(1+(double)interest/12000.));
		}
        if(temp<=0)
        {
        hi = m - 1;
        }
        else
        {
        lo = m + 1;
        }		
	}
	return (int)lo;
}

}