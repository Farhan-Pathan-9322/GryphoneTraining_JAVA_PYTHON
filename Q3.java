
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();  // Input N (product code)
        int price = 1;

        while (code > 0) {
            int digit = code % 10;
            price *= digit;
            code /= 10;
        }

        System.out.println("Price of the item: " + price);
    }
}
