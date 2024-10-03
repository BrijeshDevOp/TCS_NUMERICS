public class SwapNumWoutTemp {
    public static void main(String[] args) {
        int a = 5;  // First number
        int b = 10; // Second number
        
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        
        // Swapping using arithmetic operations
        a = a + b; // Step 1: a now holds the sum of both numbers
        b = a - b; // Step 2: b is now the original value of a
        a = a - b; // Step 3: a is now the original value of b
        
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
