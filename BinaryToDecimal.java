public class BinaryToDecimal {
    public static int binaryToDecimal(int n) {
        int dval = 0, base = 1, rem;

        while (n > 0) {
            rem = n % 10;
            dval = dval + rem * base;
            n = n / 10;
            base = base * 2;
        }
        return dval;
    }

    public static void main(String[] args) {
        int a = 100000;
        System.out.println(" Binary to decimal of " + a + " is  " + binaryToDecimal(a));
    }
}
