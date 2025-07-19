
import java.util.Scanner;

public class ArraysG {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the ele of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int totsum = 0;
        System.out.print("Enter the no. of queries : ");
        int que = sc.nextInt();
        for (int q = 1; q <= que; q++) {
            System.out.println("Enter the type of " + q + " query : ");
            int type = sc.nextInt();
            System.out.println("Enter the starting index of the array : ");
            int l = sc.nextInt();
            System.out.println("Enter the ending index : ");
            int r = sc.nextInt();

            if (type == 1) {
                for (int i = l; i <= r; i++) {
                    arr[i] = ((i - l + 1) * arr[l]);
                }
            } else if (type == 2) {
                int sum = 0;
                for (int i = l; i <= r; i++) {
                    sum = (sum + arr[i]);
                }
                totsum = (totsum + sum);

            }

        }
        System.out.println("Total sum of type 2 queries: " + totsum);
        sc.close();

    }

}
