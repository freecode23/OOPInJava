//**************************************************************************************************
// CLASS: ButtonDemo1 (ButtonDemo1.java)
//
// DESCRIPTION
// This is the Button Demo 1 program from "GUI Programming : Section 7".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates how to create and add JButtons to a frame.
 */
public class ButtonDemo1 {
    public static void main(String[] args) { new ButtonDemo1().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JPanel using the default FlowLayout layout manager.
        JPanel panel = new JPanel();

        // Create two JButtons.
        JButton butOk = new JButton("OK");
        JButton butCancel = new JButton("Cancel");

        // Add the JButtons to the panel.
        panel.add(butOk);
        panel.add(butCancel);

        // Create the JFrame and add the panel to the frame.
        JFrame frame = new JFrame("Button Demo 1");
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
