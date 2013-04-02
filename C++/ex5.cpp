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

class SimpleGuess 
{
public:
int getMaximum(vector<int> h)
{
set<int> temp,ans;
set<int>::iterator it;
for(int i = 0; i<h.size(); i++) 
{
	temp.insert(h[i]);
}


for(int i = 0; i<100; i++) {
	for(int j = 0; j<100; j++){
		if(temp.find(i+j) != temp.end() && temp.find(i-j) != temp.end())
		{
			ans.insert(i*j);
		}
	}
 }
it = ans.end();
it--;
return *it;

}
};


int main () 
{
	SimpleGuess duck;
  	vector <int> h;
	h.push_back(1);
  	h.push_back(4);
  	h.push_back(5);
	int r = duck.getMaximum(h);
	cout << "return: " << r << endl;
	return 0;
}
