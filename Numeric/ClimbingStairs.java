public class ClimbingStairs {

    static int climb(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2];
        }

        return ways[n];
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.println(" Number of ways to climb " + n + " steps is " + climb(n));
    }
}