//**************************************************************************************************
// CLASS: TextFieldDemo1 (TextFieldDemo1.java)
//
// DESCRIPTION
// This is  Text Field Demo 1 from "GUI Programming : Section 13".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This application demonstrates how to create GUI text fields using the javax.swing.JTextField
 * class.
 */
public class TextFieldDemo1 {
    public static void main(String[] args) { new TextFieldDemo1().run(); }
    public void run() {
        // Use the Swing look and feel.
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create three JLabels.
        JLabel label1 = new JLabel("Text Field 1: ", JLabel.LEFT);
        JLabel label2 = new JLabel("Text Field 2: ", JLabel.LEFT);
        JLabel label3 = new JLabel("Text Field 3: ", JLabel.LEFT);

        // Create a JPanel for the JLabels and use the GridLayout with 3 rows and
        // 1 column. Set the vertical space between the rows to 10 pixels. Add the
        // labels to the panel.
        JPanel panelLabel = new JPanel();
        panelLabel.setLayout(new GridLayout(3, 1, 0, 10));
        panelLabel.add(label1);
        panelLabel.add(label2);
        panelLabel.add(label3);

        // Create three JTextFields.
        JTextField tf1 = new JTextField("");
        JTextField tf2 = new JTextField("This is the initial text");
        JTextField tf3 = new JTextField("(???) ???-????");

        // Create a JPanel for the JTextFields and use the GridLayout with 3 rows
        // and 1 column. Set the vertical space between the rows to 10 pixels. Add
        // the text fields to the panel.
        JPanel panelTextField = new JPanel();
        panelTextField.setLayout(new GridLayout(3, 1, 0, 10));
        panelTextField.add(tf1);
        panelTextField.add(tf2);
        panelTextField.add(tf3);

        // Create a main panel to hold the panelLabel and panelTextField panels.
        // The layout for mainPanel will be FlowLayout. Add the panelLabel
        // and panelTextField panels to mainPanel.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        mainPanel.add(panelLabel);
        mainPanel.add(panelTextField);

        // Create a JFRame and add the mainPanel to the frame.
        JFrame frame = new JFrame("TextField Demo 1");
        frame.setSize(450, 200);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
