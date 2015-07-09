#include <iostream>
using std::cin;
using std::cout;

int main(){
	double k, l;
	cin >> l >> k;
	int cnt = 0;
	l /= k;
	while (l > 1){
		l /= k;
		++cnt;
	}
	printf("%d\n", cnt);
	return 0;
}
