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


class FoxProgression
{ 
public:
int theCount(vector <int> seq)
{
	bool ap = true;
	bool gp =true;
	vector <int> temp = seq;
	sort(temp.begin(),temp.end());
	
	int d = temp[1] - temp[0];
	cout << "d: " << d << endl;
	int r = temp[1] / temp[0];
	cout << "r: " << r << endl;
	int nElements = seq.size();
	if (temp[0]==temp[nElements-1]) return 1;
 	if (nElements == 1)
 	{
  		return -1;
 	}	 

	for(int i = 0; i<nElements-1; i++) 
	{
	if(temp[i + 1] - temp[i] != d)
	{
		ap = false;
		cout << "for1: " << i << endl;
	}
	}
	if(r==0) gp=false;
	
	for(int i = 0; i<nElements-1; i++) 
	{
		if(temp[i]*r!=temp[i+1])
		{
			gp=false;
			cout << "for2: " << i << endl;
		}
	}
	if(ap && gp) return 2;
    if(ap || gp) return 1;
	return 0;
}
};


int main () {
  FoxProgression duck;
  vector <int> m;
  m.push_back(1);
  m.push_back(2);
  m.push_back(4);
  m.push_back(8);
  int a = duck.theCount(m);
  cout << "return: " << a << endl;
  return 0;
}

	
	
