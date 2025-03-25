// If sum of factors of a number is greater than the number itself then the number is called Abundent numbers
public class AbundentNumbers {
    public static void main(String[] args) {
        int n = 21, i;
        int sum = 0;
        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > n)
            System.out.println("Its Abundent Number");
        else
            System.out.println(" Not abundent num ");
    }
}
