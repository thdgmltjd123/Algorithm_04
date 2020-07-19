/*2020-05-22
 *백준 2798 블랙잭
  20150711 송희성*/

package 브루트포스;

import java.util.Scanner;

public class 블랙잭_2798 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cards = new int[N];
		//배열에 원소 저장
		for (int i = 0 ; i < N ; i++) {
			cards[i] = sc.nextInt();
		}
		//M과 가장 가까운 값을 찾기 위해
		//예제 1에서 567, 568, 569, 578, 579, 589
		//느낌으로 반복문 설계
		int temp = 0, sum = 0;
		for (int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				for(int k = j+1; k < N; k++) {
					temp = cards[i] + cards[j] + cards[k];
					if(temp <= M && temp > sum)
						sum = temp;
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
