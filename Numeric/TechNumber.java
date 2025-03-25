import java.util.*;

public class TechNumber {
    public static void main(String[] args) {
        String n = Integer.toString(2025);
        int len = n.length();
        int firstHalf = Integer.parseInt(n.substring(0, len / 2));
        int secondHalf = Integer.parseInt(n.substring(len / 2));

        System.out.println(firstHalf + " " + secondHalf);

        int sum = firstHalf + secondHalf;

        sum = sum * sum;

        if (sum == Integer.parseInt(n)) {
            System.out.println("Tech number " + sum);
        }
    }
}
