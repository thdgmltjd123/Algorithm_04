/*���� 10817
 * �� ��
 * 2020-04-03
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//�� �� �Է�
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//�� ���� ��
		int sum = a + b + c;
		//�� ���� �ִ�, �ּڰ�
		int max = Math.max(Math.max(a, b),c);
		int min = Math.min(Math.min(a, b),c);
		
		//�ι�°�� ū ���� �ִ�, �ּڰ� ���� ��
		//���
		System.out.println(sum-max-min);
		
		sc.close();
	}
}
