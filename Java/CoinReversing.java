// BEGIN CUT HERE
/*
// PROBLEM STATEMENT
// You initially have N coins on the table, all with heads up. 
Given int[] a containing K integers, you first randomly choose a[0] coins and reverse them (from head to tail, or from tail to head), then randomly choose a[1] coins and reverse them, ..., and finally randomly choose a[K-1] coins and reverse them. 
Calculate and return the expected number of heads after these operations.

DEFINITION
Class:CoinReversing
Method:expectedHeads
Parameters:int, int[]
Returns:double
Method signature:double expectedHeads(int N, int[] a)


NOTES
-When you choose a specified number (say x) of coins, each combination of x coins has the same probability of being chosen. 
-The returned value must have an absolute or relative error less than 1e-9. 


CONSTRAINTS
-N will be between 1 and 1000, inclusive.
-a will contain between 1 and 50 elements, inclusive.
-Each element in a will be between 1 and N, inclusive.


EXAMPLES

0)
3
{2,2}

Returns: 1.6666666666666667

You first reverse 2 coins from heads to tails. Then you randomly choose 2 coins and reverse them. There are two possible situations that can occur on the second operation: 

Choosing 2 tails (which occurs with probability 1/3): it results in 3 heads. 
Choosing 1 head and 1 tail (which occurs with probability 2/3): it results in 1 head. 

So the expected number of heads is 1/3*3+2/3*1=5/3. 

1)
10
{10,10,10}

Returns: 0.0

You reverse every coin three times, so after the operations there will be 10 tails and no heads. 

2)
10
{2,7,1,8,2,8}

Returns: 4.792639999999999



3)
1000
{916,153,357,729,183,848,61,672,295,936}

Returns: 498.1980774932278



*/
// END CUT HERE
import java.util.*;
public class CoinReversing {
    public double expectedHeads(int N, int[] a) {
        double foo = 0;
        return foo;
    }
}
/*
// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new CoinReversing()).expectedHeads(3, new int[] {2,2}),1.6666666666666667);
            eq(1,(new CoinReversing()).expectedHeads(10, new int[] {10,10,10}),0.0);
            eq(2,(new CoinReversing()).expectedHeads(10, new int[] {2,7,1,8,2,8}),4.792639999999999);
            eq(3,(new CoinReversing()).expectedHeads(1000, new int[] {916,153,357,729,183,848,61,672,295,936}),498.1980774932278);
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
*/
