#include <iostream>
#include <climits>

using namespace std;


int getSumDigit(int n) 
{
	int sum = 0;
	while (n != 0) 
	{
		sum += n % 10;
		n /= 10;
	}
	return sum;
}

int main() 
{
	ios_base::sync_with_stdio(0);
	int a, b, cnt = 0;
	cin >> a >> b;
	int min = INT_MAX;
	for (; a <= b; a++) 
	{
		if (getSumDigit(a) < min) 
		{
			min = getSumDigit(a);
			cnt = 1;
		}
		else if (getSumDigit(a) == min)
			cnt++;
	}
	cout << cnt << endl;
	return 0;
}
