/* 2020-04-24
 * 2577 숫자의 갯수
 * 송희성*/

package 배열;

import java.util.Scanner;

public class 숫자의개수_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A,B,C 입력받기
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		// A*B*C 저장
		int ABC = A*B*C;
		// 0~9까지 숫자의 개수를 담는 배열 생성
		int[] counts = new int[10];
		// 나머지 : 배열의 원소가 됨.
		// 몫 : 자릿수가 하나 빠짐.
		while (ABC > 0) {
			counts[ABC % 10]++;
			ABC /= 10;
		}
		//출력
		for(int i = 0 ; i < counts.length;i++) {
			System.out.println(counts[i]);
		}
	}
}
