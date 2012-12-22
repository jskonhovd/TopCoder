// BEGIN CUT HERE
/*

*/
// END CUT HERE
import java.util.*;

public class EllysJuice {
    Map<String, Integer> amount;
    String[] pl;
    boolean[] u;
    Set<String> foo;
    
    void bt(int i, int orange, int apple)
    {
        if(i == pl.length)
        {
            int max = 0;
            String winner = null;
            for(String s : amount.keySet())
            {
                int v = amount.get(s);
                if(v > max){
                    max =v; 
                    winner = s;
                    
                }
                else if(v ==max){
                    winner =null;
                }
            }
            if(winner != null){
                foo.add(winner);
            }
            return;
        }
      for(int j =0; j<pl.length; j++){
          if(!u[j]){
              u[j] =true;
              int v = 0;
              if(amount.containsKey(pl[j]))
              {
                  v = amount.get(pl[j]);
              }
              int w = v;
              if(i%2 == 0){
                  v += orange/2;
              }
              else
              {
                  v+=apple/2;
              }
              amount.put(pl[j], v);
              if(i%2 == 0){
                  bt(i+1, orange/2, apple);
              }
              else
              {
                  bt(i+1,orange,apple/2);
              }
              amount.put(pl[j], w);
              u[j] = false;
          }
          
      }
        
        
        
    }
    
    public String[] getWinners(String[] players) {
        ///Learning this solution.
     
        pl = players;
        amount = new HashMap<String,Integer>();
        u = new boolean[pl.length];
        foo = new TreeSet<String>();
        bt(0,1024,1024);
        return foo.toArray(new String[foo.size()]);
        
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new EllysJuice()).getWinners(new String[] { "elly", "kriss", "stancho", "elly", "stancho" }),new String[] {"elly", "stancho" });
            eq(1,(new EllysJuice()).getWinners(new String[] {"torb", "elly", "stancho", "kriss"}),new String[] { });
            eq(2,(new EllysJuice()).getWinners(new String[] {"elly", "elly", "elly", "elly", "elly"}),new String[] {"elly" });
            eq(3,(new EllysJuice()).getWinners(new String[] { "ariadne", "elly", "ariadne", "stancho", "stancho", "kriss", "stancho", "elly" }),new String[] {"ariadne", "elly", "stancho" });
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
