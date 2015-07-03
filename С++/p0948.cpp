#include <iostream>
#include <cmath>
using std::cin;


double getArea(double &d,double &p){
	return d*d + 2 * d*sqrt(p*p - d*d*0.25);
}
double getVolume(double &d, double &p){
	return (1 / 3) * d * d * sqrt(p*p - d*d*0.5);
}

int main(){
	double* d = new double;
	double* p = new double;
	cin >> *d >> *p;
	printf("%.3f %.3f\n", getArea(*d, *p), getVolume(*d, *p));
	delete d, p;
	return 0;
}
