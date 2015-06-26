#include <iostream>
using  std::cin;
using std::cout;

int main(){
	__int64* a = new __int64;
	__int64* b = new __int64;
	__int64* sum = new __int64(0);
	cin >> *a >> *b;
	if (*a % 2 == 0)
		++*a;
	if (*b % 2 == 0)
		--*b;
	if (*b < *a)
		*sum = 0;
	else
		*sum = ((*a + *b) / 2) * (((*b - *a) / 2) + 1);
	cout << *sum << "\n";
	delete a, b, sum;
	return 0;
}