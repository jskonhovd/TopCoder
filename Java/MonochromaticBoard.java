
// BEGIN CUT HERE
/*
// PROBLEM STATEMENT
// There is a HxW rectangular board divided into 1x1 cells. Initially each cell is colored White. Fox Ciel wants to change the color of certain cells on the board. You are given a String[] board consisting of characters 'B' and 'W'. If the j-th character of the i-th element of board is 'B', she must change the color of cell (i, j) to Black, otherwise this cell must remain White.


Fox Ciel can perform the following operation:


1. Choose one row or one column.

2. Paint the row or the column she chose in step 1 with Black. The color of all cells in the row or the column becomes Black.


Return the minimal number of operations required to change the color to board. The constraints will guarantee that it's always possible.

DEFINITION
Class:MonochromaticBoard
Method:theMin
Parameters:String[]
Returns:int
Method signature:int theMin(String[] board)


CONSTRAINTS
-board will contain between 1 and 50 elements, inclusive.
-Each element of board will contain the same number of characters.
-Each element of board will contain between 1 and 50 characters, inclusive.
-Each character in board will be 'W' or 'B'.
-board can be obtained by performing the operation described in the statement 0 or more times.


EXAMPLES

0)
{"WBWBW",
 "BBBBB",
 "WBWBW",
 "WBWBW"}

Returns: 3

Paint row 1 (0-indexed), column 1 and column 3.

1)
{"BBBB",
 "BBBB",
 "BBBB"}

Returns: 3

Paint all rows.

2)
{"BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB",
 "BBBBB"}

Returns: 5

Paint all columns.

3)
{"WW",
 "WW"}

Returns: 0



4)
{"BBBBBBBB",
 "BBBBBBBB",
 "BBBBBBBB",
 "WBWBBBWB",
 "BBBBBBBB"}

Returns: 9
*/


// END CUT HERE
public class MonochromaticBoard {
    public int theMin(String[] board) {
    	int H = board.length;
    	int W = board[0].length();
    	int br = 0;
    	int bc = 0;
    	boolean bar = true;
    	int foo = 0;
    		for(int i = 0; i<H; i++)
    		{
    			bar = true;
    			for(int j = 0; j < W; j++)
    			{
    				if(board[i].charAt(j) != 'B')
    				{
    					bar = false;
    					break;
    				}
    			}
    			if(bar)
    			{
    				br++;
    			}
    		}
    		bar = true;
    		for(int i = 0; i<W; i++)
    		{
    			bar = true;
    			for(int j =0; j<H; j++)
    			{
    				if(board[j].charAt(i) != 'B')
    				{
    					bar = false;
    					break;
    				}
    			}
    			if(bar)
    			{
    				bc++;
    			}
    		}
    		if(br + bc == H + W)
    		{
    			return Math.min(H,W);
    		}
    		foo = br + bc;
        return foo;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new MonochromaticBoard()).theMin(new String[] {"WBWBW",
                "BBBBB",
                "WBWBW",
                "WBWBW"}),3);
            eq(1,(new MonochromaticBoard()).theMin(new String[] {"BBBB",
                "BBBB",
                "BBBB"}),3);
            eq(2,(new MonochromaticBoard()).theMin(new String[] {"BBBBB",
                "BBBBB",
                "BBBBB",
                "BBBBB",
                "BBBBB",
                "BBBBB",
                "BBBBB",
                "BBBBB"}),5);
            eq(3,(new MonochromaticBoard()).theMin(new String[] {"WW",
                "WW"}),0);
            eq(4,(new MonochromaticBoard()).theMin(new String[] {"BBBBBBBB",
                "BBBBBBBB",
                "BBBBBBBB",
                "WBWBBBWB",
                "BBBBBBBB"}),9);
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
