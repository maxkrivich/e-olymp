#include <iostream>

using namespace std;

int main() 
{
	ios_base::sync_with_stdio(0);
	unsigned short a, b, n;
	cin >> a >> b >> n;
	cout << a*n + b*n / 100 << ' ' << (b * n) % 100 << endl;
	return 0;
	
}
