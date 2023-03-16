public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        int first = 1; // First term
        int second = 2; // Second term

        System.out.print(first + ", " + second); // Print first two terms

        for (int i = 2; i < n; i++) {
            int current = first + second; // Generate next term
            System.out.print(", " + current); // Print the term
            first = second; // Update first and second terms for next iteration
            second = current;
        }
    }
}
