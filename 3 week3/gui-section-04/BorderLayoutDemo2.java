//**************************************************************************************************
// CLASS: BorderLayoutDemo2 (BorderLayoutDemo2.java)
//
// DESCRIPTION
// This is the BorderLayout Demo 2 program from "GUI Programming : Section 4".
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
 * Demonstrates how GUI components are laid out using the BorderLayout manager. In this case, we
 * only add components to the NORTH and SOUTH regions.
 */
public class BorderLayoutDemo2 {
    public static void main(String[] args) { new BorderLayoutDemo2().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JPanel to add the GUI components to and set the layout manager to BorderLayout.
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Add two JLabels, one to NORTH and one to SOUTH.
        addLabel(panel, "CENTER",  BorderLayout.CENTER);
        addLabel(panel, "South",  BorderLayout.SOUTH);

        JFrame frame = new JFrame("BorderLayout Demo 2");
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
        // label.setHorizontalAlignment(JLabel.CENTER);
        pPanel.add(label, pWhere);
    }
}
