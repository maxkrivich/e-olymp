#include <iostream>
using std::cin;
using std::cout;

#include <cmath>

int GCD(int a, int b) {
	return b ? GCD(b, a%b) : a;
}

int main(){
	int* a = new int;
	int* b = new int;
	cin >> *a >> *b;
	if (*a < 0 | *b < 0){
		*a = abs(*a);
		*b = abs(*b);
		cout << "-";
	}
	int* tmp = new int(GCD(*a, *b));
	cout << *a / *tmp<<" " << abs(*b / *tmp)<<"\n";
	delete a, b, tmp;
	return 0;
}
