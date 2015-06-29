#include <iostream>
using std::cin;
using std::cout;
using std::swap;

void Sort(unsigned &a, unsigned &b, unsigned &c){
	if (a > b) swap(a, b);
	if (b > c) swap(b, c);
	if (a > b) swap(a, b);
}

int main(){
	unsigned* a = new unsigned;
	unsigned* b = new unsigned;
	unsigned* c = new unsigned;
	cin >> *a >> *b >> *c;
	Sort(*a, *b, *c);
	cout << *a + *c << "\n";
	delete a, b, c;
	return 0;
}
