#include <iostream>

int main()
{	
	int tmp, n, sum1 = 0, sum2 = 0;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) 
		for (int j = 0; j < n; j++)
		{
			scanf("%d", &tmp);
			if (i == j) sum1 += tmp;
			if (i + j + 1 == n) sum2 += tmp;
		}
	printf("%d %d\n",sum1,sum2);
	return 0;
}
