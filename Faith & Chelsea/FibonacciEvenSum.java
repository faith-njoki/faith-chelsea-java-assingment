public class FibonacciEvenSum {
    public static void main(String[] args) {
        int limit = 4000000; // Maximum value of terms to consider
        int first = 1; // First term
        int second = 2; // Second term
        int sum = 0; // Sum of even-valued terms

        while (second <= limit) {
            if (second % 2 == 0) {
                sum += second; // Add even-valued term to the sum
            }
            int current = first + second; // Generate next term
            first = second; // Update first and second terms for next iteration
            second = current;
        }

        System.out.println("The sum of all even-valued terms in the Fibonacci sequence up to " + limit + " is " + sum);
    }
}