//**************************************************************************************************
// CLASS: CheckBoxDemo1 (CheckBoxDemo1.java)
//
// DESCRIPTION
// This is Check Box Demo 1 from "GUI Programming : Section 16".
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * This application demonstrates how to create GUI check boxes using the javax.swing.JCheckBox class.
 */
public class CheckBoxDemo1 {
    public static void main(String[] args) { new CheckBoxDemo1().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create two JCheckBox objects. The first one is not checked (false) and the second one is
        // checked (true).
        final JCheckBox cb1 = new JCheckBox("Check Me Out", false);
        final JCheckBox cb2 = new JCheckBox("I am Checked", true);

        // Add the two check boxes to a JPanel using the GridLayout with 2 rows
        // and 1 column. Create a 10 pixel space between each row.
        JPanel panelCheckGrid = new JPanel();
        panelCheckGrid.setLayout(new GridLayout(2, 1, 0, 10));
        panelCheckGrid.add(cb1);
        panelCheckGrid.add(cb2);

        // Create a JPanel which uses the default FlowLayout and add panelCheckGrid
        // to the JPanel. This is done so the contents of panelCheckGrid will be
        // centered in the frame.
        JPanel panelCheck = new JPanel();
        panelCheck.add(panelCheckGrid);

        // Create a JButton and an event handler for the button using an anonymous
        // class. When the button is clicked, we determine if each check box is
        // selected or unselected calling the isSelected() method. Display the
        // results in a JOptionPane dialog.
        JButton butOk = new JButton("OK");
        butOk.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent pEvent) {                   
                    String msg = "cb1 is ";
                    if (cb1.isSelected()) msg += "checked\n";
                    else msg += "not checked.\n";
                    msg += "cb2 is ";
                    if (cb2.isSelected()) msg += "checked\n";
                    else msg += "not checked.\n";
                    JOptionPane.showMessageDialog(null, msg);
                }
            });

        // Creat a JPanel for the button. Use the default FlowLayout so the button
        // will be centered in the frame.
        JPanel panelButton = new JPanel();
        panelButton.add(butOk);

        // Create a main panel to hold the panelCheck and panelButton panels. Use
        // a vertical BoxLayout. Put vertical glue above, below, and in between each
        // panel.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(javax.swing.Box.createVerticalGlue());
        mainPanel.add(panelCheck);
        mainPanel.add(javax.swing.Box.createVerticalGlue());
        mainPanel.add(panelButton);
        mainPanel.add(javax.swing.Box.createVerticalGlue());

        // Create the JFrame.
        JFrame frame = new JFrame("CheckBox Demo 1");
        frame.setSize(450, 250);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
