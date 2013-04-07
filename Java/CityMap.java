// BEGIN CUT HERE

// END CUT HERE
import java.util.*;
public class CityMap {
    public String getLegend(String[] cityMap, int[] POIs) {
        String res = "";
        char[] foo = new char[POIs.length];
        int n = cityMap.length;
        int m = cityMap[0].length();
        for(char a = 'A'; a<= 'Z'; a++)
        {
        	int c = 0;
        	for(int i = 0; i < n; i++)
        	{
        		for(int j = 0; j <m; j++)
        		{
        			if (a == cityMap[i].charAt(j))
        			{
        				c++;
        			}       			
        		}
        	}
        	for(int k = 0; k <POIs.length; k++)
        	{
        		if(c == POIs[k])
        		{
        			foo[k] = a;
        		}
        		
        	}
        }
        return String.valueOf(foo);
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new CityMap()).getLegend(new String[] {"M....M",
                "...R.M",
                "R..R.R"}, new int[] {3, 4}),"MR");
            eq(1,(new CityMap()).getLegend(new String[] {"XXXXXXXZXYYY"}, new int[] {1, 8, 3}),"ZXY");
            eq(2,(new CityMap()).getLegend(new String[] {"...........",
                "...........",
                "...........",
                "..........T"}, new int[] {1}),"T");
            eq(3,(new CityMap()).getLegend(new String[] {"AIAAARRI.......GOAI.",
                ".O..AIIGI.OAAAGI.A.I",
                ".A.IAAAARI..AI.AAGR.",
                "....IAI..AOIGA.GAIA.",
                "I.AIIIAG...GAR.IIAGA",
                "IA.AOA....I....I.GAA",
                "IOIGRAAAO.AI.AA.RAAA",
                "AI.AAA.AIR.AGRIAAG..",
                "AAAAIAAAI...AAG.RGRA",
                ".J.IA...G.A.AA.II.AA"}
               , new int[] {16,7,1,35,11,66}
               ),"GOJIRA");
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
