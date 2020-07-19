#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

int main(void) {
	int N,i;
	int sum = 0,ans=0;
	cin >> N;
	for (i = 0; i < N; i++) {
		string M = to_string(i);
		ans = stoi(M);
		for (int j = 0; j < M.size() ; j++) {
			sum += M.at(j) - '0';
		}
		sum += ans;
		if (sum == N)
			break;
		sum = 0;
	}
	if (sum != N)
		cout << 0 << endl;
	else
		cout << i << endl;
}