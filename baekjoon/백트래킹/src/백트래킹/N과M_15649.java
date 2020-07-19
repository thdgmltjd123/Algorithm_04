package ��Ʈ��ŷ;

import java.util.Scanner;


public class N��M_15649 {
	static int N,M;
	static int[] numarr = new int[9];
	static boolean[] visited = new boolean[9];
	
	static void permutation(int k) {
		//���̿� �����Ͽ��� �� ����ϰ� �Լ� ����
		if(k == M) {
			for(int i = 0; i < M; i++) {
				System.out.print(numarr[i]+" ");
			}
			System.out.println();
			return;
		}
		//if M�� 4�϶� �ʹ���ƴ� �̰� ��� ¥..�Ф�
		//ffff���� tfff(1~)�ΰ��
		//ttff(12~)-->tttf(1234),ttft(1243)
		//tftf(13~)-->tttf(1324),tftt(1342)
		//tfft(14~)-->ttft(1423),tftt(1432)
		for(int i = 1; i <= N; i++) {
			if(visited[i] == false) {
				visited[i] = true;
				numarr[k] = i;
				permutation(k+1);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		permutation(0);
		sc.close();
	}
}
