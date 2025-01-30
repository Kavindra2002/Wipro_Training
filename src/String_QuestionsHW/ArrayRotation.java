package String_QuestionsHW;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rotations: ");
        int n = scanner.nextInt();
        System.out.print("Enter direction (left/right): ");
        String direction = scanner.next();

        rotateArray(arr, n, direction);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int n, String direction) {
        n = n % arr.length; // Handle cases where n > arr.length
        if (direction.equalsIgnoreCase("left")) {
            for (int i = 0; i < n; i++) {
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = temp;
            }
        } else if (direction.equalsIgnoreCase("right")) {
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }
    }
}