import java.util.*;
public class Escape {
	String v[][];
	boolean used[][];
	int dx[] = new int[]{0, 0, -1, 1};
	int dy[] = new int[]{1, -1, 0, 0};
	
	class node implements Comparable<node>{
		int x, y, c;
		public node () {}
		public node(int x, int y, int c)
		{
			this.x = x;
			this.y = y;
			this.c = c;
			
		}
		public int compareTo(node o)
		{
			if(this.c > o.c) return 1;
			return -1;
		}
	}
	
	
	public int lowest(String[] harmful, String[] deadly)
	{
		v = new String[501][501];
		used = new boolean[501][501];
		if(harmful.length == 0 && deadly.length == 0)
		{
			return 0;
		}
		for(int i =0; i<=500; i++)
		{
		  Arrays.fill(v[i], ".");	
		}
		for(int i = 0; i < harmful.length; i++)
		{
			
			String[] s = harmful[i].split(" ");
			int x1 = Integer.parseInt(s[0]);
			int y1 = Integer.parseInt(s[1]);
			int x2 = Integer.parseInt(s[2]);
			int y2 = Integer.parseInt(s[3]);
			for(int j = Math.min(x1, x2); j<=Math.max(x1, x2); j++)
			{
				for(int k = Math.min(y1, y2); k<=Math.max(y1, y2); k++)
				{
					v[j][k] = ":(";
				}
			}
		}
		
		for(int i = 0; i< deadly.length; i++)
		{
			
			String[] s = deadly[i].split(" ");
			int x1 = Integer.parseInt(s[0]);
			int y1 = Integer.parseInt(s[1]);
			int x2 = Integer.parseInt(s[2]);
			int y2 = Integer.parseInt(s[3]);
			for(int j = Math.min(x1, x2); j<=Math.max(x1, x2); j++)
			{
				for(int k = Math.min(y1, y2); k<=Math.max(y1, y2); k++)
				{
					used[j][k] = true;
				}
			}
		}
		
		return bfs();
	}
	
int bfs(){
	PriorityQueue<node> q = new PriorityQueue<node>();
	q.add(new node(0,0,0));
	used[0][0] = true;
	boolean exit = false;
	while(!q.isEmpty())
	{
		node foo = q.poll();
		if(foo.x == 500 && foo.y == 500)
		{
			exit = true;
			return foo.c;
		}
		for(int i = 0; i<4; i++)
		{
			int x = foo.x + dx[i];
			int y = foo.y + dy[i];
			if(x<0 || x>500 || y > 500 || y<0) continue;
			
			if(used[x][y]) continue;
			used[x][y] = true;
			if(v[x][y].equals(":("))
				q.add(new node(x,y,foo.c + 1));
			else q.add(new node(x,y,foo.c));
			
		}
		
	}
	if(!exit) return -1;
	return 1;
}
}