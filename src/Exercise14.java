import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.print("Enter the array length: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        if (length == 0) {
            scanner.close();
            return;
        }
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = inputNum(scanner);
        }

        outputArray(arr);
        System.out.print("Array after removed duplicates: ");
        removeDuplicates(arr);
        scanner.close();
    }

    public static int inputNum(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void outputArray(int[] arr) {
        System.out.print("The array:");
        for (int num : arr) {
            System.out.print(" " + num);

        }
        System.out.print("\n");
    }

    public static void removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int current = arr[0];
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (current == arr[i] && !found) {
                found = true;
            } else if (current != arr[i]) {
                System.out.print(current + " ");
                current = arr[i];
                found = false;
            }
        }
        System.out.print(current);
    }
}