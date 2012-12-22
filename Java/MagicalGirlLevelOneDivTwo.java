import java.util.*;

public class MagicalGirlLevelOneDivTwo {
	
	public double theMinDistance(int d, int x, int y)
	{	
		x = Math.abs(x);
		y = Math.abs(y);
		double xx = Math.max(0, x-d);
		double yy = Math.max(0, y-d);
		//System.out.print("The value of xx ");
		//System.out.println(xx);
		//System.out.print("The value of yy ");
		//System.out.println(yy);
		double ans = Math.sqrt(xx*xx + yy*yy);
		return ans;
	}

	

public static void main(String[] a) {
    new MagicalGirlLevelOneDivTwo().runTestCase(0);
    new MagicalGirlLevelOneDivTwo().runTestCase(1);
    new MagicalGirlLevelOneDivTwo().runTestCase(2);
    new MagicalGirlLevelOneDivTwo().runTestCase(3);
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
        checkOutput(theMinDistance(5,10,10),7.0710678118654755,0); break;
      }
      case 1 : {
          checkOutput(theMinDistance(5,10,3),5,1); break;
        }
      case 2 : {
          checkOutput(theMinDistance(5,-8,-6),3.1622776601683795,2); break;
        }
      case 3 : {
          checkOutput(theMinDistance(5,3,2),0,3); break;
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

