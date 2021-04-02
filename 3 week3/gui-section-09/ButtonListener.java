//**************************************************************************************************
// CLASS: ButtonListener
//
// DESCRIPTION
// This is the Button Listener class from "GUI Programming : Section 9".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 * ButtonListener will listen for JButton clicks. When the button is clicked, the string in mText
 * will be displayed on the JLabel mLabel.
 */
public class ButtonListener implements ActionListener {
    private JLabel mLabel;
    private String mText;

    public ButtonListener(JLabel pLabel, String pText) {
        mLabel = pLabel;
        mText = pText;
    }

    // method from  ActionListener interface . restating here
    // This method is called when the JButton associated with this ActionListener
    // is clicked. We display mText on mLabel.
    public void actionPerformed(ActionEvent pEvent) {
        // instance method of label class 
        mLabel.setText(mText);
    }
}
