
public class PackingShapes {
	
	public String[] tryToFit(int width, int height, String[] shapes)
	{
		String[] foo = new String[shapes.length];
		int W = Math.max(width, height);
		int H = Math.min(width, height);
		for(int i = 0; i < shapes.length; i++ )
		{
			boolean bar = false;
			String s[] = shapes[i].split(" ");
			if(s[0].equals("RECTANGLE"))
			{
				boolean duck = false;
				int w = Integer.parseInt(s[1]);
				int h = Integer.parseInt(s[2]);
				if(w<h)
				{
					int t = w; w = h; h = t;	
				}
				if((w<=W) && (h <= H))
				{
					bar = true;
					duck = true;
				}
				else if(h > H)
				{
					bar = false;
					duck = true;
				}
				if(!duck)
				{
				double l = Math.sqrt(w*w + h*h);
				double beta = Math.acos((double)W/(double)l);
				double alpha = Math.atan((double)h/(double)w);
				double ang = alpha + beta;
				double a = Math.sin(ang) * w + Math.cos(ang) * h;
				if(a <= H + 1e-9)
					bar = true;
				else
					bar = false;
				}
			}
			else
			{
				int d = Integer.parseInt(s[1])*2;
				bar = ((d<=W)&&(d<=H));
			}
			foo[i]= bar?"YES":"NO";
		}
		
		return foo;	
		
		
	}

}
