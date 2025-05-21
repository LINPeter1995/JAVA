package ex15;

import javax.swing.*;

class MyJFrame extends JFrame { // 類別名稱要和建構子一致
	MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("JFrame視窗");
		setVisible(true);
	}
}

public class JFrameDemo {
	public static void main(String[] args) {
		MyJFrame f = new MyJFrame(); // 正確使用建構子
	}
}
