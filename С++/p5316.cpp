#include <iostream>
using std::cin;
using std::cout;


int main(){
	int* a = new int;
	int* k = new int;
	cin >> *a >> *k;
	cout << (int)(*a ^ (1 << *k)) << "\n";
	delete a, k;
	return 0;
}
