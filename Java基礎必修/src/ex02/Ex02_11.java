package ex02;

public class Ex02_11 {

	public static void main(String[] args) {
		int[] n;
		n = new int[] { 1, 2, 3 };
		int[] a = n;
		System.out.println("a[0]=" + a[0] + "\t a[1]=" + a[1] + "\t a[2]=" + a[2]);
		System.out.println("n[0]" + n[0] + "\t n[1]=" + n[1] + "\t n[2]=" + n[2]);
		a[1] = 15;
		System.out.println("---------------------------------------------");
		System.out.println("a[0]=" + a[0] + "\t a[1]=" + a[1] + "\t a[2]=" + a[2]);
		System.out.println("n[0]=" + n[0] + "\t n[1]=" + n[1] + "\t n[2]=" + n[2]);
	}

}
