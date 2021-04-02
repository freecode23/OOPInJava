//**************************************************************************************************
// CLASS: TextFieldDemo3 (TextFieldDemo3.java)
//
// DESCRIPTION
// This is  Text Field Demo 3 from "GUI Programming : Section 15".
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * This application demonstrates how to retrieve the text stored in a JTextField when a JButton
 * action listener is invoked.
 */
public class TextFieldDemo3 {
    public static void main(String[] args) { new TextFieldDemo3().run(); }

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
        final JTextField tf1 = new JTextField("");
        final JTextField tf2 = new JTextField("This is the initial text");
        final JTextField tf3 = new JTextField("(???) ???-????");


        // Create a JPanel for the JTextFields and use the GridLayout with 3 rows
        // and 1 column. Set the vertical space between the rows to 10 pixels. Add
        // the text fields to the panel.
        JPanel panelTextField = new JPanel();
        panelTextField.setLayout(new GridLayout(3, 1, 0, 10));
        panelTextField.add(tf1);
        panelTextField.add(tf2);
        panelTextField.add(tf3);

        // Create a JPanel for the label and text field panels. The default layout
        // of FlowLayout is used, with a 50 pixel vertical gap. GUI components will
        // be centered within the region allocated for them.
        JPanel panelText = new JPanel();
        panelText.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        panelText.add(panelLabel);
        panelText.add(panelTextField);

        // Create a JButton labeled "OK". Add an action listener to the button using
        // an anonymous class. When the button is clicked we will retrieve the text
        // stored in each text field and display the text strings in a message dialog.
        JButton butOk = new JButton("OK");
        butOk.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent pEvent) {
                    String msg = "tf1 = [" + tf1.getText() + "]\n";
                    msg += "tf2 = [" + tf2.getText() + "]\n";
                    msg += "tf3 = [" + tf3.getText() + "]";
                    System.out.println(pEvent.getActionCommand()== "OK");
                    // null means use default fram
                    JOptionPane.showMessageDialog(null, msg);
                }
            });

        // Creat a JPanel for the button. Use the default FlowLayout.
        JPanel panelButton = new JPanel();
        panelButton.add(butOk);

        // Create a main panel to hold the panelText and panelButton panels. Use
        // a vertical BoxLayout.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(panelText);
        mainPanel.add(panelButton);

        JFrame frame = new JFrame("TextField Demo 3");
        frame.setSize(450, 250);
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
