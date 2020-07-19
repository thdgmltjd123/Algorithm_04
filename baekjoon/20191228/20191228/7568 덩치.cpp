#include <iostream>
using namespace std;

class Person {
public:
	int dngsu;
	int height;
	int weight;
};

int main(void) {
	int N;
	cin >> N;
	Person* human = new Person[N];

	for (int i = 0; i < N; i++) {
		int x, y;
		cin >> x >> y;
		human[i].weight = x;
		human[i].height = y;
		human[i].dngsu = 1;
	}

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			if (human[j].weight > human[i].weight&& human[j].height > human[i].height) {
				human[i].dngsu++;
			}
		}
	}
	for (int i = 0; i < N; i++) {
		cout << human[i].dngsu << " ";
	}
}