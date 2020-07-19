#include <iostream>

using namespace std;

int main() {
	int N ,sum = 1, n = 1;
	cin >> N;
	if (1 <= N <= 1000000000) {
		if (N == 1)
			cout << n;
		else {
			while (true) {
				sum += n * 6;
				if (N <= sum)
					break;
				else {
					n++;
				}
			}
			cout << n + 1;
		}
	}
	return 0;
}