import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int num;
        do {
            System.out.print("Enter a natural number: ");
            num = sc.nextInt();

        } while (num <= 0);

        for (int i = num; i > 1; i /= 2) {
            x++;
        }
        System.out.println("Result: " + x);

        sc.close();
    }
}
