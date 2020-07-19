package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nqueen_9663 {
	
	static int N, ans = 0;
	static boolean visited[][];
	
	//현위치를 인자로 받는다. i는 행 k는 열
	//그 위치가 퀸이 들어갈 수 있는 자리인가?
	static boolean queenOK(int i, int k) {
		int x, y;
		//해당 위치로부터 왼쪽 행을 싹 검사
		for(x = 0; x < k; x++) {
			if(visited[i][x])
				return false;
		}
		//좌상 대각선
		for(x = i - 1, y = k - 1; x >= 0 && y>=0 ;x--,y--) {
			if(visited[x][y])
				return false;
		}
		//좌하 대각선
		for(x = i + 1, y = k - 1; x < N && y>=0 ; x++,y--) {
			if(visited[x][y])
				return false;
		}
		//0,0일때나 모든 반복문이 통과되었을 때 true반환
		return true;
	} 
	
	static void nqueen(int k) {
		//열을 모두 탐색해서 true가 된다면 경우의 수 더하기
		if(k == N) {
			ans++;
			return;
		}
		//한 열을 고정 시키고 행을 하나 하나씩 증가 시켜가면서 모든 경우를 체크
		//앞의 N과 M문제와 동일! 조건만 잘 정의하도록 하자!
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
