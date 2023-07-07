import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1;
        int x2;
        int v1;
        int v2;
        do {
            System.out.print("Enter first position: ");
            x1 = sc.nextInt();
        } while (x1 < 0 || x1 >= 10000);
        do {
            System.out.print("Enter second position: ");
            x2 = sc.nextInt();
        } while (x2 <= x1 || x2 >= 10000);
        do {
            System.out.print("Enter first velocity: ");
            v1 = sc.nextInt();
        } while (v1 < 1 || v1 > 10000);
        do {
            System.out.print("Enter second velocity: ");
            v2 = sc.nextInt();
        } while (v2 < 1 || v2 > 10000);

        if (v2 >= v1) {
            System.out.println("Two kangaroos will not meet");
        } else {
            if ((x2 - x1) % (v1 - v2) == 0) {
                System.out.println("Two kangaroos will meet");
            } else {
                System.out.println("Two kangaroos will not meet");
            }
        }

        sc.close();
    }
}
