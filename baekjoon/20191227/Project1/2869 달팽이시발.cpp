#include <iostream>
using namespace std;
int main(void) {
	int A, B, V, T = 0;
	cin >> A >> B >> V;
	T = (V - B) / (A - B);
	if ((V - B) - (T * (A - B)) > 0) T++;
	cout << T << endl;
}