#include <iostream>
using namespace std;

int main() {
	char map[50][50];

	int M, N;
	cin >> M >> N;

	for (int i = 0; i < M; i++) {
		for (int j = 0; j < N; j++) {
			cin >> map[i][j];
		}
	}
	int min = 250;
	for (int i = 0; i < M - 7; i++) {
		for (int j = 0; j < N - 7; j++) {
			int W = 0, B = 0;
			for (int k = 0; k < 8; k++) {
				for (int l = 0; l < 8; l++) {
					if ((k + l) % 2 == 0 && map[i+k][j+l] != 'W') {
						W++;
					}
					else if ((k + l) % 2 == 1 && map[i+k][j+l] != 'B') {
						W++;
					}
					if ((k + l) % 2 == 0 && map[i + k][j + l] != 'B') {
						B++;
					}
					else if ((k + l) % 2 == 1 && map[i + k][j + l] != 'W') {
						B++;
					}
				}
			}
			if (W < B && W < min)
				min = W;
			else if (W >= B && B < min)
				min = B;
		}
	}
	cout << min << endl;
	return 0;
}