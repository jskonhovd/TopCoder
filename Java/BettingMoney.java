
public class BettingMoney {

	static int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult)
	{
		int sumW = 0;
		for (int x=0; x<amounts.length; x++)
		{
		 if(x != finalResult)
		 {
			 sumW+=amounts[x];		
		 }
		}
		return sumW*100-amounts[finalResult]*centsPerDollar[finalResult];
	}
	public static void main(String[] args) {
		int[] amounts = {10,20,30};
		int[] centsPerDollar = {20,30,40};
		int finalResult = 1;
		int duck = moneyMade(amounts, centsPerDollar, finalResult);
		System.out.println(duck);
	}

}
