package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌_1436 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader를 통한 입출력 방식 Scanner에 비해 빠르다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader는 예외처리가 필요하다. 따라서 throws IOException...
		int N = Integer.parseInt(br.readLine());
		int num = 0 ; //출력할 숫자변수 선언
		
		//666을 포함하는 숫자가 오면 N을 1씩 감소시키는 알고리즘
		//N이 0이되면 그 숫자가 666을 포함하는 N번째로 작은 수
		/*
		while(N > 0) {
			num++;
			String temp = Integer.toString(num);
			if(temp.contains("666"))
				N--;
		}
		*/
		
		//666부터 수를 올려나가면서 666이 들어가는 수를 나누기 반복으로 찾아냄
		//찾았으면 count를 증가시키고 count가 N과 같다면 반복문을 빠져나옴.!
		int i, cnt = 0;
		for(i = 666; cnt != N; i++) {
			for(num = i ; num > 0 ; num/=10) {
				if(num % 1000 == 666) {
					cnt++;
					break;	
				}
			}
		}
		System.out.println(i-1);
	}
}
