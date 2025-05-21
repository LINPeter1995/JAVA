package ex02;

public class Ex02_06 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println("a = " + a);
		int b = a++;
		System.out.println("b = a++ : a = " + a + ", b = " + b);
		b = ++a;
		System.out.println("b = ++a : a = " + a + ", b = " + b);
		b = a--;
		System.out.println("b = a-- : a = " + a + ", b = " + b);
		b = --a;
		System.out.println("b = --a : a = " + a + ", b = " + b);

	}

}
