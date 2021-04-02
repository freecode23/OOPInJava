//**************************************************************************************************
// CLASS: GridLayoutDemo (GridLayoutDemo.java)
//
// DESCRIPTION
// This is the Grid Layout Demo program from "GUI Programming : Section 8".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates how to use the GridLayout layout manager.
 */
public class GridLayoutDemo {
    public static void main(String[] args) { new GridLayoutDemo().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a new JPanel and set the layout to use GridLayout with four rows and four columns.
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        // Add 16 buttons to the panel. Note that the buttons are added in a top-to-bottom, left-to-
        // order (what we refer to as row-major order).
        addButton(panel, "7");
        addButton(panel, "8");
        addButton(panel, "9");
        addButton(panel, "/");
        addButton(panel, "4");
        addButton(panel, "5");
        addButton(panel, "6");
        addButton(panel, "*");
        addButton(panel, "3");
        addButton(panel, "2");
        addButton(panel, "1");
        addButton(panel, "-");
        addButton(panel, "0");
        addButton(panel, ".");
        addButton(panel, "+/-");
        addButton(panel, "+");

        // Create a new JFrame and add the panel to the frame.
        JFrame frame = new JFrame("Grid Layout Demo");
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Create a new JButton containing the text pText and add the button to the panel.
    private void addButton(JPanel pPanel, String pText) {
        JButton button = new JButton(pText);
        pPanel.add(button);
    }
}
