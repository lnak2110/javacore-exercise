import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.print("Enter a natural number: ");
            num = sc.nextInt();

        } while (num <= 0);

        System.out.printf("All divisors of %d: ", num);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
