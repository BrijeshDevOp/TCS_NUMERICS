import java.util.Scanner;

public class SpecialNumber {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to check if a number is a Special Number
    public static boolean isSpecial(int number) {
        int sum = 0, temp = number;

        // Sum of squares of digits
        while (temp > 0) {
            int digit = temp % 10; // Extract last digit
            sum += digit * digit; // Add square of the digit to sum
            temp /= 10; // Remove last digit
        }

        // Check if the sum is a prime number
        return isPrime(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isSpecial(num)) {
            System.out.println(num + " is a Special Number.");
        } else {
            System.out.println(num + " is not a Special Number.");
        }

        scanner.close();
    }
}
