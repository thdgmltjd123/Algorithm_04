#include <iostream>
using namespace std;

int main() {
	int fcost = 0 , vcost = 0, price = 0;
	cin >> fcost >> vcost >> price;
	if (vcost >= price) {
		cout << -1;
	}
	else {
		cout << fcost / (price - vcost) + 1; // ������ �Ǵ� �κ��� ��������� �Ѿ�� ���� ���ͺб���!
	}
	return 0;
}