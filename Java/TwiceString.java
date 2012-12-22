// BEGIN CUT HERE
/*
// PROBLEM STATEMENT
// 
You are given a String s.  Return the shortest string which contains s as a contiguous substring twice.

Note that two occurrences of s may overlap. For example, "ababa" contains "aba" twice.


DEFINITION
Class:TwiceString
Method:getShortest
Parameters:String
Returns:String
Method signature:String getShortest(String s)


NOTES
-The shortest string which contains s as a contiguous substring twice is always unique.


CONSTRAINTS
-s will contain between 1 and 50 characters, inclusive. 
-Each character in s will be a lowercase letter ('a'-'z').  


EXAMPLES

0)
"aba"

Returns: "ababa"

This is the example shown in the problem statement. 

1)
"xxxxx"

Returns: "xxxxxx"



2)
"topcoder"

Returns: "topcodertopcoder"



3)
"abracadabra"

Returns: "abracadabracadabra"



*/
// END CUT HERE
import java.util.*;
public class TwiceString {
    public String getShortest(String s) {
    	int N = s.length();
    	String foo = s;
    	boolean bar = false;
    	for(int i = 1; i <N && !bar; i++) {
    		String duck = s.substring(i,N);
    		System.out.println(duck);
    		if(duck.equals(s.substring(0, duck.length())))
    		{
    			bar = true;
    			foo = foo + s.substring(duck.length());
    			System.out.println(duck+" quack");
    			System.out.println(s.substring(duck.length())+" quackers");
    		}
    	}
    	if(!bar)
    	{
    		foo = foo + s;
    	}
        return foo;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new TwiceString()).getShortest("aba"),"ababa");
            eq(1,(new TwiceString()).getShortest("xxxxx"),"xxxxxx");
            eq(2,(new TwiceString()).getShortest("topcoder"),"topcodertopcoder");
            eq(3,(new TwiceString()).getShortest("abracadabra"),"abracadabracadabra");
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
