import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder reversedStr = new StringBuilder(str).reverse();

        System.out.println("Reversed string: " + reversedStr);
        sc.close();
    }
}
