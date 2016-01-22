#include <iostream>

using namespace std;

int main() 
{
	ios_base::sync_with_stdio(0);
	int a, k;
	cin >> a >> k;
	cout << (int)(a & ~(1 << k)) << endl;
	return 0;
	
}
