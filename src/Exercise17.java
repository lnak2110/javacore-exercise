import java.util.Random;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = new Random().nextInt(1000) + 1;
        int guess;
        boolean win = false;

        while (!win) {
            System.out.print("Guess a number from 1 to 1000: ");
            guess = sc.nextInt();

            if (guess < 1 || guess > 1000) {
                continue;
            }

            if (guess == num) {
                win = true;
            } else if (guess < num) {
                System.out.println("Your guess is lower than the actual number");
            } else {
                System.out.println("Your guess is higher than the actual number");
            }
        }

        System.out.println("You guess the correct number: " + num);

        sc.close();
    }
}
