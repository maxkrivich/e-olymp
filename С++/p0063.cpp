#include <iostream>

using namespace std;

int main() 
{
	ios_base::sync_with_stdio(0);
	long long n, m;
	cin >> n >> m;
	cout << (n - 1) * (m - 1) + 1 << endl;
	return 0;
}
