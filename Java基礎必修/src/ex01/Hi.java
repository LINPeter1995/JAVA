package ex01;

import java.util.Scanner;

public class Hi {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入名子:");
		String strName = scn.next();
		System.out.println("Hi " + strName + "歡迎來到Java世界!");
		scn.close();
	}
}
