#include <iostream>
#include <cmath>

using namespace std;

int main(void) {
	int N;
	cin >> N;
	int* prime = new int[N];
	for (int i = 0; i < N; i++) {
		cin >> prime[i];
	}
	int count = N;
	for (int i = 0; i < N; i++) {
		if (prime[i] == 1)
			count--;
		for (int j = 2; j < prime[i]; j++) {
			if (prime[i] % j == 0) {
				count--;
				break;
			}
		}
	}
	cout << count << '\n';
	return 0;
}