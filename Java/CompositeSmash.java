// BEGIN CUT HERE
/*
// PROBLEM STATEMENT
// Toastwoman wants to be a magical girl. As training, she wants to make a ball that contains an integer target.


Initially she has a ball that contains an integer N. She can smash a ball that contains a composite number (see notes for definition) and break it into two balls. Each new ball will also contain an integer. If she smashes a ball that contains a composite number x and it breaks into two balls that contain y and z, it satisfies y &ge 2, z &ge 2 and yz = x. For example, if she smashes a ball that contains 12, it breaks into 2 and 6 or 3 and 4. Toastwoman can control the ball she smashes, but she can't control the numbers in the two new balls when there are multiple pairs of (y, z) that satisfy the above conditions. She can apply the described ball smash operation arbitrary number of times, but she can't smash a ball that contains a non-composite number.


If she can always make a ball that contains target, return "Yes" (quotes for clarity). Otherwise, return "No" (quotes for clarity).


DEFINITION
Class:CompositeSmash
Method:thePossible
Parameters:int, int
Returns:String
Method signature:String thePossible(int N, int target)


NOTES
-A positive integer x is called a composite number if it has at least one divisor other than 1 and x. For example, 4 and 6 are composite numbers, while 1 and 5 are not composite numbers.


CONSTRAINTS
-N will be between 2 and 100,000, inclusive.
-target will be between 2 and 100,000, inclusive.


EXAMPLES

0)
517
47

Returns: "Yes"

If she smashes 517, it breaks into 11 and 47.

1)
8
4

Returns: "Yes"

If she smashes 8, it breaks into 2 and 4.

2)
12
6

Returns: "No"

If she smashes 12 and it breaks into 3 and 4, she can't make 6.

3)
5
8

Returns: "No"



4)
100000
100000

Returns: "Yes"

She already has target.

5)
5858
2

Returns: "Yes"



6)
81461
2809

Returns: "No"



7)
65536
256

Returns: "No"

*/
// END CUT HERE
import java.util.*;
public class CompositeSmash {
    public String thePossible(int N, int target) {
    	String foo = "No";
    	if(N == target)
    	{
    		return "Yes";
    	}
    	if(isPrime(target) && N % target == 0)
    		return "Yes";
    	int p = (int)(Math.sqrt((double)target) + 0.5);
		if(p*p == target && isPrime(p) && N >= p*p)
		{
		while(N%p == 0)
			N /= p;
		if(N==1)
			return "Yes";
		}	
        return foo;
    }
    boolean isPrime(int N)
    {
    	for( int i = 2; i*i <=N; i++)
    	{
    		if(N%i == 0)
    		{
    			return false;
    		}
    	}
    	return true;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new CompositeSmash()).thePossible(517, 47),"Yes");
            eq(1,(new CompositeSmash()).thePossible(8, 4),"Yes");
            eq(2,(new CompositeSmash()).thePossible(12, 6),"No");
            eq(3,(new CompositeSmash()).thePossible(5, 8),"No");
            eq(4,(new CompositeSmash()).thePossible(100000, 100000),"Yes");
            eq(5,(new CompositeSmash()).thePossible(5858, 2),"Yes");
            eq(6,(new CompositeSmash()).thePossible(81461, 2809),"No");
            eq(7,(new CompositeSmash()).thePossible(65536, 256),"No");
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
