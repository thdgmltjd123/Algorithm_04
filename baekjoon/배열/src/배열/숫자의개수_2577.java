/* 2020-04-24
 * 2577 ������ ����
 * ����*/

package �迭;

import java.util.Scanner;

public class �����ǰ���_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A,B,C �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		// A*B*C ����
		int ABC = A*B*C;
		// 0~9���� ������ ������ ��� �迭 ����
		int[] counts = new int[10];
		// ������ : �迭�� ���Ұ� ��.
		// �� : �ڸ����� �ϳ� ����.
		while (ABC > 0) {
			counts[ABC % 10]++;
			ABC /= 10;
		}
		//���
		for(int i = 0 ; i < counts.length;i++) {
			System.out.println(counts[i]);
		}
	}
}
