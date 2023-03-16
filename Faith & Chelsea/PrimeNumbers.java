public class PrimeNumbers {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int y = 2; y <= Math.sqrt(number); y++) {
            if (number % y == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int y = 1; y <= 500; y++) {
            if (isPrime(y)) {
                System.out.println(y);
            }
        }
    }
}