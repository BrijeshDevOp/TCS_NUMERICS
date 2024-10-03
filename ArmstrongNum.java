import java.util.Scanner;

class ArmstrongNum {

    static boolean check(int num) {

        int newNum = num;
        int result = 0;
        int digits = Integer.toString(num).length();

        while (num != 0) {
            int reminder = num % 10;
            result += Math.pow(reminder, digits);
            num = num / 10;
        }

        return newNum == result;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number ");
        int num = new Scanner(System.in).nextInt();
        if (check(num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}