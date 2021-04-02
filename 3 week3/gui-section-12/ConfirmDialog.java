//**************************************************************************************************
// CLASS: ConfirmDialog (ConfirmDialog.java)
//
// DESCRIPTION
// This is the Confirm Dialog program from "GUI Programming : Section 12".
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

public class ConfirmDialog {
    public static void main(String[] args) { new ConfirmDialog().run(); }

    public void run() {
        // Create a JFrame and make it visible.
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Confirm Dialog Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // A Confirm Dialog is used to display a message -- asking a question. The selected button
        // is returned as an int from the method.
        String msg = "Erase your hard drive?"; 
        int choice = JOptionPane.showConfirmDialog(frame, msg, "Confirm", JOptionPane.YES_NO_OPTION);
        System.out.println(choice);
    }
}
