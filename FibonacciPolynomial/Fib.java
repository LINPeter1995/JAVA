import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fib {

	public static void main(String[] args) throws IOException {
		int num;
		String str;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("使用遞迴計算費式級數\n");
		System.out.print("請輸入一個整數");
		str = buf.readLine();
		num = Integer.parseInt(str);
		if (num < 0)
			System.out.print("輸入數字必須大於0\n");
		else
			System.out.print("Fibonacci(" + num + ")=" + Fibonacci(num) + "\n");
	}

	public static int Fibonacci(int n)
	{
		if(n==0) //第0項為0
			return(0);
		else if (n==1) //第1項為1
		return (1);
		else
			return(Fibonacci(n-1)+Fibonacci(n-2));
		
		}
}
