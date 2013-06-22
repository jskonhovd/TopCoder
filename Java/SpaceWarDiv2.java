// BEGIN CUT HERE

// END CUT HERE
import java.util.*;
public class SpaceWarDiv2 {
	//TestFramework test = new TestFramework();
    public int minimalFatigue(int[] magicalGirlStrength, int[] enemyStrength, int[] enemyCount) {
        int res = -1;
        Arrays.sort(magicalGirlStrength);
        int[] enemy = new int[101];
        int count = 0;
        
        for(int i =0; i < enemyStrength.length; i++)
        {
        	
        	enemy[enemyStrength[i]] += enemyCount[i];
        	count += enemyCount[i];
        }
        
        //test.print(magicalGirlStrength);
        //test.print(enemy);
        int F = 0;
        boolean found = true;
        while(count > 0 && found)
        {
        	found = false;
        	out : for(int i = magicalGirlStrength.length -1; i>=0; i--)
        		{
        			for(int j = 100; j > 0; j--)
        			{
        				if(enemy[j] > 0 && magicalGirlStrength[i] >= j)
        				{
        					enemy[j]--;
        					count--;
        					found  = true;
        					continue out;
        				}
        			}
        		}
        	F++;
        }
        
        if(count > 0)
        {
        	F = -1;
        	
        }
        
        return F;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new SpaceWarDiv2()).minimalFatigue(new int[] {2, 3, 5}, new int[] {1, 3, 4}, new int[] {2, 9, 4}),7);
            eq(1,(new SpaceWarDiv2()).minimalFatigue(new int[] {2, 3, 5}, new int[] {1, 1, 2}, new int[] {2, 9, 4}),5);
            eq(2,(new SpaceWarDiv2()).minimalFatigue(new int[] {14, 6, 22}, new int[] {8, 33}, new int[] {9, 1}),-1);
            eq(3,(new SpaceWarDiv2()).minimalFatigue(new int[] {17, 10, 29, 48, 92, 60, 80, 100, 15, 69, 36, 43, 70, 14, 88, 12, 14, 29, 9, 40}, new int[] {93, 59, 27, 68, 48, 82, 15, 95, 61, 49, 68, 15, 16, 26, 64, 82, 7, 8, 92, 15}, new int[] {56, 26, 12, 52, 5, 19, 93, 36, 69, 61, 68, 66, 55, 28, 49, 55, 63, 57, 33, 45}),92);
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
