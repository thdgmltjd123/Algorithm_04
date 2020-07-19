package 백트래킹;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class N과M_15651 {
	static int N, M;
	static int arr[];
	//시간초과가 발생해서 bufferedWriter를 사용하였음
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void Permutation(int k) throws IOException {
		if(k == M) {
			for(int i = 0 ; i < M; i++) {
				bw.write(String.valueOf(arr[i])+" ");
			}
			bw.newLine();
			return;
		}
		//첫번째 문제에서 방문조건만 없애면 중복을 허용함!
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
		
		//할당한 버퍼가 가득차지 않았을 때, 출력을 하지 않을
		//이 명령어는 버퍼에 담긴 내용을 싹 출력하는 기능
		bw.flush();
	}
}
