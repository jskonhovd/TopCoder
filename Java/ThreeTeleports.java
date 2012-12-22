// BEGIN CUT HERE
/*

*/
// END CUT HERE


import java.util.*;
public class ThreeTeleports {
    
   
    int get(int x1, int y1, int x2, int y2)
    {
        return Math.abs(x2-x1) + Math.abs(y2-y1);
    }
    
    
    public int shortestDistance(int xMe, int yMe, int xHome, int yHome, String[] teleports) {
        
        int hx = xHome;
        int hy = yHome;
        int N = teleports.length;
        int foo = 0;
        boolean exit = false;
        
        int x1[] = new int[N];
        int y1[] = new int[N];
        int x2[] = new int[N];
        int y2[] = new int[N];
        
        for(int i =0; i < N; i++)
        {
            String tmp[] = teleports[i].split(" ");
            x1[i] = Integer.parseInt(tmp[0]);
            y1[i] = Integer.parseInt(tmp[1]);
            x2[i] = Integer.parseInt(tmp[2]);
            y2[i] = Integer.parseInt(tmp[3]);
        }
        long best = get(xMe,yMe,xHome,yHome);
        for(int i = 0; i<7*7*7; i++)
        {
            long cur = 0;
            int x = xMe;
            int y = yMe;
            
            int zm = i;
            for(int j =0; j< 3; j++)
            {
                int z = zm%7;
                zm/=7;
                
                if(z==6) continue;
                
                if((z&1)==0)
                {
                    cur += get(x,y,x1[z/2],y1[z/2]);
                    cur +=10;
                    x = x2[z/2];
                    y = y2[z/2];
                }
                else
                {
                    cur += get(x,y,x2[z/2],y2[z/2]);
                    cur +=10;
                    x = x1[z/2];
                    y = y1[z/2]; 
                }
            }
            cur += get(x,y,xHome,yHome);
            best = Math.min(best, cur);
        }
        foo = (int)best;
        return foo;
    }
    
// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new ThreeTeleports()).shortestDistance(3, 3, 4, 5, new String[] {"1000 1001 1000 1002", "1000 1003 1000 1004", "1000 1005 1000 1006"}),3);
            eq(1,(new ThreeTeleports()).shortestDistance(0, 0, 20, 20, new String[] {"1 1 18 20", "1000 1003 1000 1004", "1000 1005 1000 1006"}),14);
            eq(2,(new ThreeTeleports()).shortestDistance(0, 0, 20, 20, new String[] {"1000 1003 1000 1004", "18 20 1 1", "1000 1005 1000 1006"}),14);
            eq(3,(new ThreeTeleports()).shortestDistance(10, 10, 10000, 20000, new String[] {"1000 1003 1000 1004", "3 3 10004 20002", "1000 1005 1000 1006"}),30);
            eq(4,(new ThreeTeleports()).shortestDistance(3, 7, 10000, 30000, new String[] {"3 10 5200 4900", "12212 8699 9999 30011", "12200 8701 5203 4845"}),117);
            eq(5,(new ThreeTeleports()).shortestDistance(0, 0, 1000000000, 1000000000, new String[] {"0 1 0 999999999", "1 1000000000 999999999 0", "1000000000 1 1000000000 999999999"}),36);
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
