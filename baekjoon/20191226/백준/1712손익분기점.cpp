#include <iostream>
using namespace std;

int main() {
	int fcost = 0 , vcost = 0, price = 0;
	cin >> fcost >> vcost >> price;
	if (vcost >= price) {
		cout << -1;
	}
	else {
		cout << fcost / (price - vcost) + 1; // 이익이 되는 부분이 고정비용을 넘어서는 순간 손익분기점!
	}
	return 0;
}