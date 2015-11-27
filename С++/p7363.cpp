#include <iostream>

int __gcd(int a, int b) {
	return b ? __gcd(b, a%b) : a;
}

int main()
{
	int a, b, c, d;
	scanf("%d %d %d %d", &a, &b, &c, &d);
	a = a*d + b*c;
	b *= d;
	if (!a%b)
		printf("%d\n", (a / b));
	else 
	{
		d = __gcd(a, b);
		printf("%d %d\n", (a / d), (b / d));
	}
	return 0;
}
