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

class RosePetals
{
public:
int getScore(vector <int> d)
{

int ans = 0;
int i;
for(i = 0; i<d.size(); i++){
	if(d[i] == 3) {
		ans += 2;
	}
	if(d[i] == 5) {
		ans += 4;
	}
	}
return ans;
} 
};

int main () 
{
	RosePetals duck;
  	vector <int> w;
	w.push_back(4);
  	w.push_back(4);
  	w.push_back(5);
	w.push_back(6);
  	w.push_back(5);
	int r = duck.getScore(w);
	cout << "return: " << r << endl;
	return 0;
}

