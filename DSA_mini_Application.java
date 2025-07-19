
import java.util.Scanner;

public class DSA_mini_Application {

    public static void main(String[] args) {
        // Step 1: Stored user IDs and passwords
        String[] userIds = {"user1", "admin", "guest"};
        String[] passwords = {"pass1", "admin123", "guest123"};

        // Step 2: Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        String inputId = scanner.nextLine();

        System.out.print("Enter your Password: ");
        String inputPassword = scanner.nextLine();

        // Step 3: Validate credentials
        boolean isLoggedIn = false;
        for (int i = 0; i < userIds.length; i++) {
            if (userIds[i].equals(inputId) && passwords[i].equals(inputPassword)) {
                isLoggedIn = true;
                break;
            }
        }

        // Step 4: Output result
        if (isLoggedIn) {
            System.out.println("Login Successful! Welcome, " + inputId);
        } else {
            System.out.println("Invalid ID or Password. Try again.");
        }

        scanner.close();
    }
}
