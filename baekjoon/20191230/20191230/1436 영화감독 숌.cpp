#include <iostream>
#include <cmath>
#include <string>
#include <algorithm>
using namespace std;

int main(void){
	int cnt = 0, N, i = 666;
	cin >> N;
	while (cnt < N) {
		string s = to_string(i); // autoŰ���� --> Ÿ�� �߷����ִ� Ű����..!!
		if (s.find("666") != string::npos) { // Ư�� ���ڿ����� Ư�� ���ڿ��� ã�� �Լ� find("") 
			cnt++; // == string::npos --> ���ڿ��� �ȿ� ������ string::npos ��ȯ ���� ������ string::npos�� �ƴ� ���� ī��Ʈ ����.
			if (cnt == N) {
				cout << s << endl;
				break;
			}
		}
		i++; // 666���� �� ���ھ� �������Ѽ� 666�� ���� ���� ã�Ƽ� ���!
	}
	return 0;
}