import java.util.Scanner;

public class FloatEvenOrOdd {

    static boolean check(String s) {
        if (!s.contains("."))
            return (Integer.parseInt(s) % 2 == 0);
        else {
            String[] parts = s.split("\\.");
            String fractionalPart = parts[1];

            // Remove trailing zeros from the fractional part
            fractionalPart = fractionalPart.replaceAll("0+$", "");

            if (fractionalPart.isEmpty())
                return Integer.parseInt(parts[0]) % 2 == 0;

            char lastDigit = fractionalPart.charAt(fractionalPart.length() - 1);

            int digit = lastDigit - '0';

            if (digit % 2 == 0)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(" Enter a number");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (check(s))
            System.out.println(" Is Even ");
        else
            System.out.println(" Odd ");
    }
}
