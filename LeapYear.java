import java.util.Scanner;

public class LeapYear {
    static boolean check(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                return (y % 400 == 0);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(" Enter the year ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if (check(y))
            System.out.println(" Leap Year ");
        else
            System.out.println(" Not a Leap Year ");
    }
}
