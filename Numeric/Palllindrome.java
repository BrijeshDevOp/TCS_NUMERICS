import java.util.Scanner;

public class Palllindrome {

    static boolean check(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner a = new Scanner(System.in);
        String x = a.nextLine();

        if (check(x))
            System.out.println("True");
        else
            System.out.println("False");

        a.close();
    }
}
