//**************************************************************************************************
// inner class implements interface
//**************************************************************************************************
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * This application demonstrates how to create an event listener for JButton clicks as an inner
 * class.
 */
public class ButtonDemo4 {
    public static void main(String[] args) { new ButtonDemo4().run(); }

    public void run() {
        // Use the Swing look and feel.
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Create a JLabel which will be added to the JPanel panelBorder later.
        JLabel label = new JLabel("");
        label.setHorizontalAlignment(JLabel.CENTER);

        // Create a JPanel for the buttons using the horizontal BoxLayout layout
        // manager.
        JPanel panelButton = new JPanel();
        panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.X_AXIS));

        // Create a JButton with the text "OK" 
        JButton butOk = newButton("OK", 90, 30);

        // Create a ButtonListener object to respond to button clicks on butOk.
        butOk.addActionListener(new ButtonListener(label, "You clicked OK"));

        // Add butOk to the JPanel panelButton, but put some glue before it. 
        panelButton.add(Box.createHorizontalGlue());
        panelButton.add(butOk);

        // Create a rigid area 25 pixels wide between the OK and Cancel buttons.
        panelButton.add(Box.createRigidArea(new Dimension(25, 0)));

        // Create a JButton with the text "Cancel" 
        JButton butCancel = newButton("Cancel", 90, 30);

        // Create a ButtonListener object to respond to button clicks on butCancel.
        butCancel.addActionListener(new ButtonListener(label, "You clicked Cancel"));

        // Add butCancel to the JPanel panelButton, but put some glue after it. 
        panelButton.add(butCancel);
        panelButton.add(Box.createHorizontalGlue());

        // Create a new BorderLayout panel.
        JPanel panelBorder = new JPanel();
        panelBorder.setLayout(new BorderLayout());

        // Add the label to panelBorder in the center region.
        panelBorder.add(label, BorderLayout.CENTER);

        // Add the JPanel panelButton to panelBorder in the south region.
        panelBorder.add(panelButton, BorderLayout.SOUTH);

        // Create the JFrame and add the JPanel panelBorder to it.
        JFrame frame = new JFrame("Button Demo 4");
        frame.setSize(400, 300);
        frame.add(panelBorder);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Create a new JButton displaying the text pText. 
    private JButton newButton(String pText, int pWidth, int pHeight) {
        JButton button = new JButton(pText);
        button.setPreferredSize(new Dimension(pWidth, pHeight));
        return button;
    }
    // **********************************ONLY DIFFERENCE IS HERE ***********************************
    // inner class implements interface
    private class ButtonListener implements ActionListener {
        private JLabel mLabel;
        private String mText;

        public ButtonListener(JLabel pLabel, String pText) {
            mLabel = pLabel;
            mText = pText;
        }

        // method from  ActionListener interface. Restating here
        public void actionPerformed(ActionEvent pEvent) {
            mLabel.setText(mText);
        }
    }
}
