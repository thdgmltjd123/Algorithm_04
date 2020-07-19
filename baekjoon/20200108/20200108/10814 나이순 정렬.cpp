#include<iostream>
#include<algorithm>
#include<vector>
#include<string>

using namespace std;

bool sortbyage(const pair<int, string> &a, const pair<int, string> &b) {
	if (a.first < b.first)
		return true;
	return false;
}

int main(void) {
	int N;
	cin >> N;
	vector<pair<int, string>> ojp(N);
	for (int i = 0; i < N; i++) {
		cin >> ojp[i].first >> ojp[i].second;
	}
	stable_sort(ojp.begin(), ojp.end(), sortbyage);

	for (int i = 0; i < N; i++) {
		cout << ojp[i].first << " " << ojp[i].second << "\n";
	}

}