//O(n^2)�� ����� ���� �˰��� ����

#include <iostream>
using namespace std;

void swap(int a, int b) {
	int temp = a;
	a = b;
	b = temp;
}
//��������
void bubble_sort(int list[], int n) {
	for (int i = 0; i < n - 1; i++) {
		for (int j = 1; j < n - i; j++)
			if (list[j - 1] > list[j])
				swap(list[j - 1], list[j]);
	}
}

//��������
void selection_sort(int list[], int n) {
	for (int i = 0; i < n-1; i++) {
		int tmp = i;
		for (int j = i + 1; j < n; j++) {
			if (list[tmp] >= list[j])
				tmp = j;
		}
		swap(list[i], list[tmp]);
	}
}
// ��������
void insertion_sort(int list[], int n) {
	int i, j, key;

	for (i = 1; i < n; i++) {
		key = list[i];
		for (j = i - 1; j >= 0 && list[j] > key; j--) {
			list[j + 1] = list[j];
		}
		list[j + 1] = key;
	}
}

int main() {
	int N;
	int list[1001];
	cin >> N;
	for (int i = 0; i < N; i++) {
		cin >> list[i];
	}
	bubble_sort(list, N);
	
	for (int i = 0; i < N; i++) {
		cout << list[i] << endl;
	}
}