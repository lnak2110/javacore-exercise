import java.util.Arrays;
import java.util.Scanner;

public class Exercise20 {
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

        System.out.println("The array: " + Arrays.toString(arr));
        System.out.println("Odd array: " + Arrays.toString(splitArray(arr)[0]));
        System.out.println("Even array: " + Arrays.toString(splitArray(arr)[1]));
        scanner.close();
    }

    public static int inputNum(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static int[][] splitArray(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;

        for (int i : arr) {
            if (i != 0 && i % 2 == 0) {
                evenCount++;
            } else if (i % 2 != 0) {
                oddCount++;
            }
        }

        int[] oddArr = new int[oddCount];
        int[] evenArr = new int[evenCount];
        oddCount = 0;
        evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] % 2 == 0) {
                evenArr[evenCount++] = arr[i];
            } else if (arr[i] % 2 != 0) {
                oddArr[oddCount++] = arr[i];
            }
        }

        int[][] result = { oddArr, evenArr };
        return result;
    }
}