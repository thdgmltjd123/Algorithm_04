package ��Ʈ��ŷ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nqueen_9663 {
	
	static int N, ans = 0;
	static boolean visited[][];
	
	//����ġ�� ���ڷ� �޴´�. i�� �� k�� ��
	//�� ��ġ�� ���� �� �� �ִ� �ڸ��ΰ�?
	static boolean queenOK(int i, int k) {
		int x, y;
		//�ش� ��ġ�κ��� ���� ���� �� �˻�
		for(x = 0; x < k; x++) {
			if(visited[i][x])
				return false;
		}
		//�»� �밢��
		for(x = i - 1, y = k - 1; x >= 0 && y>=0 ;x--,y--) {
			if(visited[x][y])
				return false;
		}
		//���� �밢��
		for(x = i + 1, y = k - 1; x < N && y>=0 ; x++,y--) {
			if(visited[x][y])
				return false;
		}
		//0,0�϶��� ��� �ݺ����� ����Ǿ��� �� true��ȯ
		return true;
	} 
	
	static void nqueen(int k) {
		//���� ��� Ž���ؼ� true�� �ȴٸ� ����� �� ���ϱ�
		if(k == N) {
			ans++;
			return;
		}
		//�� ���� ���� ��Ű�� ���� �ϳ� �ϳ��� ���� ���Ѱ��鼭 ��� ��츦 üũ
		//���� N�� M������ ����! ���Ǹ� �� �����ϵ��� ����!
		for(int i = 0 ; i < N; i++) {
			if(!visited[i][k] && queenOK(i,k)) {
				visited[i][k] = true;
				nqueen(k+1);
				visited[i][k] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		visited = new boolean[N][N];
		nqueen(0);
		System.out.println(ans);
	}
}
