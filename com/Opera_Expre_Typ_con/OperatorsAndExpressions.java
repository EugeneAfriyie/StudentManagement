package com.Opera_Expre_Typ_con;

import java.util.Scanner;

public class OperatorsAndExpressions {
    public static void main(String[] args) {
        // Using Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Area of circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);

        // Even or Odd
        System.out.print("Enter a number to check if it's even or odd: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }
}

