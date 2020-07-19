package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sort {
	public static void insertion_sort(int[] list, int n) {
		int i, j, key;
	
		for (i = 1; i < n; i++) {
			key = list[i];
			for (j = i - 1; j >= 0 && list[j] > key; j--) {
				list[j + 1] = list[j];
			}
			list[j + 1] = key;
		}
	}
}

public class 수정렬_2750 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] li = new int[N];
		for (int i = 0 ; i <N ; i++) {
			li[i]=Integer.parseInt(br.readLine());
		}
		sort.insertion_sort(li,N);
		
		for(int i = 0 ; i < N; i++) {
			System.out.println(li[i]);
		}
	}
}
