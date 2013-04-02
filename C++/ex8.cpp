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

class TireRotation 
{
public:
int getCycle(string i, string c)
{
string now = i;
string s = "";
int n = i.size();
int j;
for(j = 1; j<5; j++) {
if(now == c)
{
return j;
}
cout << "Now: " << now << endl;
s = now;
now = "";
now+=s[3];
now+=s[2];
now+=s[0];
now+=s[1];

}
return -1;
}
};

int main () 
{
	TireRotation duck;
	int r = duck.getCycle("ABCD","CDBA");
	cout << "return: " << r << endl;
	return 0;
}



