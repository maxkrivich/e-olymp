#include <iostream>
short bit(short& num){
	short cnt = 0;
	while (num % 2 != 1){
		num = num >> 1;
		cnt++;
	}
	return cnt;
}


int main(){
	short* num = new short;
	while (true){
		std::cin >> *num;
		if (*num == 0)
			break;
		if (*num > 0){
			std::cout << (1 << bit(*num)) << "\n";
		}
	}
	delete num;
	return 0;
} 
