#include <iostream>
using std::cin;
using std::cout;

int main(){
	char arr[6];
	cin.getline(arr, 6);
	if (arr[0] == 'x'){
		if (arr[1] == '+')
			cout << (arr[4] - '0') - (arr[2] - '0') << "\n";
		if (arr[1] == '-')
			cout << (arr[4] - '0') + (arr[2] - '0') << "\n";
	}
	if (arr[2] == 'x'){
		if (arr[1] == '+')
			cout << (arr[4] - '0') - (arr[0] - '0') << "\n";
		if (arr[1] == '-')
			cout << (arr[0] - '0') - (arr[4] - '0') << "\n";
	}
	if (arr[4] == 'x'){
		if (arr[1] == '+')
			cout << (arr[0] - '0') + (arr[2] - '0') << "\n";
		if (arr[1] == '-')
			cout << (arr[0] - '0') - (arr[2] - '0') << "\n";
	}
	return 0;
} 
