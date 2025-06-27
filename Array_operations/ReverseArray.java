package Array_operations;

// UEB3502023 EUGENE AFRIYIE

import java.util.Arrays;

public class ReverseArray {
     public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
