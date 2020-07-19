#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main(void) {
	int N, k, max=0;
	scanf("%d", &N);
	int* list = new int[10001]{ 0 };
	for (int i = 0; i < N; i++) {
		scanf("%d", &k);
		list[k]++;
		if (max < k)
			max = k;
	}
	
	for (int i = 0; i < max+1; i++) {
		for (int j = 0; j < list[i]; j++) {
			printf("%d\n", i);
		}
	}
	return 0;
}