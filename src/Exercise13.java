import java.util.Scanner;

public class Exercise13 {
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
        System.out.printf("Average: %f%n", findAverage(arr));
        System.out.printf("Max: %d%n", findMax(arr));
        System.out.printf("Min: %d%n", findMin(arr));
        System.out.println("Max negative: "
                + (findMaxNegative(arr) == 0 ? "No negative" : findMaxNegative(arr)));
        System.out.println("Min negative: "
                + (findMinNegative(arr) == 0 ? "No negative" : findMinNegative(arr)));
        System.out.println("Max positive: "
                + (findMaxPositive(arr) == 0 ? "No positive" : findMaxPositive(arr)));
        System.out.println("Min positive: "
                + (findMinPositive(arr) == 0 ? "No positive" : findMinPositive(arr)));
        arr = addItem(scanner, arr);
        outputArray(arr);
        arr = removeItem(scanner, arr);
        outputArray(arr);
        scanner.close();
    }

    public static int inputNum(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        return number;
    }

    public static int[] addItem(Scanner scanner, int[] arr) {
        System.out.print("Enter a number to add: ");
        int number = scanner.nextInt();
        int index = 0;
        do {
            System.out.print("Enter the index: ");
            index = scanner.nextInt();
        } while (index < 0 || index > arr.length);

        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i == index) {
                newArr[i] = number;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static int[] removeItem(Scanner scanner, int[] arr) {
        int index = 0;
        do {
            System.out.print("Enter the index to remove: ");
            index = scanner.nextInt();
        } while (index < 0 || index >= arr.length);

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }

    public static void outputArray(int[] arr) {
        System.out.print("The array:");
        for (int num : arr) {
            System.out.print(" " + num);

        }
        System.out.print("\n");
    }

    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return (double) sum / arr.length;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int item : arr) {
            max = Math.max(item, max);
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int item : arr) {
            min = Math.min(item, min);
        }
        return min;
    }

    public static int findMaxNegative(int[] arr) {
        int maxNegative = 0;
        for (int item : arr) {
            if (maxNegative == 0 && item < maxNegative) {
                maxNegative = item;
            } else if (item < 0 && item > maxNegative) {
                maxNegative = item;
            }
        }
        return maxNegative;
    }

    public static int findMinNegative(int[] arr) {
        int minNegative = 0;
        for (int item : arr) {
            if (item < 0 && item < minNegative) {
                minNegative = item;
            }
        }
        return minNegative;
    }

    public static int findMaxPositive(int[] arr) {
        int maxPositive = 0;
        for (int item : arr) {
            if (item > 0 && item > maxPositive) {
                maxPositive = item;
            }
        }
        return maxPositive;
    }

    public static int findMinPositive(int[] arr) {
        int minPositive = 0;
        for (int item : arr) {
            if (minPositive == 0 && item > minPositive) {
                minPositive = item;
            } else if (item > 0 && item < minPositive) {
                minPositive = item;
            }
        }
        return minPositive;
    }
}