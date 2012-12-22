import java.util.*;


public class Marketing {
	
	boolean adj[][] = new boolean[64][64];
	int color[] = new int[64];
	boolean oddcycle = false;
	int n;
	
	long howMany(String[] compete)
	{

		n = compete.length;
		
		for(int i = 0; i<compete.length; i++)
		{
			if(!compete[i].equals(""))
			{
				String[] t1 = compete[i].split("\\s");
				
				for (int x=0; x<t1.length; x++)
				{
					adj[i][Integer.parseInt(t1[x])] = true;
					adj[Integer.parseInt(t1[x])][i] = true;		
				}
			}				
		}	
		for (int i = 0; i < n; i++) color[i] = 0;
		
		int ncomp = 0;
		for (int i = 0; i < n; i++)
		{
			if (color[i] == 0) 
			{
				ncomp++;
				dfs(i, 1);
			}
		}
			if (oddcycle)
			{
			      return -1;
			}
			long res = 1;
			while (ncomp-- > 0) 
				{
				res *= 2;		
				}
			return res;
	}
	void dfs(int u, int c)
	{
	  if (color[u] != 0) 
	  {
		  if (color[u] != c) //if the color of the child is the same as the parent, then there is an odd cycle.
		  oddcycle = true;
	      return;
	  }
		
		color[u] = c; //mark current node as visited and assign color.
		for (int v = 0; v < n; v++)
		{
			if (adj[u][v]) // if true, then recursively call the dfs and assign a new color to the neighbors.
			{
				dfs(v, 3 - c);
			}
		}
		
	}

	public static void main(String[] a) {
	    new Marketing().runTestCase(0);
	    //new Marketing().runTestCase(1);
	   // new Marketing().runTestCase(2);
	    //new grafixMask().runTestCase(1);
	    //new grafixMask().runTestCase(2);
	    //new grafixMask().runTestCase(3);
	    //new grafixMask().runTestCase(4);
	  }
	 
	  public void runTestCase(int nbr) {
	    switch(nbr) {
	      case 0 : {
	        checkOutput(howMany(new String[] {"1 4", "2", "3", "0", ""}), 2, 0); break;
	      }
	    }
	  }
	  final void checkOutput(int mine, int them, int nbr) {
	    boolean success = (mine==them);
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append(mine);
	      out.append(", Expected: ");
	      out.append(them);
	    }
	    System.out.println(out);
	  }
	  final void checkOutput(long mine, long them, int nbr) {
	    boolean success = (mine==them);
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append(mine);
	      out.append(", Expected: ");
	      out.append(them);
	    }
	    System.out.println(out);
	  }
	  final void checkOutput(double mine, double them, int nbr) {
	    boolean success = doubleCompare(mine, them);
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append(mine);
	      out.append(", Expected: ");
	      out.append(them);
	    }
	    System.out.println(out);
	  }
	  private static boolean doubleCompare(double expected, double result){
	    double MAX_DOUBLE_ERROR = 1E-9;
	    if(Double.isNaN(expected)){
	      return Double.isNaN(result);
	    }else if(Double.isInfinite(expected)){
	      if(expected > 0){
	        return result > 0 && Double.isInfinite(result);
	      }else{
	        return result < 0 && Double.isInfinite(result);
	      }
	    }else if(Double.isNaN(result) || Double.isInfinite(result)){
	      return false;
	    }else if(Math.abs(result - expected) < MAX_DOUBLE_ERROR){
	      return true;
	    }else{
	      double min = Math.min(expected * (1.0 - MAX_DOUBLE_ERROR),
	        expected * (1.0 + MAX_DOUBLE_ERROR));
	      double max = Math.max(expected * (1.0 - MAX_DOUBLE_ERROR),
	          expected * (1.0 + MAX_DOUBLE_ERROR));
	      return result > min && result < max;
	    }
	  }
	  final void checkOutput(char mine, char them, int nbr) {
	    boolean success = (mine==them);
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append("'");
	      out.append(mine);
	      out.append("'");
	      out.append(", Expected: ");
	      out.append("'");
	      out.append(them);
	      out.append("'");
	    }
	    System.out.println(out);
	  }
	  final void checkOutput(String mine, String them, int nbr) {
	    boolean success = (mine.equals(them));
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append("\"");
	      out.append(mine);
	      out.append("\"");
	      out.append(", Expected: ");
	      out.append("\"");
	      out.append(them);
	      out.append("\"");
	    }
	    System.out.println(out);
	  }
	  final void checkOutput(long[] mine, long[] them, int nbr) {
	    boolean success = (Arrays.equals(mine, them));
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append("{");
	      for(int x=0;x<mine.length;x++) {
	        out.append(mine[x]);
	        if(x<mine.length-1) out.append(", ");
	      }
	      out.append("}");
	      out.append(", Expected: ");
	      out.append("{");
	      for(int x=0;x<them.length;x++) {
	        out.append(them[x]);
	        if(x<them.length-1) out.append(", ");
	      }
	      out.append("}");
	    }
	    System.out.println(out);
	  }
	  final void checkOutput(char[] mine, char[] them, int nbr) {
	    boolean success = (Arrays.equals(mine, them));
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append("{");
	      for(int x=0;x<mine.length;x++) {
	        out.append(mine[x]);
	        if(x<mine.length-1) out.append(", ");
	      }
	      out.append("}");
	      out.append(", Expected: ");
	      out.append("{");
	      for(int x=0;x<them.length;x++) {
	        out.append(them[x]);
	        if(x<them.length-1) out.append(", ");
	      }
	      out.append("}");
	    }
	    System.out.println(out);
	  }
	  final void checkOutput(double[] mine, double[] them, int nbr) {
	    boolean success = (Arrays.equals(mine, them));
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append("{");
	      for(int x=0;x<mine.length;x++) {
	        out.append(mine[x]);
	        if(x<mine.length-1) out.append(", ");
	      }
	      out.append("}");
	      out.append(", Expected: ");
	      out.append("{");
	      for(int x=0;x<them.length;x++) {
	        out.append(them[x]);
	        if(x<them.length-1) out.append(", ");
	      }
	      out.append("}");
	    }
	    System.out.println(out);
	  }
	  final void checkOutput(int[] mine, int[] them, int nbr) {
	    boolean success = (Arrays.equals(mine, them));
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append("{");
	      for(int x=0;x<mine.length;x++) {
	        out.append(mine[x]);
	        if(x<mine.length-1) out.append(", ");
	      }
	      out.append("}");
	      out.append(", Expected: ");
	      out.append("{");
	      for(int x=0;x<them.length;x++) {
	        out.append(them[x]);
	        if(x<them.length-1) out.append(", ");
	      }
	      out.append("}");
	    }
	    System.out.println(out);
	  }
	  final void checkOutput(String[] mine, String[] them, int nbr) {
	    boolean success = (Arrays.equals(mine, them));
	    StringBuffer out = new StringBuffer();
	    out.append("Example ");
	    out.append((nbr+1));
	    out.append(" - ");
	    out.append(success ? "success" : "failure   ");
	    if(!success) {
	      out.append("Got: ");
	      out.append("{");
	      for(int x=0;x<mine.length;x++) {
	        out.append(mine[x]);
	        if(x<mine.length-1) out.append(", ");
	      }
	      out.append("}");
	      out.append(", Expected: ");
	      out.append("{");
	      for(int x=0;x<them.length;x++) {
	        out.append(them[x]);
	        if(x<them.length-1) out.append(", ");
	      }
	      out.append("}");
	    }
	    System.out.println(out);
	  }
	 
	/** end cut - don't modify this line*/
	}


