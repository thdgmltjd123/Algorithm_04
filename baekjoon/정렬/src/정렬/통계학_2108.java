/*과제가 정말
 * 너무 많다 그치
 * 한개 두개였으면
 * 흥미로 해볼만도 한데
 * 이건 뭐.. 힘드네*/

package 정렬;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//중위값 및 최빈값 산출을 위한 퀵소트 알고리즘 구현.
class Quick{
	public static void sort(int[] data, int start, int end) {
		//피봇 중앙값..!!
		int pivot = data[(start + end) / 2];
		int left = start;
		int right = end;
		//항상 피봇의 위치때문에 헷갈리니 피봇을 가운데로 두고, 항상 r pivot l형태가 될 수 있도록 구현
		while(left<=right) {
			//left 행동 따로
			while(data[left] < pivot)
				left++;
			//right 행동 따로
			while(data[right] > pivot)
				right--;
			//left는 피봇보다 크고, right는 피봇보다 작을 때
			if(left <= right) {
				if(left != right) {
					int tmp = data[left];
					data[left] = data[right];
					data[right] = tmp;
				}
				left++;right--;
			}
		}
		//피봇 기준 오른쪽
		if(left < end)
			sort(data, left, end);
		//피봇 기준 왼쪽
		if(start < right)
			sort(data, start, right);
	}
}

//통계량 산출하는 클래스 정의
class Statistics{
	//산술평균 method
	public static int mean(int[] numarr) {
		double sum = 0;
		for(int i = 0 ; i < numarr.length; i++) {
			sum+=numarr[i];
		}
		return (int) Math.round(sum / numarr.length);
	}
	//중앙값 method
	public static int median(int[] numarr) {
		//배열을 먼저 정렬한다.
		Quick.sort(numarr, 0, numarr.length-1);
		//N은 홀수이므로 홀수의 경우만 생각한다.
		return numarr[numarr.length / 2];
	}
	//최빈값 method
	public static int mode(int[] numarr) {
		//자바는 int 배열 생성시 default로 0으로 초기화 됨
		//-4000~4000까지 수를 담는 카운팅 배열 생성
		int[] cnt = new int[8001];
		//index 0이 -4000이므로 해당 숫자에 4000을 더하면 올바른 위치임
		for(int i = 0 ; i < numarr.length; i++) {
			cnt[numarr[i]+4000]++;
		}
		//최빈값을 찾기 위해 카운트배열의 최댓값을 찾는다.
		int cntmax = cnt[0];
		for(int i = 1 ; i < cnt.length; i++) {
			if(cntmax < cnt[i])
				cntmax = cnt[i];
		}
		//최빈값이 여러개 나올 수 있으니 최빈값 배열 생성
		int[] modearr = new int[numarr.length];
		//문제 정수 범위가 -4000~4000이므로 최빈값이 아닌 공간은 9999로 초기화
		Arrays.fill(modearr, 9999);
		int idx = 0;
		int count = 0;
		//최빈값 배열에 값 채워넣기
		for(int i = 0 ; i < cnt.length; i++) {
			//최빈값이냐?
			if(cntmax == cnt[i]) {
				//그럼 그 인덱스에서 4000을 뺀 값이 최빈값이오
				modearr[idx] = i-4000;
				idx++;
				count++;
			}
		}
		//최빈값 배열 정렬
		Quick.sort(modearr, 0, modearr.length-1);
		//최빈값이 하나냐?
		if(count == 1)
			return modearr[0];
		//최빈값이 여러개냐?
		else
			return modearr[1];
	}
	public static int range(int[] numarr) {
		//최대 최소 구해서 빼기
		int min = numarr[0], max = numarr[0];
		for(int i = 1; i < numarr.length; i++) {
			if(min > numarr[i])
				min = numarr[i];
			if(max < numarr[i])
				max = numarr[i];
		}
		return max - min;
	}
}


public class 통계학_2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 자바 수 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 출력
		System.out.println(Statistics.mean(arr));
		System.out.println(Statistics.median(arr));
		System.out.println(Statistics.mode(arr));
		System.out.println(Statistics.range(arr));
	}
}
