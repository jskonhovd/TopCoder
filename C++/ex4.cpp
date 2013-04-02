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

class AdditionGame
{ 
public:
int getMaximumPoints(int a, int b, int c, int n)
{

 int ans = 0;
 for(int i = 0; i<n; i++) 
 {
 if(a >= b && a >= c && a>=1)
 {
	ans += a; a--;
	continue;
 }
 if(b >= a && b >= c && b>=1)
 {
	ans += b; b--;
	continue;
 }
 if(c >= b && c >= a && c>=1)
 {
	ans += c; c--;
	continue;
 }
 }
 return ans;
}
};
int main () {
  AdditionGame duck;
  int a = 3;
  int b = 4;
  int c = 5;
  int n = 3;
  int r = duck.getMaximumPoints(a,b,c,n);
  cout << "return: " << r << endl;
  return 0;
}

