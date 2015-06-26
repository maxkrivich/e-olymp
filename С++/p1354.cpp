#include <iostream>
using  std::cin;
using  std::cout;

int main(){
	short size, cnt = 0;
	long tmp;
	cin >> size;
	for (short i = 0; i < size; i++){
		cin >> tmp;
		if (tmp>0)
		if ((tmp + 1 & tmp) == 0)
			cnt++;
	}
	cout << cnt << "\n";
}