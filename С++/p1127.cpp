//Formula Stirling
#include <iostream>
#include <cmath>

using namespace std;

unsigned long  factorial(unsigned long  n){
	const double pi = 3.14159265358979323846,
		e = 2.7182818284590452354;
	if (n == 1 || n == 0)
		return 1;
	else
		return ceil(log10(2 * pi * n) / 2 + n * (log10(n / e)));

}
int main(){
	unsigned long n, t;
	cin >> t;
	while (t-- > 0){
		cin >> n;
		printf("%d\n", factorial(n));
	}
	return 0;
}
