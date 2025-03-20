package swing20march;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame {
    private JTextField inputField;
    private JButton reverseButton;
    private JLabel resultLabel;
    
    public Q3() {
        setTitle("String Reverser");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Create components
        JLabel promptLabel = new JLabel("Enter text to reverse:");
        inputField = new JTextField(15);
        reverseButton = new JButton("Reverse");
        resultLabel = new JLabel("Result will be shown here");
        
        // Add components to frame
        add(promptLabel);
        add(inputField);
        add(reverseButton);
        add(resultLabel);
        
        // Add action listener to button
        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText().trim();
                
                if (input.isEmpty()) {
                    resultLabel.setText("Please enter some text");
                    return;
                }
                
                String reversed = reverseString(input);
                resultLabel.setText("Reversed: \"" + reversed + "\"");
            }
        });
        
        setVisible(true);
    }
    
    // Method to reverse a string
    private String reverseString(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Q3();
            }
        });
    }
}
