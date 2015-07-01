#include <iostream>

int main(){
	short* n = new short;
	short* m = new short;
	std::cin >> *n >> *m;
	std::cout << ((1 << *n) | (1 << *m)) << "\n";
	delete n, m;
	return 0;
} 
