package ��Ʈ��ŷ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N��M_15651 {
	static int N, M;
	static int arr[];
	//�ð��ʰ��� �߻��ؼ� bufferedWriter�� ����Ͽ���
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void Permutation(int k) throws IOException {
		if(k == M) {
			for(int i = 0 ; i < M; i++) {
				bw.write(String.valueOf(arr[i])+" ");
			}
			bw.newLine();
			return;
		}
		//ù��° �������� �湮���Ǹ� ���ָ� �ߺ��� �����!
		for(int i = 1; i <= N; i++) {
			arr[k] = i;
			Permutation(k+1);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		arr = new int[M];
		Permutation(0);
		
		//�Ҵ��� ���۰� �������� �ʾ��� ��, ����� ���� ����
		//�� ��ɾ�� ���ۿ� ��� ������ �� ����ϴ� ���
		bw.flush();
	}
}
