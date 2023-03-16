import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[15];
       
        // Part a
        System.out.println("Please enter 15 integers:");
        for (int y = 0; y < numbers.length; y++) {
            numbers[y] = scanner.nextInt();
        }
        System.out.println("The values stored in the array are: " + Arrays.toString(numbers));
       
        // Part b
        System.out.print("Please enter a number to search for: ");
        int searchNumber = scanner.nextInt();
        int index = -1;
        for (int y = 0; y < numbers.length; y++) {
            if (numbers[y] == searchNumber) {
                index = y;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The number " + searchNumber + " found at index " + index);
        } else {
            System.out.println("Number not found in this array.");
        }
       
        // Part c
        int[] reverseNumbers = new int[15];
        for (int y = 0; y < numbers.length; y++) {
            reverseNumbers[y] = numbers[numbers.length - 1 - y];
        }
        System.out.println("The values stored in the reversed array are: " + Arrays.toString(reverseNumbers));
       
        // Part d
        int sum = 0;
        int product = 1;
        for (int y = 0; y < numbers.length; y++) {
            sum += numbers[y];
            product *= numbers[y];
        }
        System.out.println("The sum of all elements in the array is: " + sum);
        System.out.println("The product of all elements in the array is: " + product);
    }
}


