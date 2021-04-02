//**************************************************************************************************
// CLASS: FrameDemo (FrameDemo.java)
//
// DESCRIPTION
// This is the JFrame demo program from "GUI Programming : Section 1".
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

/**
 * Demonstrates how to create a JFrame using the native look and feel (platform-dependent) or the
 * Swing default look and feel.
 */
public class FrameDemo {
    public static void main(String[] args) { new FrameDemo().run(); }

    public void run() {
        // Pass false to setLookAndFeelDecorated() to use the native (OS) look and feel.
        // Pass true to set the Swing look and feel. Note that this method must be called before
        // the JFrame is created.
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JFrame object and set the title bar string to "FrameDemo".
        JFrame frame = new JFrame("FrameDemo");

        // The frame will be 400 pixels wide and 300 pixels high.
        frame.setSize(400, 300);

        // Pass EXIT_ON_CLOSE to specify that the frame should be closed when the X button on the
        // title bar is clicked.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // A frame is not displayed until we call setVisible() and pass true.
        frame.setVisible(true);
    }
}
