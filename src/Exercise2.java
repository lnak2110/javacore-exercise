public class Exercise2 {
    public static void main(String[] args) {
        convertDecimalToBinary(19);
    }

    public static void convertDecimalToBinary(int num) {
        int decimalNum = num;
        int remainder;
        int bit = 1;
        long binaryNum = 0;

        while (num != 0) {
            remainder = num % 2;
            num /= 2;
            binaryNum += remainder * bit;
            bit *= 10;
        }

        System.out.printf("%d = %d%n", decimalNum, binaryNum);
    }
}
