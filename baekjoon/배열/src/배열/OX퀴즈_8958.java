package �迭;

import java.util.Arrays;
import java.util.Scanner;
public class OX����_8958 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//nextInt�� nextLine�� ���� ���̸� ������ nextInt��
		//���๮���� nextLine�� �԰ԵǹǷ� ox�� nextLine�� �� �ް� ������
		//�ٷ� nextInt �ڿ� nextLineó���� �ʿ�.
		int N = sc.nextInt();
		sc.nextLine();
		//�����迭 ���� �� 0���� �ʱ�ȭ
		int[] score = new int[N];
		Arrays.fill(score, 0);
		//�˰���
		for (int i = 0 ; i < N; i++) {
			String ox = sc.nextLine();
			int O = 1;
			for (int j = 0 ; j < ox.length(); j++) {
				//X�� �� O�� �ʱ�ȭ
				if(ox.charAt(j) == 'X')	//ox�� string�̹Ƿ� string method���
					O = 1;
				//O�� �� score�迭�� ���� O�� �����ְ�, O�� �����ֱ�
				else {
					score[i]+=O;
					O++;
				}
			}
		}
		//score �迭 ���
		for(int i = 0; i < N; i++) {
			System.out.println(score[i]);
		}
	}
}
