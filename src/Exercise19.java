import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        int option;
        do {
            System.out.print("Enter 1 for Linear equation and 2 for Quadratic equation: ");
            option = sc.nextInt();

            if (option == 1) {
                solveLinearEquation(sc, decimalFormat);
            } else if (option == 2) {
                solveQuadraticEquation(sc, decimalFormat);
            }
        } while (option != 1 && option != 2);

        sc.close();
    }

    private static void solveLinearEquation(Scanner sc, DecimalFormat decimalFormat) {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.printf("Equation: %dx + %d = 0%n", a, b);

        double solution;
        if (a == 0) {
            if (b == 0) {
                System.out.println("Equation has infinitely many solutions");
            } else {
                System.out.println("Equation has no solution");
            }
        } else {
            solution = (double) -b / a;
            System.out.println("Equation has solution x = " + decimalFormat.format(solution));
        }
    }

    private static void solveQuadraticEquation(Scanner sc, DecimalFormat decimalFormat) {
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        System.out.printf("Equation: %dx^2 + %dx + %d = 0%n", a, b, c);

        double x;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Equation has infinitely many solutions");
                } else {
                    System.out.println("Equation has no solution");
                }
            } else {
                x = (double) -c / b;
                System.out.println("Equation has solution x = " + decimalFormat.format(x));
            }

            return;
        }

        double delta = b * b - 4 * a * c;
        double x1;
        double x2;
        if (delta > 0) {
            x1 = (double) (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (double) (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Equation has 2 solutions: x1 = %s and x2 = %s%n",
                    decimalFormat.format(x1), decimalFormat.format(x2));
        } else if (delta == 0) {
            x1 = (double) -b / (2 * a);
            System.out.printf("Equation has double solutions: x1 = x2 = %s%n",
                    decimalFormat.format(x1));
        } else {
            System.out.println("Equation has no solution");
        }
    }
}
