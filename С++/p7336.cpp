#include <iostream>
using std::cin;
using std::cout;

int main(){
	unsigned* a = new unsigned;
	unsigned* b = new unsigned;
	unsigned* n = new unsigned;
	cin >> *a >> *b >> *n;
	cout << (*a*(*n) + (*b*(*n)) / 100) << " " << *b*(*n) % 100 << "\n";
	delete a, b, n;
	return 0;
}
