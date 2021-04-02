//**************************************************************************************************
// CLASS: MessageDialog1 (MessageDialog1.java)
//
// DESCRIPTION
// This is the Message Dialog 1 program from "GUI Programming : Section 12".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MessageDialog1 {
    public static void main(String[] args) { new MessageDialog1().run(); }

    public void run() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JFrame and make it visible.
        JFrame frame = new JFrame("Message Dialog Demo 1");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // To display a simple message dialog window displaying a text string, we call the
        // static showMessageDialog() method of the JOptionPane class. The first argument is the
        // parent frame of the dialog window and the second argument is the String to be displayed.
        String msg = "This is the message that will be displayed";
        JOptionPane.showMessageDialog(frame, msg);
    }
}
