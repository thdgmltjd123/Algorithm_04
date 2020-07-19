#include <iostream>
using namespace std;

int sum = 0;
void SumOfPeople(int k, int n) {
	if (k == 0) sum += n;
	else { 
		while (n > 0) {
			SumOfPeople(k - 1, n);
			n--;
		}
	}
}

int main() {
	int testcase,k, n;
	cin >> testcase;
	for (int i = 0; i < testcase; i++) {
		cin >> k >> n;
		SumOfPeople(k, n);
		cout << sum << endl;
		sum = 0;
	}
	return 0;
}