/*2020-05-22
 *���� 7568 ��ġ
 *20150711 ����*/
package ���Ʈ����;

import java.util.Scanner;

class Human{
	//����Ʈ ������
	Human(){}
	//Ŭ���� �������
	int weight;
	int height;
	//��ġ������ ����
	int rank = 1;
}

public class ��ġ_7568 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//��ü �迭 ����
		Human[] arr = new Human[N];
		//��ü�� ������ �Է�
		for (int i = 0 ; i < N; i++) {
			//�迭 ���Һ� ������ ��ü ����
			arr[i] = new Human();
			arr[i].weight = sc.nextInt();
			arr[i].height = sc.nextInt();
		}
		//�� ��� �� ���̹Ƿ� ���� �ݺ����� ���.
		for (int i = 0 ; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				//�� ��ġ�� Ŭ ��
				if (arr[i].height > arr[j].height && arr[i].weight > arr[j].weight)
					arr[j].rank++;
				//ģ�� ��ġ�� Ŭ ��
				else if (arr[i].height < arr[j].height && arr[i].weight < arr[j].weight)
					arr[i].rank++;
			}
		}
		//���
		for (int i = 0 ; i < N; i++) {
			System.out.print(arr[i].rank + " ");
		}
		sc.close();
	}
}
