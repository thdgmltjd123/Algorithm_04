package �迭;

import java.util.Scanner;

public class ���_1546 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0; double sum = 0;
		//�ڹٴ� C�� �ٸ��� ������ �迭������ ����
		//������ double������ ������༭ ���� �� �Ҽ��� ���� �� �ְ�.
		double[] score = new double[N];
		//�迭�� �� �߰�
		for (int i = 0 ; i < N; i++) {
			score[i] = sc.nextInt();
			if(max < score[i])
				max = (int)score[i];
		}
		//�� ���
		for (int i = 0 ; i < N; i++) {
			score[i] = (score[i] / max) * 100;  
			sum += score[i];
		}
		//��� ���
		System.out.println(sum/N);
	}
}
