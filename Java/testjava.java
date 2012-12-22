import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;




public class testjava {
	static class node implements Comparable<node>{
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

	static boolean a[][];
	static boolean dd[];
	static boolean us[];
	static int b[];
	static int s1;
	
	static void init(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			if(!dd[s.charAt(i)])
			{
				dd[s.charAt(i)]= true;
				s1++;
			}
			if(i< s.length() -1)
			{
				if(a[s.charAt(i)][s.charAt(i+1)] == false)
				{
					b[s.charAt(i+1)]++;
					a[s.charAt(i)][s.charAt(i+1)] = true;
				}	
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String[] m = {"PYFHWkbrjvJADTKeBiGmQSM", "yZYLHWkblCqrjdufNDKehoBpiRm", "yZXFLWbCwdzsJOBpciRm", "XYFLWktblCqrjvUdzuKhoBiR", "IPFHblvUdzuNOVxTKhBpciRmM", "yZXYWblrjvzsuNODTKehoBpiSMg", "IyatCqvUAOVxDKehoiGmQSM", "PYHWkbwrjvJANOxDThBQSMg", "IPXYLktlqrsfOxhiRGmQSMg", "IyZYFktblwqvduAOcGQMg", "yZFHktCqrjvzuAOxDociRmM", "XYLWaktblCqdJfANxhoBRGSg", "yZLtbCwqvUsJANOVxKehoBimQSg", "PyXLWatCwvdufAVxDBciRGg", "yYLHblwqrUzuJAVDBpcim", "XYFLWbCrvUdsufANOVxDTKeoBcRQS", "yZXYFWktbCrjzuJANepiRM", "IPZXYLkblCwrjvduJfANTehBpcimQS", "yYLHWabwqjvUdzsfVxTKeciRGm", "PyZXYLbwrjzJANOVoBciRGmQSM", "yZLtblCqrUuJfNODKocmQSg", "PyZXYLHWatblwqrjvzsANOVTKehBimQg", "IPyZYLWatCwqjdsNxhoBpcRG", "IPZXLHWalCvUdzsNxTKeoBpciRSMg", "IPyYatblCwrjvUdsAKhoiGmSM", "IPyZXYWtblqvUdzsuANOxDhBciGmMg", "IyXFHWkqvzJNOVhoBcmQSM", "IZXYFLHaqrzuOxTKehpiGm", "IPyXFLtbljvUsANOxDKepcRSg", "PyXHtbqrvUdsJNVxKoBRmQS", "IPLHWaktbwrjUdsuJANKBpRGQSM", "yYHWajzufOVDhopiRG", "ZXYFLbwqjzsJfAxToBGQSMg", "IPyZFWatblCwqsufANVxDKhoiRGM", "yZXYFaktlwrjvdsuJfAOVxDhociRmQSg", "PyZXLWkbCjvuJfANOxTKoBpcGmMg", "IyZXFLHakblwqjvUJANxhBmQSg", "IyZXYFLablCwrjvUzuJfADoGQ", "IyXakbqrUdsJANxDTBciGmM", "ZHWablwjuJVDTecRmSMg", "IZHalCjvUdzuJANxeoRQSMg", "IyZLaCwqdzsuJfANThociGQSM", "XFLHtlCqrvUdfNTKehBpRSMg", "LHWqrdJANDTKcimQg", "PZaktwdzfANVxDKehBcimg", "PyZYHWatCwqrvdzsuAVxTKhoBcGmS", "IZYLktCwrjUzufNOxDTBpGQSg", "XHakbCqjzuJANOVDcimS", "PyXFHtblqvUdsJfANDThopRGmQSMg", "IyXLHWtwqrjsJfOxKhBpimSMg"};
		int n = m.length;
		b = new int[256];
		dd = new boolean[256];
		us = new boolean[256];
		a = new boolean[256][256];
		
		s1 = 0;
		for(int i =0; i < n; i++) init(m[i]); 
		String foo = "";
		for(int i = 0; i < s1; i++) {
			for(int j = 'A'; j<= 'z'; j++) {
				if((j <= 'Z' || j >= 'a') && dd[j] && us[j] == false && b[j] == 0) {
					foo = foo + (char)j;
					for(int k = 'A'; k <= 'z'; k++)
						if(a[j][k]) b[k]--;
					us[j] = true;
					break;
				}
			}
				
		}
		System.out.println(foo);

		
		
	}

	
}

