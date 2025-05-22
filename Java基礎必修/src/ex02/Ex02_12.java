package ex02;

public class Ex02_12 {

    public static void main(String[] args) {
        String title = "價格:NT";
        int money = 128;
        double tax = money * 0.05;
        System.out.printf("%s%3d元, 稅金:%.2f元%n", title, money, tax);
    }

}

