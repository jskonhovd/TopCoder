#include <vector>
#include <list>
#include <map>
#include <set>
#include <queue>
#include <deque>
#include <stack>
#include <bitset>
#include <algorithm>
#include <functional>
#include <numeric>
#include <utility>
#include <sstream>
#include <iostream>
#include <iomanip>
#include <cstdio>
#include <cmath>
#include <cstdlib>
#include <ctime>

using namespace std;

class LuckyCounter {
public:
	int count(vector <string> m) 
	{
		string s;
		int i , j=0;
		bool duck = false;
		for(i = 0; i<m.size(); i++) 
		{
			s=m[i];
			duck = false;
			if(s[0]==s[3] && s[1]==s[4])
			{
				duck = true;
			}
			if(s[0]==s[1] && s[3]==s[4])
			{
				duck = true;
			}
			if(s[0]==s[4] && s[1]==s[3])
			{
				duck = true;
			}
			if(duck)
			{
			 j++;
			}
		}
		return j;
	}
};

int main () {
  LuckyCounter duck;
  vector <string> m;
  m.push_back("12:21");
  m.push_back("11:10");
  int a = duck.count(m);
  cout << "return: " << a << endl;
  return 0;
}
