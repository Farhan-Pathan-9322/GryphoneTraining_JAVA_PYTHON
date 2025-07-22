
import java.util.Scanner;

public class Q1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       
        int[] arr = new int[n];     // New Array created with the integer data type

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Input elements
        }

        int cnt = 1;                // Count starts at 1 (first element is always counted)
        int max = arr[0];           // Track maximum seen so far
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                cnt++;
                max = arr[i];
            }
        }

        System.out.println("Count: " + cnt);
    }
}
