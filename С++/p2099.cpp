#include <iostream>

using namespace std;

int main() 
{
	ios_base::sync_with_stdio(0);
	int a[101], b[101], c[101], n, m, cnt = 0;
	bool f = 0;
	cin >> n;
	for (int i = 0; i < n; i++)
		cin >> a[i];
	cin >> m;
	for (int i = 0; i < m; i++)
		cin >> b[i];
	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
			if (a[i] != b[j])
				f = 1;
			else
			{
				f = 0;
				break;
			}
		if (f)
			c[cnt++] = a[i];
	}
	cout << cnt << endl;
	for (int i = 0; i < cnt; i++)
		cout << c[i] << ' ';
	cout << endl;
	return 0;
}
