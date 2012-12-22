import java.util.Arrays;



public class RowsOrdering {
static final int MODULO = 1000000007;
	
public int order(String[] rows)
{
   int width = rows[0].length();
   int[] score = new int[width];
   for(int col = 0; col < width; ++col) {
        int[] cnt = new int[50];
        for (String x : rows) {
            char ch = x.charAt(col);
            int cur;
            if (ch >= 'a' && ch <= 'z')
                cur = ch - 'a';
            else if (ch >= 'A' && ch <= 'X')
                cur = ch - 'A' + 26;
            else
                throw new RuntimeException();
            --cnt[cur];
            }
        
        	Arrays.sort(cnt);
        	for (int i = 0; i < 50; ++i)
        		score[col] += -cnt[i] * i;
   			}
        	Arrays.sort(score);
        	long foo = 0;
            for (int x : score) {
                foo = (foo * 50 + x) % MODULO;
            }
            foo = (foo + rows.length) % MODULO;
            return (int) foo;
   }
}
