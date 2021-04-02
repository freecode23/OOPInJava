//**************************************************************************************************
// CLASS: ButtonDemo2 (ButtonDemo2.java)
//
// DESCRIPTION
// This is the Button Demo 2 program from "GUI Programming : Section 7".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates how to create and add JButtons to a frame. In this version we are setting the
 * height and width of the buttons.
 */
public class ButtonDemo2 {
    public static void main(String[] args) { new ButtonDemo2().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JPanel using the default FlowLayout layout manager.
        JPanel panel = new JPanel();

        // Create two JButtons of width 90 pixels and height 30 pixels. Add the buttons to the
        // panel.
        JButton butOk = newButton("OK", 90, 60);
        panel.add(butOk);
        JButton butCancel = newButton("Cancel", 90, 30);
        panel.add(butCancel);

        // Create a JFrame and add the panel to the frame.
        JFrame frame = new JFrame("Button Demo 2");
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Create a JButton object and set the width and height using the setPreferredSize() method.
    private JButton newButton(String pText, int pWidth, int pHeight) {
        JButton button = new JButton(pText);
        // instance method
        button.setPreferredSize(new Dimension(pWidth, pHeight));
        return button;
    }
}
