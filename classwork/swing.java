// import java.awt.*;
// import javax.swing.*;

// class swing {
//     public static void main(String[] args) {
//         // create a jframe
//         JFrame frame = new JFrame("JButton Example with FlowLayout");
//         frame.setSize(300, 200);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         // set FlowLayout
//         frame.setLayout(new FlowLayout());

//         // create buttons
//         JButton button1 = new JButton("Button 1");
//         JButton button2 = new JButton("Button 2");
//         JButton button3 = new JButton("Button 3");

//         // add buttons to frame
//         frame.add(button1);
//         frame.add(button2);
//         frame.add(button3);

//         // make frame visible
//         frame.setVisible(true);

//         // frame.setResizable(false);
//     }
// }



import java.awt.*;
import javax.swing.*;  

public class swing {  
    public static void main(String[] args) {  
        JFrame frame = new JFrame("Addition Form");
        frame.setSize(300, 200);  
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  
        frame.setLayout(new FlowLayout());  

        JTextField num1Field = new JTextField(10);  
        JTextField num2Field = new JTextField(10);  
        JLabel resultLabel = new JLabel("Result: -");  

        JButton addButton = new JButton("Add");  
        addButton.setBounds(100,50,10,20);
        addButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button clicked"));

        frame.add(new JLabel("1st Number:")); frame.add(num1Field);  
        frame.add(new JLabel("2nd Number:")); frame.add(num2Field);  
        frame.add(addButton); frame.add(resultLabel);  
        frame.setVisible(true);  
    }  
}