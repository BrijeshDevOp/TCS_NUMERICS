public class HappyNumber {

    static int getNext(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    static boolean check(int n) {
        int prevSum = n;

        while (true) {
            System.out.println("checking");
            n = getNext(n);

            if (n == 1)
                return true;

            if (prevSum == n)
                return false;

            prevSum = n;
        }
    }

    public static void main(String[] args) {
        int n = 19;
        if (check(n))
            System.out.println(" Happy number ");
        else
            System.out.println(" Not a Happy number ");
    }
}
