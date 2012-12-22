// BEGIN CUT HERE
/*

*/
// END CUT HERE
import java.util.*;
public class SRMCodingPhase {
    public int countScore(int[] points, int[] skills, int luck) {
        int foo =0;
        for(int a =0; a < skills[0] && a <= luck; a++)
        for(int b =0; b < skills[1] && a + b <= luck; b++)
        for(int c =0; c < skills[2] && a + b + c <= luck; c++)
        {
            int t[]  = {skills[0]-a, skills[1]-b, skills[2]-c};
            int w[] = {2, 4, 8};
            for(int mask = 0; mask < 1<<3; mask++)
            {
                int totalTime = 0, totalScore = 0;
                for(int i = 0; i<3; i++)
                {
                    if((mask & (1<<i)) > 0)
                    {
                    totalTime += t[i];
                    totalScore += (int) (points[i] - w[i]*t[i]);
                    }
                }
                if((totalTime <= 75))
                {
                    foo = Math.max(foo, totalScore);
                }
            }
        }
        return foo;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new SRMCodingPhase()).countScore(new int[] {250, 500, 1000}, new int[] {10, 25, 40}, 0),1310);
            eq(1,(new SRMCodingPhase()).countScore(new int[] {300, 600, 900}, new int[] {30, 65, 90}, 25),680);
            eq(2,(new SRMCodingPhase()).countScore(new int[] {250, 550, 950}, new int[] {10, 25, 40}, 75),1736);
            eq(3,(new SRMCodingPhase()).countScore(new int[] {256, 512, 1024}, new int[] {35, 30, 25}, 0),1216);
            eq(4,(new SRMCodingPhase()).countScore(new int[] {300, 600, 1100}, new int[] {80, 90, 100}, 4),0);
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
