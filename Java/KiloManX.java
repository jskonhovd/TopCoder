import java.util.PriorityQueue;
public class KiloManX {
	boolean visted[];
	
	class node implements Comparable<node>{
		int w, s;
		public node () {}
		public node(int w, int s)
		{
			this.w = w; /// weapons
			this.s = s; /// shots
		}
		
		public int compareTo(node o) ///this function is not standard.
		{
			return s == o.s ? 0 : (s > o.s ? 1 : -1);
		}
	}
	
	public int leastShots(String[] damageChart, int[] bossHealth)
	{
		visted = new boolean[(int)Math.pow(2,bossHealth.length)];
		PriorityQueue<node> q = new PriorityQueue<node>();
		q.add(new node(0,0));
		boolean exit = false;
		while(!q.isEmpty())
		{
			node foo = q.poll();
			if(visted[foo.w]) continue;
			
			if(foo.w == ((1<<bossHealth.length)-1))
				return foo.s;
			for(int i =0; i < bossHealth.length; i++)
			{
				if((foo.w & 1 << i) != 0) continue;
				
				int duck = bossHealth[i];
				for(int j =0; j < bossHealth.length; j++)
				{
					if(j==i) continue;
					int damage = damageChart[j].charAt(i) - '0';
					if(damage == 0 || (foo.w & (1<<j)) == 0) continue;
					int shotsNeeded = bossHealth[i]/damage;
					if(bossHealth[i] % damage != 0) shotsNeeded++;
					duck = Math.min(duck, shotsNeeded);		
				}
				q.add(new node(foo.w | (1 << i), foo.s + duck ));	
			}			
		}
		return 0;
	}	
}
