public class Exercise1 {
    public static void main(String[] args) {
        String s1 = "* * * * * * ==================================";
        String s2 = " * * * * *  ==================================";
        String s3 = "==============================================";

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println(s1);
            } else {
                System.out.println(s2);
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(s3);
        }
    }

}
