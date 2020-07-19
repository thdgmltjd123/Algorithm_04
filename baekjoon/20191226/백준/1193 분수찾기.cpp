#include <iostream>

using namespace std;

int main() {
	int bunja = 1, bunmo = 1, X;
	int tot=0;
	cin >> X;
	if (1 <= X <= 10000000) {
		if (X == 1)
			cout << bunja << "/" << bunmo << endl;
		else {
			for (int i = 0; i < X-1; i++) {
				tot += bunja + bunmo;
				if (tot % 2 == 1 && bunmo == 1) {
					bunja++;
				}
				else if (tot % 2 == 0 && bunja == 1) {
					bunmo++;
				}
				else if (tot % 2 == 1) {
					bunmo--;
					bunja++;
				}
				else if (tot % 2 == 0) {
					bunmo++;
					bunja--;
				}
				tot = 0;
			}
			cout << bunja << "/" << bunmo << endl;
		}
	}
	return 0;
}
