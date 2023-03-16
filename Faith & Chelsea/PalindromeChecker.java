import javax.swing.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a JFrame to hold the GUI components
        JFrame frame = new JFrame("Palindrome Checker");

        // Create a JPanel to hold the text field and button
        JPanel panel = new JPanel();

        // Create a text field for user input
        JTextField inputField = new JTextField(10);

        // Create a button to check if the number is a palindrome
        JButton checkButton = new JButton("Check");

        // Create a label to display the result
        JLabel resultLabel = new JLabel();

        // Add the components to the panel
        panel.add(inputField);
        panel.add(checkButton);
        panel.add(resultLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Set the size and make the frame visible
        frame.setSize(300, 100);
        frame.setVisible(true);

        // Add an action listener to the button
        checkButton.addActionListener(e -> {
            String input = inputField.getText();
            if (isPalindrome(input)) {
                resultLabel.setText(input + " is a palindrome");
            } else {
                resultLabel.setText(input + " is not a palindrome");
            }
        });
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String input) {
        String reverse = new StringBuilder(input).reverse().toString();
        return input.equals(reverse);
    }
}
