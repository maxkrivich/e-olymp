#include <iostream>
using  std::cin;
using  std::cout;

int main(){
	short n, k;
	cin >> n >> k;
	n = n >> k;
	(n % 2 == 1) ? cout << "YES\n" : cout << "NO\n";
	return 0;
} 
