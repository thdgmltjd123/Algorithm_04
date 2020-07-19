#include <iostream>
using namespace std;

int main(void)
{
	int n, m, min, sum = 0;
	bool flag = false;
	int arr[10001] = { 0, };
	cin >> n >> m;
	for (int i = 2; i <= 10000; i++)
	{
		for (int j = i + i; j <= 10000; j += i)
		{
			if (arr[j] == 0)arr[j] = 1;
		}
	}
	for (int i = n; i <= m; i++)
	{
		if (arr[i] == 0 && flag == false && i != 1)
		{
			min = i;
			flag = true;
			sum += i;
			continue;
		}
		if (arr[i] == 0 && i != 1)sum += i;
	}
	if (!flag)cout << -1;
	else cout << sum << '\n' << min;
	return 0;
}