/*백준 2523
 * 별 찍기-13
 * 2020-04-03*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < 2*N-1;i++) { // 줄 수
			if(i <= N-1) 				// 1회부터 N회찍을 때까지
				for(int j = 0; j < i+1; j++) { 
					System.out.print('*');
				}
			else 						// N-1회부터 1회까지
				for(int j = i - 2*(i-N) - 1; j > 0; j--) {
					System.out.print('*');
				}
			System.out.println(); 		//줄 바꿈
		}
	}
}
