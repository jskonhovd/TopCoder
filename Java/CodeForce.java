
public class CodeForce {
	public static void main(String[] args) {
		
		String a = "aaaa";
		String b = "aaaA";
		boolean duck = false;
		int foo = 0;
		a = a.toLowerCase();
		b = b.toLowerCase();
		for(int i = 0; i < a.length(); i++)
		{
			
			if(a.charAt(i) != b.charAt(i))
			{
				duck = true;
				if(a.charAt(i) < b.charAt(i))
				{
					foo = -1;
					break;
				}
				else
				{
					foo = 1;
					break;
				}
			}
		}
		if(!duck)
		{
		System.out.println(0);
		}
		else
		{
			System.out.println(foo);
		}
	}
	}


