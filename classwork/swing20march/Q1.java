package swing20march;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1 extends JFrame {
    private JTextField inputField;
    private JButton checkButton;
    private JLabel resultLabel;
    
    public Q1() {
        setTitle("Even/Odd Number Checker");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Create components
        JLabel promptLabel = new JLabel("Enter a number:");
        inputField = new JTextField(10);
        checkButton = new JButton("Check");
        resultLabel = new JLabel("Result will be shown here");
        
        // Add components to frame
        add(promptLabel);
        add(inputField);
        add(checkButton);
        add(resultLabel);
        
        // Add action listener to button
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    if (number % 2 == 0) {
                        resultLabel.setText(number + " is an even number");
                    } else {
                        resultLabel.setText(number + " is an odd number");
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter a valid integer");
                }
            }
        });
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Q1();
            }
        });
    }
}
