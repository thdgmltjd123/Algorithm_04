/*���� 2446 
 * �����9
 * 2020-04-10*/
package �ǽ�1;
import java.util.Scanner;

public class �����9_2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//���� �Է� �ޱ�
		int N =sc.nextInt();
		//ó�� N ��
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++)
				System.out.print(' ');
			for(int j = 2*N-1 ; j > 2*i ; j--)
				System.out.print('*');
			System.out.println();
		}
		//�� ���� N-1�� 
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < N-i-2; j++)
				System.out.print(' ');
			for(int j = 0 ; j < 2*i+3 ; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
