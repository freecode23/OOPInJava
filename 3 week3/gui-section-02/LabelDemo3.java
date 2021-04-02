//**************************************************************************************************
// CLASS: LabelDemo3 (LabelDemo3.java)
//
// DESCRIPTION
// This is the Label Demo 3 program from "GUI Programming : Section 2".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates how to create a JPanel using no layout manager and then add two JLabels to the
 * JPanel using absolute positioning.
 * use panel but no layout
 */
public class LabelDemo3 {
    public static void main(String[] args) { new LabelDemo3().run(); }
    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JLabel label1 = new JLabel("A label is static text");
        label1.setBounds(10, 25, 150, 20);
        JLabel label2 = new JLabel("This is another label");
        label2.setBounds(125, 160, 150, 20);
        panel.add(label1);
        panel.add(label2);
        JFrame frame = new JFrame("Label Demo 3");
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
