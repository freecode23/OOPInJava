//**************************************************************************************************
// CLASS: LabelDemo1 (LabelDemo1.java)
//
// DESCRIPTION
// This is the Label Demo 1 program from "GUI Programming : Section 2".
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

/**
 * Illustrates how to declare a JLabel and add it to a JFrame.
 * no panel
 */
public class LabelDemo1 {
    public static void main(String[] args) { new LabelDemo1().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JLabel label = new JLabel("A label is static text");
        JFrame frame = new JFrame("Label Demo 1");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.setVisible(true);
    }
}
