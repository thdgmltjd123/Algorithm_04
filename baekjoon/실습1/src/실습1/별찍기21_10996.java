/*���� 10996 
 * �����21
 * 2020-04-10*/
package �ǽ�1;

import java.util.Scanner;

public class �����21_10996 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// ���� ������ N�� �ݺ��ؼ� ������.
		for(int i = 0; i < N; i++) {
			//Ȧ�� �ٿ��� (N-1)/2 + 1 ���� ������(1,1,2,2,3,3)
			for(int j = 0 ; j < (N-1) / 2 + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
			//¦�� �ٿ��� N/2 ���� ������(0,1,1,2,2,3,3)
			for(int j = 0; j < N/2; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
