// 10989���� �ذ��ߴ� ��������� �̿��Ͽ� Ǯ��!
// ���������̹Ƿ� count �迭�� ������ ����!

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

