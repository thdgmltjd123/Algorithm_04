/*2020-05-22
 *���� 2798 ����
  20150711 ����*/

package ���Ʈ����;

import java.util.Scanner;

public class ����_2798 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cards = new int[N];
		//�迭�� ���� ����
		for (int i = 0 ; i < N ; i++) {
			cards[i] = sc.nextInt();
		}
		//M�� ���� ����� ���� ã�� ����
		//���� 1���� 567, 568, 569, 578, 579, 589
		//�������� �ݺ��� ����
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
