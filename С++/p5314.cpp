#include <iostream>
using  std::cin;
using  std::cout;

int main(){
	short n, k;
	cin >> n >> k;
	cout << ((1 << n) | (1 << k)) << "\n";
	return 0;
} 
