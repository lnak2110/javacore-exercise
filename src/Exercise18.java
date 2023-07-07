import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial money: ");
        double initialMoney = sc.nextDouble();
        System.out.print("Enter final money: ");
        double finalMoney = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        rate /= 100;
        System.out.print("Enter time per year: ");
        int tpy = sc.nextInt();

        double year = Math.log(finalMoney / initialMoney) / tpy * Math.log((tpy + rate) / tpy);

        System.out.println("Year: " + year);

        sc.close();
    }
}
