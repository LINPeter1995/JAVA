package ex14;

public class LambdaRunnable3 {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " 印第" + i + "次");
			}
		});
		t.start();
	}
}
