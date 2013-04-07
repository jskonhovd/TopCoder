// BEGIN CUT HERE

// END CUT HERE
import java.util.*;
public class TheNumberGameDiv2 {
	
    public int minimumMoves(int A, int B) {
        int res= 0;
        HashMap<Integer, Integer> dis = new HashMap<Integer, Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        dis.put(A, 0);               
        pq.add(A);
        while(!pq.isEmpty())
        {
        	int x = pq.peek();
        	pq.poll();
        	int[] y = {x/10 , Integer.parseInt(reverse(Integer.toString(x), ""))};
        	for(int i =0; i<y.length; i++)
        	{
        		if(!dis.containsKey(y[i]))
        		{
        			dis.put(y[i],dis.get(x) + 1);
        			pq.add(y[i]);
        		}
        	}        	        	
        }
        if(dis.containsKey(B))
		{
        	res = dis.get(B);        
		}
        else
        {
        	res = -1;
        }
       
        return res;
    }
    
    public String reverse(String a1,String b1)
	{
    	if(a1.length() == 0)
		{
			return b1;			
		}		
		return reverse(a1.substring(1,a1.length()), a1.charAt(0) + b1 );				
	}

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new TheNumberGameDiv2()).minimumMoves(25, 5),2);
            eq(1,(new TheNumberGameDiv2()).minimumMoves(5162, 16),4);
            eq(2,(new TheNumberGameDiv2()).minimumMoves(334, 12),-1);
            eq(3,(new TheNumberGameDiv2()).minimumMoves(218181918, 9181),6);
            eq(4,(new TheNumberGameDiv2()).minimumMoves(9798147, 79817),-1);
            eq(5,(new TheNumberGameDiv2()).minimumMoves(134534135, 53), 8);
        } catch( Exception exx) {
            System.err.println(exx);
            exx.printStackTrace(System.err);
        }
    }
    private static void eq( int n, int a, int b ) {
        if ( a==b )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected "+b+", received "+a+".");
    }
    private static void eq( int n, char a, char b ) {
        if ( a==b )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected '"+b+"', received '"+a+"'.");
    }
    private static void eq( int n, long a, long b ) {
        if ( a==b )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected \""+b+"L, received "+a+"L.");
    }
    private static void eq( int n, boolean a, boolean b ) {
        if ( a==b )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected "+b+", received "+a+".");
    }
    private static void eq( int n, String a, String b ) {
        if ( a != null && a.equals(b) )
            System.err.println("Case "+n+" passed.");
        else
            System.err.println("Case "+n+" failed: expected \""+b+"\", received \""+a+"\".");
    }
    private static void eq( int n, int[] a, int[] b ) {
        if ( a.length != b.length ) {
            System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
            return;
        }
        for ( int i= 0; i < a.length; i++)
            if ( a[i] != b[i] ) {
                System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
                print( b );
                print( a );
                return;
            }
        System.err.println("Case "+n+" passed.");
    }
    private static void eq( int n, long[] a, long[] b ) {
        if ( a.length != b.length ) {
            System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
            return;
        }
        for ( int i= 0; i < a.length; i++ )
            if ( a[i] != b[i] ) {
                System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
                print( b );
                print( a );
                return;
            }
        System.err.println("Case "+n+" passed.");
    }
    private static void eq( int n, String[] a, String[] b ) {
        if ( a.length != b.length) {
            System.err.println("Case "+n+" failed: returned "+a.length+" elements; expected "+b.length+" elements.");
            return;
        }
        for ( int i= 0; i < a.length; i++ )
            if( !a[i].equals( b[i])) {
                System.err.println("Case "+n+" failed. Expected and returned array differ in position "+i);
                print( b );
                print( a );
                return;
            }
        System.err.println("Case "+n+" passed.");
    }
    private static void print( int a ) {
        System.err.print(a+" ");
    }
    private static void print( long a ) {
        System.err.print(a+"L ");
    }
    private static void print( String s ) {
        System.err.print("\""+s+"\" ");
    }
    private static void print( int[] rs ) {
        if ( rs == null) return;
        System.err.print('{');
        for ( int i= 0; i < rs.length; i++ ) {
            System.err.print(rs[i]);
            if ( i != rs.length-1 )
                System.err.print(", ");
        }
        System.err.println('}');
    }
    private static void print( long[] rs) {
        if ( rs == null ) return;
        System.err.print('{');
        for ( int i= 0; i < rs.length; i++ ) {
            System.err.print(rs[i]);
            if ( i != rs.length-1 )
                System.err.print(", ");
        }
        System.err.println('}');
    }
    private static void print( String[] rs ) {
        if ( rs == null ) return;
        System.err.print('{');
        for ( int i= 0; i < rs.length; i++ ) {
            System.err.print( "\""+rs[i]+"\"" );
            if( i != rs.length-1)
                System.err.print(", ");
        }
        System.err.println('}');
    }
    private static void nl() {
        System.err.println();
    }
// END CUT HERE
}
