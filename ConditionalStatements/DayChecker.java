package ConditionalStatements;

import java.util.Scanner;

public class DayChecker {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("It's a Weekday.");
                break;
            case 6: case 7:
                System.out.println("It's a Weekend.");
                break;
            default:
                System.out.println("Invalid day number.");
        }
        scanner.close();
    }
}
