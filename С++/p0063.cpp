#include <iostream>
using std::cin;
using std::cout;

int main(){
	__int64* n = new __int64;
	__int64* m = new __int64;
	cin >> *n >> *m;
	cout << (*n - 1) * (*m - 1) + 1 << "\n";
	delete n, m;
	return 0;
}
 
