#include <iostream>
using std::cin;

int main(){
	double a, b, c, d;
	cin >> a >> b >> c >> d;
	printf("%s\n", ((a == c & b == d) | (a == b & c == d) | (a == d & c == b)) ? "YES" : "NO");
	return 0;
}
