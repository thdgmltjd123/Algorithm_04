package 배열;

import java.util.Arrays;
import java.util.Scanner;
public class OX퀴즈_8958 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//nextInt와 nextLine이 같이 쓰이면 정수는 nextInt가
		//개행문제는 nextLine이 먹게되므로 ox에 nextLine을 잘 받고 싶으면
		//바로 nextInt 뒤에 nextLine처리가 필요.
		int N = sc.nextInt();
		sc.nextLine();
		//점수배열 선언 및 0으로 초기화
		int[] score = new int[N];
		Arrays.fill(score, 0);
		//알고리즘
		for (int i = 0 ; i < N; i++) {
			String ox = sc.nextLine();
			int O = 1;
			for (int j = 0 ; j < ox.length(); j++) {
				//X일 때 O값 초기화
				if(ox.charAt(j) == 'X')	//ox는 string이므로 string method사용
					O = 1;
				//O일 때 score배열에 현재 O값 더해주고, O값 더해주기
				else {
					score[i]+=O;
					O++;
				}
			}
		}
		//score 배열 출력
		for(int i = 0; i < N; i++) {
			System.out.println(score[i]);
		}
	}
}
