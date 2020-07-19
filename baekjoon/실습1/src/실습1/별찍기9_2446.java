/*백준 2446 
 * 별찍기9
 * 2020-04-10*/
package 실습1;
import java.util.Scanner;

public class 별찍기9_2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//변수 입력 받기
		int N =sc.nextInt();
		//처음 N 줄
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++)
				System.out.print(' ');
			for(int j = 2*N-1 ; j > 2*i ; j--)
				System.out.print('*');
			System.out.println();
		}
		//그 다음 N-1줄 
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < N-i-2; j++)
				System.out.print(' ');
			for(int j = 0 ; j < 2*i+3 ; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
