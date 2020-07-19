/*������ ����
 * �ʹ� ���� ��ġ
 * �Ѱ� �ΰ�������
 * ��̷� �غ����� �ѵ�
 * �̰� ��.. �����*/
package ����;

import java.util.Scanner;
import java.util.Arrays;

//Pair ����ü�� compareTo �Լ� �����ε�
class Pair implements Comparable<Pair>{
	int x;
	int y;
	public Pair() {}
	//������
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//getter ����!!
	public int first() {
		return x;
	}
	public int second() {
		return y;
	}
	public int compareTo(Pair pair) {
		//ū if�� ù ��° �������� ���� ����
		//���� if�� �� ��° �������� ����
		if(this.x < pair.first())
			return -1;
		else if(this.x == pair.first()) {
			if(this.y < pair.second())
				return -1;
			else if(this.y == pair.second())
				return 0;
			else
				return 1;
		}
		else
			return 1;
	}
}

public class ��ǥ����_11650 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//��ǥ �迭 ����
		Pair[] pointarr = new Pair[N];
		//�迭 ���鼭 ��ǥ ����
		for (int i = 0 ; i < N; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			pointarr[i] = new Pair(first, second);
		}
		sc.close();
		//������ �����ε��� compareTo�� ����.
		Arrays.sort(pointarr);
		//���
		for(int i = 0 ; i<pointarr.length; i++) {
			System.out.println(pointarr[i].first() + " "+pointarr[i].second());
		}
	}
}
