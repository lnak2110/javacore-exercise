import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;
        do {
            System.out.print("Enter a natural number: ");
            num = sc.nextInt();

        } while (num <= 0);

        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.printf("Sum primes: " + sum);
        sc.close();
    }

    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        // 0 or 1 is not a prime number
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
