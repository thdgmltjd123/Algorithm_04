#include<iostream>
using namespace std;

int main() {
	int N, M;
	int	sum = 0, ans = 0;
	cin >> N >> M;
	int* cards = new int[N];
	for (int i = 0; i < N; i++) {
		cin >> cards[i];
	}
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			for (int k = 0; k < N; k++) {
				if(i != j && j != k && i != k)
					sum = cards[i] + cards[j] + cards[k];
				if (ans < sum && sum <= M)
					ans = sum;
			}
		}
	}
	cout << ans << endl;
	delete[]cards;
	return 0;
}