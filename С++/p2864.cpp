#include <iostream>
#include <cmath>

double fun(double x){
	return 3 * sin(x);
}

int main(){
	double a, b, h;
	std::cin >> a >> b >> h;
	bool flag = true;
	for (int i= a; a <= b;i++){
		printf("%.3lf %.3lf\n",a, fun(a));
		a += h;
	}
	return 0;
}
