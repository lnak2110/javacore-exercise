import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter a natural number: ");
            num = sc.nextInt();

        } while (num <= 0);
        int originalNum = num;
        int sum = 0;

        while (num % 10 != 0 || num != 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;
        }

        System.out.printf("Sum of digits of %d = %d", originalNum, sum);
        sc.close();
    }
}
