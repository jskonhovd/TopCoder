import java.util.*;
public class FauxPalindromes {
	
	public boolean isPalindrome(String str)
	{
		boolean ret = true;
		for(int i = 0; i < str.length(); i++)
		{
			int l = str.length();
			if(str.charAt(i) != str.charAt(l-i-1))
			{
				ret = false;
			}
		}

		return ret;
	}
	
	public boolean isFauxPalindrome(String str)
	{
		
		String retStr = str;
		
		retStr = this.buildFauxString(retStr);

		return this.isPalindrome(retStr);
	}
	
	public String buildFauxString(String str)
	{
		String ret = str;
		String temp = "";
		List<String> s = new ArrayList<String>();
		for(int i = 0; i < str.length(); i++)
		{
			if( i+1 < str.length()  && str.charAt(i) == str.charAt(i+1))
			{
				temp = temp + str.charAt(i);
			}
			else
			{
				if(temp != "")
					s.add(temp + str.charAt(i));
				temp = "";
			}
		}
		for(int j = 0; j < s.size(); j++)
		{
			char replaceString  = s.get(j).charAt(0);
			
			ret = ret.replaceFirst(s.get(j), String.valueOf(replaceString));
			
		}
		return ret;
	}
	
    public String classifyIt(String word) {
        
        if(isPalindrome(word))
        	return"PALINDROME";
        
        if(isFauxPalindrome(word))
        	return "FAUX";                       	        	
         
        return "NOT EVEN FAUX";
    }

}


// Powered by FileEdit
// Powered by CodeProcessor
