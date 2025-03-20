package swing20march;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2 extends JFrame {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;
    
    public Q2() {
        setTitle("Palindrome Checker");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Create components
        JLabel promptLabel = new JLabel("Enter text or number:");
        inputField = new JTextField(15);
        checkButton = new JButton("Check Palindrome");
        resultLabel = new JLabel("Result will be shown here");
        
        // Add components to frame
        add(promptLabel);
        add(inputField);
        add(checkButton);
        add(resultLabel);
        
        // Add action listener to button
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText().trim();
                
                if (input.isEmpty()) {
                    resultLabel.setText("Please enter some text or number");
                    return;
                }
                
                if (isPalindrome(input)) {
                    resultLabel.setText("\"" + input + "\" is a palindrome");
                } else {
                    resultLabel.setText("\"" + input + "\" is NOT a palindrome");
                }
            }
        });
        
        setVisible(true);
    }
    
    // Method to check if the input is a palindrome
    private boolean isPalindrome(String text) {
        // Remove spaces and convert to lowercase
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = cleanText.length() - 1;
        
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Q2();
            }
        });
    }
}
