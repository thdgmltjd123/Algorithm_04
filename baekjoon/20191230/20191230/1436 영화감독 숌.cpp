#include <iostream>
#include <cmath>
#include <string>
#include <algorithm>
using namespace std;

int main(void){
	int cnt = 0, N, i = 666;
	cin >> N;
	while (cnt < N) {
		string s = to_string(i); // auto키워드 --> 타입 추론해주는 키워드..!!
		if (s.find("666") != string::npos) { // 특정 문자열에서 특정 문자열을 찾는 함수 find("") 
			cnt++; // == string::npos --> 문자열이 안에 없으면 string::npos 반환 따라서 있으면 string::npos가 아님 따라서 카운트 증가.
			if (cnt == N) {
				cout << s << endl;
				break;
			}
		}
		i++; // 666부터 한 숫자씩 증가시켜서 666이 들어가는 것을 찾아서 출력!
	}
	return 0;
}