//**************************************************************************************************
// CLASS: LabelDemo2 (LabelDemo2.java)
//
// DESCRIPTION
// This is the Label Demo 2 program from "GUI Programming : Section 2".
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
 * Demonstrates what happens when two JLabels are added to a JFrame.
 * no panel (label stacks on top)
 */
public class LabelDemo2 {
    public static void main(String[] args) { new LabelDemo2().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JLabel label1 = new JLabel("A label is static text");
        JLabel label2 = new JLabel("This is another label");
        JFrame frame = new JFrame("Label Demo 2");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label1);
        frame.add(label2);
        frame.setVisible(true);
    }
}
