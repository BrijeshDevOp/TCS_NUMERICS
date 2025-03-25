import java.util.Scanner;

public class StrongNumber {

    // Method to calculate factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a Strong Number
    public static boolean isStrong(int number) {
        int original = number, sum = 0;

        // Extract each digit, calculate its factorial, and sum them
        while (number > 0) {
            int digit = number % 10; // Get last digit
            sum += factorial(digit); // Add factorial of digit to sum
            number /= 10; // Remove last digit
        }

        // If the sum of factorials of digits equals the original number, it's a Strong
        // Number
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // A Strong Number is a number whose sum of the factorial of its digits
        // is equal to the original number itself.
        // Example: 145 -> 1! + 4! + 5! = 1 + 24 + 120 = 145 (Strong Number)

        if (isStrong(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is not a Strong Number.");
        }

        scanner.close();
    }
}
