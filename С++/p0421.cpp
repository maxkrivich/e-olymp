#include <iostream>

using namespace std;

int main()
{
	double k, l;
	cin >> l >> k;
	int cnt = 0;
	l /= k;
	while (l > 1)
	{
		l /= k;
		++cnt;
	}
	printf("%d\n", cnt);
	return 0;
}
