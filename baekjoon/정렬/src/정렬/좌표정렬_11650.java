/*과제가 정말
 * 너무 많다 그치
 * 한개 두개였으면
 * 흥미로 해볼만도 한데
 * 이건 뭐.. 힘드네*/
package 정렬;

import java.util.Scanner;
import java.util.Arrays;

//Pair 구조체에 compareTo 함수 오버로딩
class Pair implements Comparable<Pair>{
	int x;
	int y;
	public Pair() {}
	//생성자
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//getter 구현!!
	public int first() {
		return x;
	}
	public int second() {
		return y;
	}
	public int compareTo(Pair pair) {
		//큰 if문 첫 번째 기준으로 먼저 정렬
		//작은 if문 두 번째 기준으로 정렬
		if(this.x < pair.first())
			return -1;
		else if(this.x == pair.first()) {
			if(this.y < pair.second())
				return -1;
			else if(this.y == pair.second())
				return 0;
			else
				return 1;
		}
		else
			return 1;
	}
}

public class 좌표정렬_11650 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//좌표 배열 생성
		Pair[] pointarr = new Pair[N];
		//배열 돌면서 좌표 저장
		for (int i = 0 ; i < N; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			pointarr[i] = new Pair(first, second);
		}
		sc.close();
		//위에서 오버로딩된 compareTo가 사용됨.
		Arrays.sort(pointarr);
		//출력
		for(int i = 0 ; i<pointarr.length; i++) {
			System.out.println(pointarr[i].first() + " "+pointarr[i].second());
		}
	}
}
