// A number which is divisible by its own sum of digits ex-- 21 [2+1 = 3]
public class HarshadNumber {
    public static void main(String[] args) {
        int n = 12, temp, sum = 0, digit, res;
        temp = n;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        res = n % sum;

        if (res == 0)
            System.out.println(" Its Harshad Number ");
        else
            System.out.println(" Its Not Harshad Number ");

    }
}
