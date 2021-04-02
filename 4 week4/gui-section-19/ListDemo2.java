//**************************************************************************************************
// CLASS: ListDemo2 (ListDemo2.java)
//
// DESCRIPTION
// This is List Demo 2 from "GUI Programming : Section 19".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 * This application demonstrates how to create a vertical list using the javax.swing.JList and
 * javax.swing.JScrollPane classes.
 */
public class ListDemo2 {
    public static void main(String[] args) { new ListDemo2().run(); }

    public void run() {
        // Use the Swing look and feel.
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create an array of 30 strings to be added to the JList.
        String[] listItems = new String[30];
        for (int i = 0; i < 30; ++i) listItems[i] = "List Item " + (i + 1);

        // Create a JList where each list item is a String. setVisibleRowCount()
        // specifies that we wish to make the JList large enough to display 8
        // list items at a time.
        final JList<String> list = new JList<>(listItems);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(8);

        // Create a JScrollPane to contain the JList.
        JScrollPane listScrollPane = new JScrollPane(list);

        // Add the JScrollPane to a FlowLayout panel.
        JPanel listPanel = new JPanel();
        listPanel.add(listScrollPane);

        // Create a JButton labeled "OK". Add an action listener to the button using
        // an anonymous class. When the button is clicked we will determine which
        // list item was selected by calling list.getSelectedIndex(). If that method
        // returns -1 then no list item was selected. Otherwise, the index of the
        // selected item is returned; the indices are numbered starting at 0.
        JButton butOk = new JButton("OK");
        butOk.setAlignmentX(0.5f);
        butOk.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent pEvent) {                   
                    int index = list.getSelectedIndex();
                    String msg;
                    if (index == -1) {
                        msg = "You did not select a list item!";
                    } else {
                        msg = "You selected: " + list.getSelectedValue();
                        msg += " which is at index " + index;
                    }
                    JOptionPane.showMessageDialog(null, msg);
                }
            });

        // Create a JPanel using the vertical BoxLayout layout manager. Add the JList
        // and JButton to the panel with vertical glue above, between, and below them.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(listScrollPane);
        mainPanel.add(Box.createVerticalGlue());
        mainPanel.add(butOk);
        mainPanel.add(Box.createVerticalGlue());

        // Create the main frame and add the panel to it.
        JFrame frame = new JFrame("List Demo 2");
        frame.setSize(450, 250);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
