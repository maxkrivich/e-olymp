#include <iostream>

int main(){
	short* n = new short;
	std::cin >> *n;
	std::cout << (1 << *n) << "\n";
	delete n;
	return 0;
} 
