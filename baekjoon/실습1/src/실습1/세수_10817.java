/*백준 10817
 * 세 수
 * 2020-04-03
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//세 수 입력
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//세 수의 합
		int sum = a + b + c;
		//세 수의 최대, 최솟값
		int max = Math.max(Math.max(a, b),c);
		int min = Math.min(Math.min(a, b),c);
		
		//두번째로 큰 수는 최댓값, 최솟값 빼면 됨
		//출력
		System.out.println(sum-max-min);
		
		sc.close();
	}
}
