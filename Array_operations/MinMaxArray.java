package Array_operations;

import java.util.Random;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int max = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }

        System.out.println("\nMinimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
