package �迭;

import java.util.Scanner;

public class �ִ�_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//�ִ� �����, �ε��� �����
		int temp = 0 ,idx = 0;
		//�ִ񰪰� ��ġ�� ���ÿ� �Է� �����鼭 ����(�� ��� ����..��)
		for(int i = 0; i < 9; i++) {
			int N =sc.nextInt();
			if(temp < N) {
				temp = N;
				idx = i+1;
			}
		}
		//���
		System.out.println(temp + "\n" + idx);
	}
}
