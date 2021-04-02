//**************************************************************************************************
// CLASS: BoxLayoutDemo1 (BoxLayoutDemo1.java)
//
// DESCRIPTION
// This is the BoxLayout Demo 1 program from "GUI Programming : Section 5".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates how to create a layout using the BoxLayout layout manager.
 * 4 labels => 1 Box layout Y panel => frame
 */
public class BoxLayoutDemo1 {
    public static void main(String[] args) { new BoxLayoutDemo1().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JPanel and set the layout manager to horizontal BoxLayout.
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add four labels to the JPanel.
        addLabel(panel, "First label");
        addLabel(panel, "Second label");
        addLabel(panel, "Third label");
        addLabel(panel, "Fourth label");

        JFrame frame = new JFrame("Box Layout Demo 1");
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Add a new JLabel containing the string pText to the panel.
    private void addLabel(JPanel pPanel, String pText) {
        JLabel label = new JLabel(pText);
        pPanel.add(label);
    }
}
