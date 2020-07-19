package 배열;

import java.util.Scanner;

public class 평균_1546 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0; double sum = 0;
		//자바는 C와 다르게 변수로 배열선언이 가능
		//점수는 double형으로 만들어줘서 나눌 때 소숫점 나올 수 있게.
		double[] score = new double[N];
		//배열에 값 추가
		for (int i = 0 ; i < N; i++) {
			score[i] = sc.nextInt();
			if(max < score[i])
				max = (int)score[i];
		}
		//합 계산
		for (int i = 0 ; i < N; i++) {
			score[i] = (score[i] / max) * 100;  
			sum += score[i];
		}
		//평균 출력
		System.out.println(sum/N);
	}
}
