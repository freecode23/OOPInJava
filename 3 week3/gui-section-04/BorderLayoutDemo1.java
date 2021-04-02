//**************************************************************************************************
// CLASS: BorderLayoutDemo1 (BorderLayoutDemo1.java)
//
// DESCRIPTION
// This is the BorderLayout Demo 1 program from "GUI Programming : Section 4".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates how GUI components are laid out using the BorderLayout manager.
 */
public class BorderLayoutDemo1 {
    public static void main(String[] args) { new BorderLayoutDemo1().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JPanel to add the GUI components to and set the layout manager to BorderLayout.
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Add five JLabels, one to each BorderLayout region.
        addLabel(panel, "North",  BorderLayout.NORTH);
        addLabel(panel, "South",  BorderLayout.SOUTH);
        addLabel(panel, "East",   BorderLayout.EAST);
        addLabel(panel, "West",   BorderLayout.WEST);
        addLabel(panel, "Center", BorderLayout.CENTER);

        JFrame frame = new JFrame("BorderLayout Demo 1");
        frame.setSize(400, 300);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Creates a JLabel containing the string pText and adds it to the JPanel in the
    // BorderLayout region specified by pWhere. Note: the setHorizontalAlignment()
    // method call on the JLabel causes the text of the label to be displayed centered
    // in the BorderLayout region. Without this method call, the text of each label would
    // be left justified in the region.
    private void addLabel(JPanel pPanel, String pText, String pWhere) {
        JLabel label = new JLabel(pText);
        label.setHorizontalAlignment(JLabel.CENTER);
        pPanel.add(label, pWhere);
    }
}
