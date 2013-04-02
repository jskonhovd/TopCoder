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

class Soccer
{
public:
int maxPoints(vector<int> w, vector<int> t)
{
int ans = -1;
int temp = -1;
int i;
	for(i = 0; i < w.size(); i++)	
	{
			temp = w[i] * 3 + t[i] * 1; 
			if(temp >= ans)
			{
			ans = temp;
			}
	}		

	return ans;
}
};

int main () 
{
	Soccer duck;
  	vector <int> w;
	vector <int> t;
	w.push_back(1);
  	w.push_back(4);
  	w.push_back(3);
	w.push_back(0);
  	w.push_back(0);
	t.push_back(3);
  	t.push_back(1);
  	t.push_back(5);
	t.push_back(3);
  	t.push_back(1);
	int r = duck.maxPoints(w,t);
	cout << "return: " << r << endl;
	return 0;
}

