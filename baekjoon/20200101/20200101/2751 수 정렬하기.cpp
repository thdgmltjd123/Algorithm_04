#include <iostream>
using namespace std;

int* arr = new int[1000001];
//합병 정렬 알고리즘
void merge(int list[], int s, int e, int m){
	int i = s, k = s, j = m + 1;
	while (i <= m && j <= e) {
		if (list[i] < list[j])
			arr[k++] = list[i++];
		else if (list[i] > list[j])
			arr[k++] = list[j++];
	}
	while (i <= m) {
		arr[k++] = list[i++];
	}
	while (j <= e) {
		arr[k++] = list[j++];
	}
	for (int l = s; l <= e; l++) {
		list[l] = arr[l];
	}
}

void mergesort(int list[],int s, int e) {
	if (s < e) {
		int m = (s + e) / 2;
		mergesort(list, s, m);
		mergesort(list, m + 1, e);

		merge(list, s, e, m);
	}
}

int main(void) {

	int N;
	int* list = new int[1000001];
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> list[i];
	}
	mergesort(list, 0, N-1);

	for (int i = 0; i < N; i++) {
		cout << list[i] << '\n';
	}
	return 0;
}