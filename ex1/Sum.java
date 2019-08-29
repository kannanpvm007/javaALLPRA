import java.util.Scanner;
import java.lang.*;

class Sum {
    public static void main(String[] args) {
        String num1="aaa";
        String num2="bbb";
        for (int i = 1; i <= 5; i++) {
            Scanner m = new Scanner(System.in);
            System.out.println("first no");
            int num3 = Integer.parseInt(num1);
            System.out.println("second no");
            int num4 = Integer.parseInt(num2);
            int sum = num3 + num4;
            System.out.println(sum);
        }
    }
}