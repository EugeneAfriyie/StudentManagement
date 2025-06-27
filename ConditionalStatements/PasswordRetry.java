package ConditionalStatements;

import java.util.Scanner;

public class PasswordRetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (!password.equals("Java"));

        System.out.println("Access Granted.");
        scanner.close();
    }
}
