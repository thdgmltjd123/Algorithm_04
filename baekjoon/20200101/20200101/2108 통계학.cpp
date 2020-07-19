#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;

double mean(int list[], int n) {
	double sum=0;
	for (int i = 0; i < n; i++) {
		sum += list[i];
	}
	return round( sum / (double)n );
}

int median(int list[], int n) {
	sort(list, list + n);
	return list[n / 2];
}

int mode(int list[], int n) {
	int cnt[8001] = {0};
	int min = 0, max = 0;
	for (int i = 0; i < n; i++) {
		if (list[i] < 0) {
			cnt[4000 - abs(list[i])]++;
			if (min > list[i])
				min = list[i];
		}
		else if (list[i] > 0) {
			cnt[4000 + list[i]]++;
			if (max < list[i])
				max = list[i];
		}
		else
			cnt[4000]++;
	}
	int cmax = 0, count = 0, k = 0;
	int* iarr = new int[500000];
	for (int i = 4000 - abs(min); i < 4000 + abs(max) + 1; i++) {
		if (cmax < cnt[i])
			cmax = cnt[i];
	}
	for (int i = 4000 - abs(min); i < 4000 + abs(max) + 1; i++) {
		if (cnt[i] == cmax) {
			count++;
			iarr[k++] = i;
		}
	}
	if (count == 1)
		return iarr[0] - 4000;
	else
		return iarr[1] - 4000;

}

int range(int list[], int n) {
	int min = list[0], max = list[0];
	for (int i = 1; i < n; i++) {
		if (min > list[i])
			min = list[i];
		if (max < list[i])
			max = list[i];
	}
	return max - min;
}

int main(void) {
	int N;
	int avg, middle, mfreq, leng;
	cin >> N;
	int* list = new int[500000];
	for (int i = 0; i < N; i++) {
		cin >> list[i];
	}
	avg = mean(list, N);
	middle = median(list, N);
	mfreq = mode(list, N);
	leng = range(list, N);

	cout << avg << '\n' << middle << '\n' << mfreq << '\n' << leng << '\n';
	return 0;
}