// BEGIN CUT HERE

// END CUT HERE
import java.util.*;
public class SurroundingGameEasy {
    public int score(String[] cost, String[] benefit, String[] stone) {
        int res = 0;
        int N = cost.length;
        for(int i = 0; i < cost.length; i++)
        {
        	for(int j=0; j < cost[i].length(); j++)
        	{
        		
        		if(stone[i].charAt(j) == 'o')
        		{
        			res += benefit[i].charAt(j) - '0';
        			res -= cost[i].charAt(j) - '0';
        		}
        		else if(find(stone, i-1, j) && find(stone,i+1,j) && find(stone,i,j-1) && find(stone,i,j+1))
        		{
        			res += benefit[i].charAt(j) - '0';
        		}
        	}
        }
        return res;
    }
    
    public boolean find(String[] stone, int i, int j)
    {
    	if(i >= 0 && i < stone.length && j >= 0 && j < stone[0].length())
    	{
    		return stone[i].charAt(j) == 'o';
    	}
    	return true;
    	
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new SurroundingGameEasy()).score(new String[] {"21","12"}, new String[] {"21","12"}, new String[] {".o","o."}),4);
            eq(1,(new SurroundingGameEasy()).score(new String[] {"99","99"}, new String[] {"11","11"}, new String[] {".o","o."}),-14);
            eq(2,(new SurroundingGameEasy()).score(new String[] {"888","888","888"}, new String[] {"000","090","000"}, new String[] {"...",".o.","..."}),1);
            eq(3,(new SurroundingGameEasy()).score(new String[] {"4362","4321"}, new String[] {"5329","5489"}, new String[] {"...o","..o."}),22);
            eq(4,(new SurroundingGameEasy()).score(new String[] {"5413","4323","8321","5490"}, new String[] {"0432","7291","3901","2310"}, new String[] {"ooo.","o..o","...o","oooo"}),-12);
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
