
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: total days and start day (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        int totalDays = sc.nextInt();
        int startDay = sc.nextInt();

        int sundayCount = 0;

        for (int day = 0; day < totalDays; day++) {
            int currentDay = (startDay + day) % 7;
            if (currentDay == 0) {  // 0 = Sunday
                sundayCount++;
            }
        }

        System.out.println("Total Sundays: " + sundayCount);
    }
}
