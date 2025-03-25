public class SumOfFibo {

    static int sum(int n) {
        int arr[] = new int[n];
        if (n < 1) {
            return 0;
        } else {
            arr[0] = 0;
            arr[1] = 1;
            int sum = arr[0] + arr[1];
            System.out.print(arr[0] + " " + arr[1]);
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
                System.out.print(" " + arr[i]);
                sum += arr[i];
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Sum of fibo is " + sum(n));
    }

}
