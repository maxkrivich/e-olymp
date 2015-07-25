#include <iostream>

int getNumberOfDays(int m, int y){
	int leap = (1 - (y % 4 + 2) % (y % 4 + 1)) * ((y % 100 + 2) % (y % 100 + 1)) + (1 - (y % 400 + 2) % (y % 400 + 1));
	return 28 + ((m + (m / 8)) % 2) + 2 % m + ((1 + leap) / m) + (1 / m) - (leap / m);
}

int main(){
	int n, m;
	scanf("%d %d", &n, &m);
	printf("%d\n",getNumberOfDays(n,m));
	return 0;
}
