import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        do {
            System.out.print("Enter first number from 10 to 99: ");
            num1 = sc.nextInt();
        } while (num1 < 10 || num1 > 99);

        do {
            System.out.print("Enter second number from 10 to 99: ");
            num2 = sc.nextInt();
        } while (num2 < 10 || num2 > 99);
        sc.close();

        String[] num1Split = String.valueOf(num1).split("");
        String num2Str = String.valueOf(num2);

        for (String digit : num1Split) {
            if (num2Str.contains(digit)) {
                System.out.println(true);
                return;
            }
        }

        System.out.println(false);
    }
}
