#include <iostream>
#include <cmath>
#define M_PI            3.14159265358979323846
using namespace std;

double polar_angle(double x, double y){
	double alpha = atan2(y, x);
	if (alpha < 0) alpha += 2 * M_PI;
	return alpha;
}
int main(){
	double x, y;
	cin >> x >> y;
	printf("%.6f\n", polar_angle(x,y));
	return 0;
}
