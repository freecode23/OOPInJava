//**************************************************************************************************
// CLASS: BoxLayoutDemo3 (BoxLayoutDemo3.java)
//
// DESCRIPTION
// This is the BoxLayout Demo 3 program from "GUI Programming : Section 6".
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
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demonstrates how to create a more complex GUI layout by combining JPanels using different layout
 * managers.
 */
public class BoxLayoutDemo3 {
    public static void main(String[] args) { new BoxLayoutDemo3().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JPanel and set the layout manager to BorderLayout
        // for setting region
        JPanel panelBorder = new JPanel();
        panelBorder.setLayout(new BorderLayout());

        // Create a JPanel and set the layout manager to horizontal BoxLayout.
        JPanel panelHoriz = new JPanel();
        panelHoriz.setLayout(new BoxLayout(panelHoriz, BoxLayout.X_AXIS));

        // Add four labels to the horizontal BoxLayout panel with glue between them.
        addHorizLabel(panelHoriz, "First label", true);
        addHorizLabel(panelHoriz, "Second label", true);
        addHorizLabel(panelHoriz, "Third label", true);
        addHorizLabel(panelHoriz, "Fourth label", false);

        // Create a JPanel and set the layout manager to vertical BoxLayout.
        JPanel panelVert = new JPanel();
        panelVert.setLayout(new BoxLayout(panelVert, BoxLayout.Y_AXIS));

        // Add four labels to the vertical BoxLayout panel with a rigid area between them.
        // The height of the rigid area between each pair of labels is not the same.
        addVertLabel(panelVert, "Fifth label", 10);
        addVertLabel(panelVert, "Sixth label", 20);
        addVertLabel(panelVert, "Seventh label", 30);
        addVertLabel(panelVert, "Eighth label", 0);

        // Add the horizontal BoxLayout panel to the BorderLayout panel NORTH region.
        panelBorder.add(panelHoriz, BorderLayout.NORTH);

        // Add the vertical BoxLayout panel to the BorderLayout panel SOUTH region.
        panelBorder.add(panelVert, BorderLayout.SOUTH);

        // Create the JFrame and add the BorderLayout panel to the frame.
        JFrame frame = new JFrame("Box Layout Demo 3");
        frame.setSize(400, 300);
        frame.add(panelBorder);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Add a new JLabel containing the string pText to the panel (which is using the horizontal
    // layout). If pGlue is true then add "horizontal glue" after the JLabel using the Box
    // createHorizontalGlue() static method.
    private void addHorizLabel(JPanel pPanel, String pText, boolean pGlue) {
        JLabel label = new JLabel(pText);
        pPanel.add(label);
        if (pGlue) pPanel.add(Box.createHorizontalGlue());
    }

    // Add a new JLabel containing the string pText to the panel (which is using the vertical
    // layout). If pSpace is true then add a "rigid area" after the JLabel using the Box
    // createRigidArea() static method.
    private void addVertLabel(JPanel pPanel, String pText, int pSpace) {
        JLabel label = new JLabel(pText);
        pPanel.add(label);
        if (pSpace > 0) pPanel.add(Box.createRigidArea(new Dimension(0, pSpace)));
    }
}
