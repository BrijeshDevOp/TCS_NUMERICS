import java.util.Scanner;

public class DivisibleOrNot {

    static boolean check(String s) {
        int length = s.length();

        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += (s.charAt(i) - '0');
        }

        return (sum % 9 == 0);
    }

    public static void main(String[] args) {
        System.out.println(" Enter a large number ");

        Scanner x = new Scanner(System.in);

        String s = x.nextLine();

        if (check(s))
            System.out.println(" Divisible ");
        else
            System.out.println(" Not divisible ");
    }
}
