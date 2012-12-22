
public class AutoLoan {

	public double interestRate(double price, double monthlyPayment, int loanTerm)
	{
		double lo = 1e-16;
		double hi = 1000;
		double m = 0;
		while(hi/lo > 1 + 1e-14)
		{
			m = (hi + lo)/2;
			double P = price;
			boolean over = false;
			for(int i = 0; i< loanTerm; i++)
			{
				P *= 1+m;
				P -= monthlyPayment;
				if(P<0)
				{
					over = true;
					break;
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
		
		return m*100*12;
	}
}
