// 10989에서 해결했던 계수정렬을 이용하여 풀이!
// 내림차순이므로 count 배열의 끝부터 진행!

#include <iostream>
#include <string>
using namespace std;

int main(void)
{
	int count[10] = { 0, };
	string s;
	cin >> s;
	for (int i = 0; i < s.length(); i++)
	{
		count[s[i] - '0']++;
	}
	for (int i = 9; i >= 0; i--)
	{
		for (int j = 0; j < count[i]; j++)
		{
			cout << i;
		}
	}
	return 0;
}

