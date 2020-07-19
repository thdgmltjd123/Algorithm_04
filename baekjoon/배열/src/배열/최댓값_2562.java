package 배열;

import java.util.Scanner;

public class 최댓값_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//최댓값 저장소, 인덱스 저장소
		int temp = 0 ,idx = 0;
		//최댓값과 위치를 동시에 입력 받으면서 저장(이 방법 좋다..ㅎ)
		for(int i = 0; i < 9; i++) {
			int N =sc.nextInt();
			if(temp < N) {
				temp = N;
				idx = i+1;
			}
		}
		//출력
		System.out.println(temp + "\n" + idx);
	}
}
