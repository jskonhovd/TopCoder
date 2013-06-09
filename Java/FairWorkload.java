// BEGIN CUT HERE

// END CUT HERE
import java.util.*;
public class FairWorkload {
    public int getMostWork(int[] S, int k) {
		int n = S.length;
		int[] p = new int[n+1];
		int[][] M = new int[n][k];
		
		for(int i = 1; i < n+1; i++)
		{
			if(i > 0)
			{
				p[i] = p[i-1] + S[i-1];
			}
			else
			{
				p[0] = 0;
			}
		}

		//init boundary conditions
		
		for(int i = 0; i < n; i++)
		{
			M[i][0] = p[i+1];		
		}
		
		for(int j = 1; j < k; j++)
		{
			M[0][j] = S[0];
		}
		
		for(int i = 1; i < n; i++)
			for(int j = 1; j <k; j++)
			{
				M[i][j] = Integer.MAX_VALUE;
				for(int x = 0; x < i; x++)
				{
					int s = Math.max(M[x][j-1],p[i+1] - p[x+1]);
					M[i][j] = Math.min(s, M[i][j]);
				}
			}
		//test.print(M);
		return M[n-1][k-1];
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new FairWorkload()).getMostWork(new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 }, 3),170);
            eq(1,(new FairWorkload()).getMostWork(new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 }, 5),110);
            eq(2,(new FairWorkload()).getMostWork(new int[] { 568, 712, 412, 231, 241, 393, 865, 287, 128, 457, 238, 98, 980, 23, 782 }, 4),1785);
            eq(3,(new FairWorkload()).getMostWork(new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1000 }, 2),1000);
            eq(4,(new FairWorkload()).getMostWork(new int[] { 50, 50, 50, 50, 50, 50, 50 }, 2),200);
            eq(5,(new FairWorkload()).getMostWork(new int[] {1,1,1,1,100}, 5),100);
            eq(6,(new FairWorkload()).getMostWork(new int[] { 950, 650, 250, 250, 350, 100, 650, 150, 150, 700 }, 6),950);
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
