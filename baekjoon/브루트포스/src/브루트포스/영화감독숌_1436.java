package ���Ʈ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ��ȭ������_1436 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader�� ���� ����� ��� Scanner�� ���� ������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader�� ����ó���� �ʿ��ϴ�. ���� throws IOException...
		int N = Integer.parseInt(br.readLine());
		int num = 0 ; //����� ���ں��� ����
		
		//666�� �����ϴ� ���ڰ� ���� N�� 1�� ���ҽ�Ű�� �˰���
		//N�� 0�̵Ǹ� �� ���ڰ� 666�� �����ϴ� N��°�� ���� ��
		/*
		while(N > 0) {
			num++;
			String temp = Integer.toString(num);
			if(temp.contains("666"))
				N--;
		}
		*/
		
		//666���� ���� �÷������鼭 666�� ���� ���� ������ �ݺ����� ã�Ƴ�
		//ã������ count�� ������Ű�� count�� N�� ���ٸ� �ݺ����� ��������.!
		int i, cnt = 0;
		for(i = 666; cnt != N; i++) {
			for(num = i ; num > 0 ; num/=10) {
				if(num % 1000 == 666) {
					cnt++;
					break;	
				}
			}
		}
		System.out.println(i-1);
	}
}
