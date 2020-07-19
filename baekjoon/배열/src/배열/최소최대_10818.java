package 배열;

import java.util.Scanner;

//최대값, 최솟값 메소드 클래스
class MaxMin{
	//Max, Min 함수에 temp를 쓰려면 temp역시 static변수가 되어야 함.
	static int temp;
	//static이 붙은 메소드는 더 이상 Class의 멤버변수를 사용할 수 없다.
	public static int Max(int[] arr) {
		temp = arr[0];
		for(int i = 0 ; i < arr.length;i++) {
			if(temp <= arr[i])
				temp = arr[i];
		}
		return temp;
	}
	public static int Min(int[] arr) {
		temp = arr[0];
		for(int i = 0 ; i < arr.length;i++) {
			if(temp >= arr[i])
				temp = arr[i];
		}
		return temp;
	}
}

public class 최소최대_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(MaxMin.Min(arr)+" "+MaxMin.Max(arr));
	}
}
