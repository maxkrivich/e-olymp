#include <iostream>
#define n 3

int main(){
   int i, j,d;
   int a[n][n];
	for (i = 0; i<n; i++)
	 for (j = 0; j<n; j++)
		std::cin>>a[i][j];
	d = ((a[0][0] * a[1][1] * a[2][2]) + (a[0][1] * a[1][2] * a[2][0]) + (a[1][0] * a[0][2] * a[2][1]) - (a[2][0] * a[1][1] * a[0][2]) - (a[0][0] * a[2][1] * a[1][2]) - (a[1][0] * a[0][1] * a[2][2]));
	printf("%d\n", d);
	return 0;
}
