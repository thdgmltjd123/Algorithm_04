/*������ ����
 * �ʹ� ���� ��ġ
 * �Ѱ� �ΰ�������
 * ��̷� �غ����� �ѵ�
 * �̰� ��.. �����*/

package ����;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//������ �� �ֺ� ������ ���� ����Ʈ �˰��� ����.
class Quick{
	public static void sort(int[] data, int start, int end) {
		//�Ǻ� �߾Ӱ�..!!
		int pivot = data[(start + end) / 2];
		int left = start;
		int right = end;
		//�׻� �Ǻ��� ��ġ������ �򰥸��� �Ǻ��� ����� �ΰ�, �׻� r pivot l���°� �� �� �ֵ��� ����
		while(left<=right) {
			//left �ൿ ����
			while(data[left] < pivot)
				left++;
			//right �ൿ ����
			while(data[right] > pivot)
				right--;
			//left�� �Ǻ����� ũ��, right�� �Ǻ����� ���� ��
			if(left <= right) {
				if(left != right) {
					int tmp = data[left];
					data[left] = data[right];
					data[right] = tmp;
				}
				left++;right--;
			}
		}
		//�Ǻ� ���� ������
		if(left < end)
			sort(data, left, end);
		//�Ǻ� ���� ����
		if(start < right)
			sort(data, start, right);
	}
}

//��跮 �����ϴ� Ŭ���� ����
class Statistics{
	//������ method
	public static int mean(int[] numarr) {
		double sum = 0;
		for(int i = 0 ; i < numarr.length; i++) {
			sum+=numarr[i];
		}
		return (int) Math.round(sum / numarr.length);
	}
	//�߾Ӱ� method
	public static int median(int[] numarr) {
		//�迭�� ���� �����Ѵ�.
		Quick.sort(numarr, 0, numarr.length-1);
		//N�� Ȧ���̹Ƿ� Ȧ���� ��츸 �����Ѵ�.
		return numarr[numarr.length / 2];
	}
	//�ֺ� method
	public static int mode(int[] numarr) {
		//�ڹٴ� int �迭 ������ default�� 0���� �ʱ�ȭ ��
		//-4000~4000���� ���� ��� ī���� �迭 ����
		int[] cnt = new int[8001];
		//index 0�� -4000�̹Ƿ� �ش� ���ڿ� 4000�� ���ϸ� �ùٸ� ��ġ��
		for(int i = 0 ; i < numarr.length; i++) {
			cnt[numarr[i]+4000]++;
		}
		//�ֺ��� ã�� ���� ī��Ʈ�迭�� �ִ��� ã�´�.
		int cntmax = cnt[0];
		for(int i = 1 ; i < cnt.length; i++) {
			if(cntmax < cnt[i])
				cntmax = cnt[i];
		}
		//�ֺ��� ������ ���� �� ������ �ֺ� �迭 ����
		int[] modearr = new int[numarr.length];
		//���� ���� ������ -4000~4000�̹Ƿ� �ֺ��� �ƴ� ������ 9999�� �ʱ�ȭ
		Arrays.fill(modearr, 9999);
		int idx = 0;
		int count = 0;
		//�ֺ� �迭�� �� ä���ֱ�
		for(int i = 0 ; i < cnt.length; i++) {
			//�ֺ��̳�?
			if(cntmax == cnt[i]) {
				//�׷� �� �ε������� 4000�� �� ���� �ֺ��̿�
				modearr[idx] = i-4000;
				idx++;
				count++;
			}
		}
		//�ֺ� �迭 ����
		Quick.sort(modearr, 0, modearr.length-1);
		//�ֺ��� �ϳ���?
		if(count == 1)
			return modearr[0];
		//�ֺ��� ��������?
		else
			return modearr[1];
	}
	public static int range(int[] numarr) {
		//�ִ� �ּ� ���ؼ� ����
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


public class �����_2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// �ڹ� �� �Է� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// ���
		System.out.println(Statistics.mean(arr));
		System.out.println(Statistics.median(arr));
		System.out.println(Statistics.mode(arr));
		System.out.println(Statistics.range(arr));
	}
}
