#include <vector>
#include <list>
#include <map>
#include <set>
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

class TheProgrammingContestDivTwo {

public:
  vector <int> find(int, vector <int>);
};
vector<int> TheProgrammingContestDivTwo::find(int T, vector<int> requiredTime) {
			vector<int> ans(2,0); 
			int tim = 0, duck = 0;
			sort(requiredTime.begin(),requiredTime.end());
			int k = 1;
			if(requiredTime[0] > T)
			{
			return ans;
			}
			for(int i = 0; i<requiredTime.size(); i++) 
			{
			int t = 0;
			for(int j = 0; j<k; j++) 
			{
				t += requiredTime[j];
				tim += requiredTime[j];
			}
			if(t<=T)
			{
			duck++;
			}
			else {
			tim-=t;
			break;
			}
			k++;
			}
			ans[0]= duck;			
			ans[1] = tim;
			return ans;
}
			



int main () 
{
  TheProgrammingContestDivTwo duck;
  vector <int> rT;
  int T = 58;	
  rT.push_back(4);
  rT.push_back(5);
  rT.push_back(82);
  rT.push_back(3);
  rT.push_back(4);
  rT.push_back(65);
  rT.push_back(7);
  rT.push_back(6);
  rT.push_back(8);
  rT.push_back(7);
  rT.push_back(6);
  rT.push_back(4);
  rT.push_back(8);
  rT.push_back(7);
  rT.push_back(6);
  rT.push_back(37);
  rT.push_back(8);
  vector <int> a = duck.find(T, rT);
  cout << "return: " << a[0] << " " << a[1] << endl;
  return 0;
}	
			
