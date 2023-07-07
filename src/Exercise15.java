import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println("Length of string: " + str.length());
        if (str.length() == 0) {
            scanner.close();
            return;
        }

        int index;
        do {
            System.out.print("Enter the index: ");
            index = scanner.nextInt();
        } while (index < 0 || index >= str.length());

        char c = str.charAt(index);
        System.out.printf("Character at index %d: %s%n", index, c);

        if (str.contains("abcdef")) {
            System.out.println("String contains 'abcdef'");
        } else {
            System.out.println("String does not contains 'abcdef'");
        }

        scanner.close();
    }
}