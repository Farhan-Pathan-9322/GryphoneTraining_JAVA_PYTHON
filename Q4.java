
import java.util.Scanner;

public class Q4 {

    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalMembers = sc.nextInt();  // Input: N

        if (totalMembers < 2) {
            System.out.println("Not enough members to seat with constraint.");
        } else {
            long ways = factorial(totalMembers - 2) * 2;
            System.out.println("Total possible ways: " + ways);
        }
    }
}
