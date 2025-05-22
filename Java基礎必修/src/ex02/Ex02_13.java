package ex02;

import java.util.Scanner;

public class Ex02_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入姓名: ");
		String name = scn.nextLine();
		System.out.printf("Hi! %s !%n", name);
		System.out.print("請輸入兩個整數，中間用空隔間格: ");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		System.out.printf("%d除以%d商為%d餘數%d%n", num1, num2, num1/num2, num1%num2);
		scn.close();

	}

}
