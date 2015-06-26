#include <iostream>

int main(){
	int* a = new int;
	int* k = new int;
	std::cin >> *a >> *k;
	*a = *a >> *k;
	(*a % 2 == 1) ? std::cout << "1\n" : std::cout << "0\n";
	delete a, k;
	return 0;
}