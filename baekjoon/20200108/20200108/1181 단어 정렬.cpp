#include<iostream>
#include<algorithm>
#include<vector>
#include<string>
using namespace std;

bool sortbysize(const string& a, const string& b) {
	if (a.length() < b.length())
		return true;
	else if (a.length() == b.length()) {
		if (a.compare(b) < 0)
			return true;
		else
			return false;
	}
	else
		return false;
}

int main(void) {
	int N;
	cin >> N;
	vector<string> a(N);
	for (int i = 0; i < N; i++) {
		cin >> a[i];
	}

	sort(a.begin(), a.end(),sortbysize);

	for (vector<string>::iterator iter1 = a.begin(); iter1 != a.end(); ++iter1) {
		for (vector<string>::iterator iter2 = iter1+1; iter2 != a.end();) {
			if ((*iter1).compare(*iter2) == 0) {
				iter2 = a.erase(iter2);
			}
			else
				++iter2;
		}
	}

	for (int i = 0; i < a.size(); i++) {
		cout << a[i] << '\n';
	}
	return 0;
}