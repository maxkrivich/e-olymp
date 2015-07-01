#include <iostream>
using  std::cin;
using  std::cout;

__int64 GCD(__int64 a, __int64 b) {
	return b ? GCD(b, a%b) : a;
}

__int64 LCM(__int64 a, __int64 b) {
	return a / GCD(a, b) * b;
}

int main(){
	__int64 a, b;
	cin >> a >> b;
	cout << LCM(a, b) << "\n";
	return 0;
} 
