import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;



public class grafixMask {
	

	public int[] sortedAreas(String[] rectangles)
	{
		///init grid to false.
		 boolean[][] grid = new boolean[400][600];
		
		 for(int g = 0; g < 400; g++){
			 for(int h = 0; h < 600; h++)
			 {
				 grid[g][h] = true; ///Assigns the specified boolean value to each element of the specified array of booleans. 
		    }
		 }
		 
		 for(int i = 0; i<rectangles.length; i++)
			{
			 String[] result = rectangles[i].split("\\s"); /// result[0] is x1. result[1] is y1. result[2] is x2. result[3] is y2.
			 for(int j = Integer.parseInt(result[0]); j<=Integer.parseInt(result[2]); j++)
			 {
				 for(int k = Integer.parseInt(result[1]); k<=Integer.parseInt(result[3]); k++)
				 {
					 grid[j][k] = false;
					 
				 }	
			 }		 
			}
		 
		 ArrayList<Integer> al = new ArrayList<Integer>();
		 Stack<State> sta = new Stack<State>(); 		 
		 int[] dx = {-1,1,0,0};
		 int[] dy = {0,0,-1,1};
		 for(int x = 0; x<400; x++)
			{
			 for(int y = 0; y<600; y++)
			 {	  
				 int result = 0;
				 if (grid[x][y])
				 {					 
					 sta.push(new State(x,y));
				 }
				 	 
					 while (sta.empty() == false) {
						  
						  State s = sta.pop();
						  if(s.x < 0 || s.y < 0 || s.x >= 400 || s.y >= 600 || !grid[s.x][s.y])continue;
						  grid[s.x][s.y] = false;
						  result++;
					      for(int k = 0; k < dx.length; k++){
					             int a = s.x+dx[k];
					             int b = s.y+dy[k];				             
					             sta.push(new State(a,b));
					           }
					 }
				 if(result != 0)al.add(result);    
				 }
				 }
				 
				
			 
			
		 int[] ret = new int[al.size()];
		    for(int i = 0; i < al.size(); i++){
		      ret[i] = ((Integer)al.get(i)).intValue();
		    }
		    Arrays.sort(ret);
		 
		//int[] duck = {1,0,1};
		return ret;
	}
	
	class State{
	    int x, y;
	    State(int xx, int yy){x = xx; y = yy;}
	  }
	

	public static void main(String[] a) {
	    new grafixMask().runTestCase(0);
	    new grafixMask().runTestCase(1);
	    new grafixMask().runTestCase(2);
	    new grafixMask().runTestCase(3);
	    new grafixMask().runTestCase(4);
	  }
	 
	  public void runTestCase(int nbr) {
	    switch(nbr) {
	      case 0 : {
	        checkOutput(sortedAreas(new String[] {"0 292 399 307"}), new int[] { 116800,  116800 }, 0); break;
	      }
	      case 1 : {
	        checkOutput(sortedAreas(new String[] {"48 192 351 207", "48 392 351 407", "120 52 135 547", "260 52 275 547"}), new int[] { 22816,  192608 }, 1); break;
	      }
	      case 2 : {
	        checkOutput(sortedAreas(new String[] {"0 192 399 207", "0 392 399 407", "120 0 135 599", "260 0 275 599"}), new int[] { 22080,  22816,  22816,  23040,  23040,  23808,  23808,  23808,  23808 }, 2); break;
	      }
	      case 3 : {
	        checkOutput(sortedAreas(new String[] {"50 300 199 300", "201 300 350 300", "200 50 200 299", "200 301 200 550"}), new int[] { 1,  239199 }, 3); break;
	      }
	      case 4 : {
	        checkOutput(sortedAreas(new String[] {"0 20 399 20", "0 44 399 44", "0 68 399 68", "0 92 399 92",  "0 116 399 116", "0 140 399 140", "0 164 399 164", "0 188 399 188",  "0 212 399 212", "0 236 399 236", "0 260 399 260", "0 284 399 284",  "0 308 399 308", "0 332 399 332", "0 356 399 356", "0 380 399 380",  "0 404 399 404", "0 428 399 428", "0 452 399 452", "0 476 399 476",  "0 500 399 500", "0 524 399 524", "0 548 399 548", "0 572 399 572",  "0 596 399 596", "5 0 5 599", "21 0 21 599", "37 0 37 599",  "53 0 53 599", "69 0 69 599", "85 0 85 599", "101 0 101 599",  "117 0 117 599", "133 0 133 599", "149 0 149 599", "165 0 165 599",  "181 0 181 599", "197 0 197 599", "213 0 213 599", "229 0 229 599",  "245 0 245 599", "261 0 261 599", "277 0 277 599", "293 0 293 599",  "309 0 309 599", "325 0 325 599", "341 0 341 599", "357 0 357 599",  "373 0 373 599", "389 0 389 599"}), new int[] { 15,  30,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  45,  100,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  115,  200,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  230,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  300,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345,  345 }, 4); break;
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
	 
		 
		  