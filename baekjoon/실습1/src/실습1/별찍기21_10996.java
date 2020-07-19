/*백준 10996 
 * 별찍기21
 * 2020-04-10*/
package 실습1;

import java.util.Scanner;

public class 별찍기21_10996 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 작은 도형이 N번 반복해서 찍힌다.
		for(int i = 0; i < N; i++) {
			//홀수 줄에는 (N-1)/2 + 1 개가 찍힌다(1,1,2,2,3,3)
			for(int j = 0 ; j < (N-1) / 2 + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
			//짝수 줄에는 N/2 개가 찍힌다(0,1,1,2,2,3,3)
			for(int j = 0; j < N/2; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
