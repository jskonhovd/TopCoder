

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class Circuits {
	int howLong(String[] connects, String[] costs)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		Stack<State> sta = new Stack<State>(); 	
		int cost[][] = new int[connects.length][costs.length];
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		boolean edge[][] = new boolean[connects.length][costs.length];
		boolean vertex[] = new boolean[connects.length];
		int resultT[] = new int[connects.length];
		
		 for(int g = 0; g < connects.length; g++)
		 {
		 for(int h = 0; h < costs.length; h++)
			 {
				 edge[g][h] = false; ///Assigns the specified boolean value to each element of the specified array of booleans. 
		     }
		 }
		
		for(int i = 0; i<connects.length; i++)
		{
			if(!connects[i].equals(""))
			{
				String[] t1 = connects[i].split("\\s");
				String[] t2 = costs[i].split("\\s");
				for (int x=0; x<t1.length; x++)
				{
					cost[i][Integer.parseInt(t1[x])] = Integer.parseInt(t2[x]);
					
				}
	
			}				
		}
		for (int y=0; y<cost.length; y++)
		{
		for (int z=0; z<cost.length; z++)
		{	
		 int result = 0;
		 if (!edge[y][z] && cost[y][z] != 0)
		 {					 
			 sta.push(new State(y,z));
		 }
		while (sta.empty() == false) 
		{
			State s = sta.pop();
			if(s.x < 0 || s.y < 0 || s.x >= cost.length || s.y >= cost.length || edge[s.x][s.y] || cost[s.x][s.y] == 0)continue;
			  //System.out.print("We are visiting ---  ");
			  //System.out.print(s.x);
			  //System.out.print("-");
			  //System.out.print(s.y);


			  if(vertex[s.x] == false)
			  {
				  resultT[s.x] = result;
				  result = result + cost[s.x][s.y];
				  vertex[s.x] = true;
			  }
			  else
			  {
			  result = resultT[s.x];
			  result = result + cost[s.x][s.y];
			  }
				  
			  //System.out.print("---Result:");
			 // System.out.print(result);
			 // System.out.print("---VResult:");
			 // System.out.println(resultT[s.x]);
			  if(vertex[s.y] == false)
			  {
				  al.add(result);
				  
			  }
			  edge[s.x][s.y] = true;
			  vertex[s.x] = true;
			  
			  
		      for(int k = 0; k < costs.length; k++){
		             int a = s.y;
		             int b = k;		
		             vertex[s.y] = false;
		     		for(int j = 0; j < costs.length; j++)
		    		{
		    			edge[s.y][j] = false;
		    		}
		             sta.push(new State(a,b));
		           }
		}
		//System.out.println("out of while --- ");
		for(int j = 0; j < costs.length; j++)
		{
			vertex[j] = false;
		}
		//System.out.print(y);
		//System.out.print(" --- ");
		//System.out.println(z);
		}
		}
		
		int[] ret = new int[al.size()];
		    for(int i = 0; i < al.size(); i++){
		      ret[i] = ((Integer)al.get(i)).intValue();
		    }
		    Arrays.sort(ret);
		    int duck = 0;
		    if(ret.length > 0)
		    {
		    duck = ret[ret.length - 1];
		    }
		    
		
		return duck;
	}
	class State{
	    int x, y;
	    boolean z;
	    State(int xx, int yy){x = xx; y = yy;}
	  }
	public static void main(String[] a) {
	    new Circuits().runTestCase(0);
	    new Circuits().runTestCase(1);
	    new Circuits().runTestCase(2);
	    //new grafixMask().runTestCase(1);
	    //new grafixMask().runTestCase(2);
	    //new grafixMask().runTestCase(3);
	    //new grafixMask().runTestCase(4);
	  }
	 
	  public void runTestCase(int nbr) {
	    switch(nbr) {
	      case 0 : {
	        checkOutput(howLong(new String[] {"1 2 3 4 5","2 3 4 5","3 4 5","4 5","5",""}, new String[] {"2 2 2 2 2","2 2 2 2","2 2 2","2 2","2",""}), 10, 0); break;
	      }
	      case 1 : {
		        checkOutput(howLong(new String[] {"1", "2", "3", "", "5", "6", "7", ""}, new String[] {"2", "2", "2", "", "3", "3", "3", ""}), 9, 1); break;
		      }
	      case 2 : {
		        checkOutput(howLong(new String[]  	{"", "2 3 5", "4 5", "5 6", "7", "7 8", "8 9", "10", "10 11 12", "11", "12", "12", ""}, new String[] {"", "3 2 9", "2 4", "6 9", "3", "1 2", "1 2", "5", "5 6 9", "2", "5", "3", ""}), 22, 2); break;
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

