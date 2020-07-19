package 배열;

import java.util.Scanner;

public class 나머지_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 나머지 배열
		int[] remainder = new int[10];
		// 나머지 수, 순차 체크 변수
		int number,count = 0;
		// 서로 다른 나머지의 수
		int realcount = 0;
		// 나머지 배열에 나머지 저장
		for (int i = 0 ; i < remainder.length  ; i++) {
			number = sc.nextInt();
			remainder[i] = number % 42;
		}
		// 밀어내기 식 검사
		for(int i = 0 ; i < remainder.length;i++) {
			for(int j = i+1 ; j < remainder.length; j++) {
				if(remainder[i] == remainder[j])
					count++;
			}
			//같은 것이 없다면
			if(count == 0)
				realcount++;
			//더해진 count 값 초기화
			count = 0;
		}
		System.out.println(realcount);
	}
}
