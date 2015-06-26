#include <iostream>
#include <cmath>


int main(){
	int* n = new int;
	std::cin >> *n;
	double* sq = new double(log2(*n));
	int* sqr = new int((int)*sq);
	(*sqr == *sq) ? std::cout << "I=" << *sqr << "\n" : std::cout << *sqr << "<I<" << *sqr + 1 << "\n";
	delete n, sq, sqr;
	return 0;
}