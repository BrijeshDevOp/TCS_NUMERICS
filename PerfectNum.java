import java.util.Scanner;

public class PerfectNum {

    static boolean check(int num) {

        int sum = 0;
        if (num <= 1)
            return false;
        else {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    sum += i;
                }
            }
            return sum == num;
        }
    }

    public static void main(String[] args) {
        System.out.println(" Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (check(num))
            System.out.println(" Perfect ");
        else
            System.out.println(" Not perefect ");
    }
}
