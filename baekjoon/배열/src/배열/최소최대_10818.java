package �迭;

import java.util.Scanner;

//�ִ밪, �ּڰ� �޼ҵ� Ŭ����
class MaxMin{
	//Max, Min �Լ��� temp�� ������ temp���� static������ �Ǿ�� ��.
	static int temp;
	//static�� ���� �޼ҵ�� �� �̻� Class�� ��������� ����� �� ����.
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

public class �ּ��ִ�_10818 {

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
