//**************************************************************************************************
// CLASS: FlowLayoutDemo (FlowLayoutDemo.java)
//
// DESCRIPTION
// This is the FlowLayout Demo program from "GUI Programming : Section 3".
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
 * Demonstrates how GUI components are laid out using the default layout manager which is
 * FlowLayout.
 * panel and layout
 */
public class FlowLayoutDemo {
    public static void main(String[] args) { new FlowLayoutDemo().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JPanel panel  = new JPanel();
        JLabel label1 = new JLabel("This is label 1");
        JLabel label2 = new JLabel("This is label 2");
        JLabel label3 = new JLabel("This is label 3");
        JLabel label4 = new JLabel("This is label 4");
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        JFrame frame = new JFrame("Flow Layout Demo");
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
