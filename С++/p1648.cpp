#include <iostream>
using std::cin;
using std::cout;

int main(){
	int* n = new int;
	cin >> *n;
	cout << (*n & -*n) << "\n";
	delete n;
	return 0;
}
