#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

bool sortbysec(const pair<int, int>& a, const pair<int, int>& b) {
	if (a.second < b.second)
		return true;
	else if (a.second == b.second)
		return a.first < b.first;
	else
		return false;
}

int main(void) {
	int N;
	cin >> N;
	vector<pair<int, int>> a(N);
	for (int i = 0; i < N; i++) {
		cin >> a[i].first >> a[i].second;
	}

	sort(a.begin(), a.end(), sortbysec);

	for (int i = 0; i < N; i++) {
		cout << a[i].first << " " << a[i].second << "\n";
	}
}