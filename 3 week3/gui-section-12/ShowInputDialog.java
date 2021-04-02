//**************************************************************************************************
// CLASS: ShowInputDialog (ShowInputDialog.java)
//
// DESCRIPTION
// This is the Show Input Dialog program from "GUI Programming : Section 12".
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

public class ShowInputDialog {
    public static void main(String[] args) { new ShowInputDialog().run(); }
    public void run() {
        // Create a JFrame and make it visible.
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Input Dialog Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // showInputDialog() displays a dialog containing a JTextField. The string that is entered
        // in the text field is returned by the method.
        String msg = "What is your favorite color? "; 
        String s = JOptionPane.showInputDialog(frame, msg, "", JOptionPane.QUESTION_MESSAGE);
        System.out.println(s);
    }
}
