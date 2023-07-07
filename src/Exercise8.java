import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder capitalizedStr = new StringBuilder();

        for (String word : words) {
            if (word.equals("")) {
                break;
            }
            capitalizedStr.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase()).append(" ");
        }
        System.out.println("Capitalized each words string: " + capitalizedStr.toString().strip());
        sc.close();
    }
}
