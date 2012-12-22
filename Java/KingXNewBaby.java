// BEGIN CUT HERE
/*

*/
// END CUT HERE
import java.util.*;
public class KingXNewBaby {
    public String isValid(String name) {
        String foo = "NO";
        boolean isOk = true;
        if(name.length() != 8)
        {
            return "NO";
        }
        int countVowels = 0;
        char[] vowel = new char[name.length()];
        for(int i =0; i < name.length(); i++)
        {           
                switch (name.charAt(i))
                {
                case 'a': vowel[countVowels] = 'a'; countVowels++;              
                break;
                case 'e':vowel[countVowels] = 'e'; countVowels++;                
                break;
                case 'i': vowel[countVowels] = 'i'; countVowels++;                
                break;
                case 'o': vowel[countVowels] = 'o'; countVowels++;               
                break;
                case 'u': vowel[countVowels] = 'u'; countVowels++;                
                break;                                             
                }
 
        }  
        if(countVowels != 2)
        {
            isOk =false;
            
        }
        if(vowel[0]==vowel[1] && isOk)
        {
            return "YES";
        }     

        return foo;
    }

// BEGIN CUT HERE
    public static void main(String[] args) {
        try {
            eq(0,(new KingXNewBaby()).isValid("dengklkk"),"NO");
            eq(1,(new KingXNewBaby()).isValid("gofushar"),"NO");
            eq(2,(new KingXNewBaby()).isValid("dolphinigle"),"NO");
            eq(3,(new KingXNewBaby()).isValid("mystictc"),"NO");
            eq(4,(new KingXNewBaby()).isValid("rngringo"),"NO");
            eq(5,(new KingXNewBaby()).isValid("misof"),"NO");
            eq(6,(new KingXNewBaby()).isValid("metelsky"),"YES");
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
