#include <iostream>
using std::cin;
using std::cout;


int main(){
	unsigned* a = new unsigned;
	unsigned* b = new unsigned;
	cin >> *a >> *b;
	(*a + *b < 180) ? cout << 180 - (*a + *b) << "\n" : cout << "-1\n";
	delete a, b;
	return 0;
}
