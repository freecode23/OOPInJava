//**************************************************************************************************
// CLASS: MessageDialog2 (MessageDialog2.java)
//
// DESCRIPTION
// This is the Message Dialog 2 program from "GUI Programming : Section 12".
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

public class MessageDialog2 {
    public static void main(String[] args) { new MessageDialog2().run(); }

    public void run() {
        // Create a JFrame and make it visible.
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Message Dialog Demo 2");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // In this version we are displaying our own string "Hey!!!!!" in the title bar of the
        // dialog window and we are also not displaying a graphical icon.
        String msg = "This is the message that will be displayed";
        JOptionPane.showMessageDialog(frame, msg, "Hey!!!!!", JOptionPane.PLAIN_MESSAGE);
    }
}
