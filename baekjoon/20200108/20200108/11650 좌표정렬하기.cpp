#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int main()
{
	int count;

	cin >> count;
	vector<pair<int, int>> a(count);

	for (int i = 0; i < count; i++)
	{
		cin >> a[i].first >> a[i].second;
	}

	sort(a.begin(), a.end());

	for (int i = 0; i < count; i++)
	{
		cout << a[i].first << " " << a[i].second << '\n';
	}


	return 0;
}