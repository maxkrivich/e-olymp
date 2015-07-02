#include <iostream>
using std::cin;
using std::cout;

int getSumDigit(int n){
	int sum = 0;
	while (n != 0){
		sum += n % 10;
		n /= 10;
	}
	return sum;
}

int main(){
	int* a = new int;
	int* b = new int;
	cin >> *a >> *b;
	int min = INT_MAX;
	int cnt = 0;
	for (int i = *a; i <= *b; i++){
		if (getSumDigit(i) < min){
			min = getSumDigit(i);
			cnt = 1;
		}
		else if (getSumDigit(i) == min)
			cnt++;
	}
	cout << cnt << "\n";
	delete a, b;
	return 0;
}
