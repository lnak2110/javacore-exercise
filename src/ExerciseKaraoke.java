import java.util.Scanner;

public class ExerciseKaraoke {
    public static void main(String[] args) {
        int[] data = inputData();

        System.out.println("Total fee: " + calculateFee(data[0], data[1], data[2]));
    }

    private static int[] inputData() {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3];

        do {
            System.out.print("Enter start time (9 - 23): ");
            data[0] = sc.nextInt();
        } while (data[0] < 9 || data[0] > 23);
        do {
            System.out.print("Enter end time (10 - 24): ");
            data[1] = sc.nextInt();
        } while (data[1] < 10 || data[1] > 24);
        do {
            System.out.print("Enter the number of water bottle: ");
            data[2] = sc.nextInt();
        } while (data[2] < 0);

        sc.close();
        return data;
    }

    private static double calculateFee(int startTime, int endTime, int water) {
        int time = endTime - startTime;
        int feePerHour = 30000;
        int waterFee = 10000;
        double fee = 0;

        if (time <= 3) {
            fee = feePerHour * time;
        } else {
            fee = feePerHour * 3 + feePerHour * 0.3 * (time - 3);
        }

        fee += water * waterFee;

        if (startTime >= 9 && startTime <= 17) {
            fee *= 0.8;
        }

        return fee;
    }

}
