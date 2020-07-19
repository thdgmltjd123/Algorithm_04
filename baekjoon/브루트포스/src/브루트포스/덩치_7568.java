/*2020-05-22
 *백준 7568 덩치
 *20150711 송희성*/
package 브루트포스;

import java.util.Scanner;

class Human{
	//디폴트 생성자
	Human(){}
	//클래스 멤버변수
	int weight;
	int height;
	//덩치왕으로 시작
	int rank = 1;
}

public class 덩치_7568 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//객체 배열 생성
		Human[] arr = new Human[N];
		//객체에 데이터 입력
		for (int i = 0 ; i < N; i++) {
			//배열 원소별 각각의 객체 생성
			arr[i] = new Human();
			arr[i].weight = sc.nextInt();
			arr[i].height = sc.nextInt();
		}
		//두 사람 간 비교이므로 이중 반복문을 사용.
		for (int i = 0 ; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				//내 덩치가 클 때
				if (arr[i].height > arr[j].height && arr[i].weight > arr[j].weight)
					arr[j].rank++;
				//친구 덩치가 클 때
				else if (arr[i].height < arr[j].height && arr[i].weight < arr[j].weight)
					arr[i].rank++;
			}
		}
		//출력
		for (int i = 0 ; i < N; i++) {
			System.out.print(arr[i].rank + " ");
		}
		sc.close();
	}
}
