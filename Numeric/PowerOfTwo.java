import java.util.Scanner;

public class PowerOfTwo {

    static boolean check(int num){
        return num>0 && (num&num-1)==0;
    }
    public static void main(String[] args) {
        System.out.println(" Enter a number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (check(num))
            System.out.println(" Power of Two ");
        else
            System.out.println(" Not Power of Two ");
    }
}
