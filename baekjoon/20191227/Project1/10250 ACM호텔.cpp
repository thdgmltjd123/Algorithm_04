#include <iostream>
using namespace std;

int main(void) {
	int K;
	cin >> K;
	int H, W, N;
	for (int i = 0; i < K; i++) {
		int X = 1, Y = 1;
		cin >> H >> W >> N;
		Y = N % H;
		if (Y == 0) {
			Y = H;
			X--;
		}
		X += N / H;
		if (X >= 10)
			cout << Y << X << endl;
		else
			cout << Y << '0' << X << endl;
	}
}