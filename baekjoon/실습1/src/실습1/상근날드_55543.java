package 실습1;

/*백준 5543
 * 상근날드
 * 2020-03-27*/

import java.util.Scanner;

public class 상근날드_55543 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int setprice = 0;
		int[] burger = new int[3];
		int[] beverage = new int[2];
		for(int i = 0 ; i < 5; i++) {
			int price = sc.nextInt();
			if(i<3)
				burger[i] = price;
			else
				beverage[i-3] = price;
		}
		int burgermin = burger[0];
		for(int i = 0; i < burger.length;i++) {
			if(burgermin>=burger[i])
				burgermin = burger[i];
		}
		int bevmin = beverage[0];
		for(int i = 0 ; i < beverage.length; i++) {
			if(bevmin >= beverage[i])
				bevmin = beverage[i];
		}
		setprice = burgermin+bevmin-50;
		System.out.println(setprice);
	}
}
