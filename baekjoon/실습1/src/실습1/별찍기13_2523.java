/*���� 2523
 * �� ���-13
 * 2020-04-03*/
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < 2*N-1;i++) { // �� ��
			if(i <= N-1) 				// 1ȸ���� Nȸ���� ������
				for(int j = 0; j < i+1; j++) { 
					System.out.print('*');
				}
			else 						// N-1ȸ���� 1ȸ����
				for(int j = i - 2*(i-N) - 1; j > 0; j--) {
					System.out.print('*');
				}
			System.out.println(); 		//�� �ٲ�
		}
	}
}
