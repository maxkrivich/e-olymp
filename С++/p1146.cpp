#include <stdlib.h>
#include <stdio.h>

int GCD(int a, int b) {
	return b ? GCD(b, a%b) : a;
}

int getSum(int n){
	int G = 0;
	for (int i = 1; i < n;i++)
	for (int j = i + 1; j <= n; j++)
		G += GCD(i, j);
	return G;
}

int main(){
	int n;
	while (true){
		scanf("%d", &n);
		if (n == 0)
			break;
		else
			printf("%d\n", getSum(n));
	}
	system("pause");
	return 0;
}
