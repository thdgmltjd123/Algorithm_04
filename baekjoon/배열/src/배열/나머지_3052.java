package �迭;

import java.util.Scanner;

public class ������_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// ������ �迭
		int[] remainder = new int[10];
		// ������ ��, ���� üũ ����
		int number,count = 0;
		// ���� �ٸ� �������� ��
		int realcount = 0;
		// ������ �迭�� ������ ����
		for (int i = 0 ; i < remainder.length  ; i++) {
			number = sc.nextInt();
			remainder[i] = number % 42;
		}
		// �о�� �� �˻�
		for(int i = 0 ; i < remainder.length;i++) {
			for(int j = i+1 ; j < remainder.length; j++) {
				if(remainder[i] == remainder[j])
					count++;
			}
			//���� ���� ���ٸ�
			if(count == 0)
				realcount++;
			//������ count �� �ʱ�ȭ
			count = 0;
		}
		System.out.println(realcount);
	}
}
