// BEGIN CUT HERE

// END CUT HERE
using System;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
// BEGIN CUT HERE
namespace topcoder
{
// END CUT HERE
public class Chopsticks {
    public int getmax(int[] length) {
        int res = 0;

        Dictionary<int, int> k =new Dictionary<int,int>();

        for (int i = 0; i < length.Length; i++)
        {   
            if(!k.ContainsKey(length[i]))
            {
                k.Add(length[i], 1);
            }
            else 
            {
                k[length[i]]++;
            }

        }

        foreach (KeyValuePair<int, int> j in k)
        {
            if (j.Value % 2 == 0)
            {
                res += j.Value / 2;
            }
            else
            {
                res += (j.Value - 1) / 2;
            }
        }
        return res;
    }

// BEGIN CUT HERE
    public static void Main(String[] args) {
        try  {
            eq(0,(new Chopsticks()).getmax(new int[] {5,5}),1);
            eq(1,(new Chopsticks()).getmax(new int[] {1,2,3,2,1,2,3,2,1}),4);
            eq(2,(new Chopsticks()).getmax(new int[] {1}),0);
            eq(3,(new Chopsticks()).getmax(new int[] {1,2,3,4,5,6,7,8,9}),0);
            eq(4,(new Chopsticks()).getmax(new int[] {35,35,35,50,16,30,10,10,35,50,16,16,16,30,50,30,16,35,50,30,10,50,50,16,16,
               10,35,50,50,50,16,35,35,30,35,10,50,10,50,50,16,30,35,10,10,30,10,10,16,35}),24);
            Console.Read();
        } 
        catch( Exception exx)  {
            System.Console.WriteLine(exx);
            System.Console.WriteLine( exx.StackTrace);
        }
    }
    private static void eq( int n, object have, object need) {
        if( eq( have, need ) ) {
            Console.WriteLine( "Case "+n+" passed." );
        } else {
            Console.Write( "Case "+n+" failed: expected " );
            print( need );
            Console.Write( ", received " );
            print( have );
            Console.WriteLine();
        }
    }
    private static void eq( int n, Array have, Array need) {
        if( have == null || have.Length != need.Length ) {
            Console.WriteLine("Case "+n+" failed: returned "+have.Length+" elements; expected "+need.Length+" elements.");
            print( have );
            print( need );
            return;
        }
        for( int i= 0; i < have.Length; i++ ) {
            if( ! eq( have.GetValue(i), need.GetValue(i) ) ) {
                Console.WriteLine( "Case "+n+" failed. Expected and returned array differ in position "+i );
                print( have );
                print( need );
                return;
            }
        }
        Console.WriteLine("Case "+n+" passed.");
    }
    private static bool eq( object a, object b ) {
        if ( a is double && b is double ) {
            return Math.Abs((double)a-(double)b) < 1E-9;
        } else {
            return a!=null && b!=null && a.Equals(b);
        }
    }
    private static void print( object a ) {
        if ( a is string ) {
            Console.Write("\"{0}\"", a);
        } else if ( a is long ) {
            Console.Write("{0}L", a);
        } else {
            Console.Write(a);
        }
    }
    private static void print( Array a ) {
        if ( a == null) {
            Console.WriteLine("<NULL>");
        }
        Console.Write('{');
        for ( int i= 0; i < a.Length; i++ ) {
            print( a.GetValue(i) );
            if( i != a.Length-1 ) {
                Console.Write(", ");
            }
        }
        Console.WriteLine( '}' );
    }
// END CUT HERE
}

// BEGIN CUT HERE
}
// END CUT HERE
