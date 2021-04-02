import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.BorderFactory;

import javax.swing.JList;
import javax.swing.ListSelectionModel;
public class Main{
// ******************** MAIN SETTING ***************************

// 1) Turn on JFrame
JFrame.setDefaultLookAndFeelDecorated(true)
 
// 2) Create JFRame and set title
JFrame frame = new JFrame("FrameDemo")

// 3) size
frame.setSize(400, 300)

// 4) close on click "X"
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

// 5) frame is visible
frame.setVisible(true);

//********************1. LABEL ***************************
final JLabel label = new JLabel("");

// can set label text in the center, left right
label.setHorizontalAlignment(JLabel.CENTER);

// do it at the same time
JLabel label = new JLabel("Im a lable", Jlabel.LEFT);

//********************1. FLOW LAYOUT ***************************
JPanel panelFunctSys = new JPanel();

// center the component in the flow layout, add 50 px vertical gap
// aligment is center by default
panelFunctSys.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));

// ******************* 2. BORDER LAYOUT ************************
panelFunctSys.setLayout(new BorderLayout());
panelFunctSys.add(panelFunctButton, BorderLayout.CENTER);
panelFunctSys.add(panelSysButton, BorderLayout.SOUTH);

// ********************3. GRID LAYOUT *************************
panelFunctButton.setLayout(new GridLayout(2, 2));

JButton buttonx = new JButton(pText);
panelFunctButton.add(buttonx);

// ********************** 4. BOX LAYOUT *************************
panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS)); 
 
// ** a) GLUE on BOXLAYOUT panel****
panelMain.add(Box.createVerticalGlue());
panelMain.add(panelLabel);
panelMain.add(Box.createVerticalGlue());
panelMain.add(panelTextField);

// ** b) RIGID AREA on BOXLAYOUT panel***
                                                //10 px wide, 0 px height
panelBottom.add(Box.createRigidArea(new Dimension(10, 0)));
panelBottom.add(panelFunctSys);

// ********************** 5 REACTIVE BUTTON ************************
// ****** STYLE A: implementing actionPerformed() in Inner class ***
public class Main {
    public static void main(String[] args) {
        new Main().run(); 
    }

    public void run() {
        // 1) create button
        JButton button = new JButton("Cancel");
        
        // 2) set size
        button.setPreferredSize(new Dimension(90, 30));

        // the argument is an object of a class that implements ActionPerformed() method
        // with this line: when button is clicked, ActionEvent object from "button" is created and passed on to ActionPerformed() as argument
        button.addActionListener(new iamImplementerClass("You clicked Cancel")); 
    }

    // *************** implementation here ********************
    private class iamImplementerClass implements ActionListener {
        private String mText;

        // ctor
        public iamImplementerClass(String pText) {
            mText = pText;
        }
        // Implementating method from ActionListener interface
        public void actionPerformed(ActionEvent pEvent) {
            mLabel.setText(mText);
        }
    }
}

// ********* STYLE B: implementing actionPerformed() in anonymous class **********
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        // create button
        JButton button = new JButton("Cancel");
        final JLabel label = new JLabel("");

        // can set label text in the center, left right
        label.setHorizontalAlignment(JLabel.CENTER);

        // do it

        // function is invoked and implemented at the same time 
        @Override
        button.addActionListener(
            // this is anon class implementing ActionListener interface
            new ActionListener() {
                public void actionPerformed(ActionEvent pEvent) {
                    label.setText("You clicked Cancel");
                }
            });
    }

// ********************** JOptionPane class ******************
// **** A. SHOW MESSAGE DIALOG *****
// different icon options:
JOptionPane.ERROR_MESSAGE;
JOptionPane.INFORMATION_MESSAGE;
JOptionPane.WARNING_MESSAGE;
JOptionPane.QUESTION_MESSAGE;
JOptionPane.PLAIN_MESSAGE;

String msg = "Kalkutron-9000 Ver.1\nSherly Hartono";

// (1-frame, 2-the message:String, 3- title:String, 4- icon JOptionPane.PLAIN_MESSAGE:constant)
JOptionPane.showMessageDialog(this, msg, "About", JOptionPane.PLAIN_MESSAGE);

// ***** B. SHOW CONFIRM DIALOG *********
int choice = JOptionPane.showConfirmDialog(frame, msg3, "Confirm", JOptionPane.YES_NO_OPTION );

// options:
JOptionPane.YES_NO_OPTION;
JOptionPane.YES_NO_CANCEL_OPTION;
JOptionPane.OK_CANCEL_OPTION;
// Yes returns 0
// No returns 1
// Cancel returns 2

// **** C. SHOW INPUT DIALOG ******

String msg = "What is your favorite color? ";
// (1-frame, 2-the message:String, 3- title:String, 4- icon : JOptionPane.QUESTION_MESSAGE:constant)
String response = JOptionPane.showInputDialog(frame, msg, "", JOptionPane.QUESTION_MESSAGE);


// ********************** 9. JTEXTFIELD class ******************

// JTextField(int no of columns or character length) 
JTextField tf1 = new JTextField(15);

// JTextField(String)
JTextField tf2 = new JTextField("This text appears in the text field.");

// JTextField(String, int)
JTextField tf3 = new JTextField("Initial text", 30);

// ActionPerformed method
// getSource() will return the object lots of info good for debug
private class TextFieldListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent pEvent) {
        JTextField tf = (JTextField)pEvent.getSource();
        
        System.out.println(pEvent.getActionCommand()); // same thing return the text inside
        System.out.println(tf.getText()); // same thing return the text inside
        
        tf.setText("************"); 
    }
}

// ***************** 10. Check which button is pressed ***********
@Override
public void actionPerformed(ActionEvent pEvent) {

    // if the Exit button is the source of the event, exit the application by calling System.exit().
    if(pEvent.getActionCommand() == "Exit"){
        dispose();
    // if the About button is the source of the event, display the about dialog using JOptionPane.showMessageDialog().
    } else if(pEvent.getActionCommand() == "About"){
        String msg = "Kalkutron-9000 Ver.1\nSherly Hartono";
        JOptionPane.showMessageDialog(this, msg, "About", JOptionPane.PLAIN_MESSAGE);
    }
}

// ***************** 11. JCheckbox ***********

final JCheckBox cb1 = new JCheckBox("Check Me Out", false);
final JCheckBox cb2 = new JCheckBox("I am Checked", true);


// isSelected() method returns true or false

JButton butOk = new JButton("OK");
butOk.addActionListener(
    new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent pEvent) {                   
            String msg = "cb1 is ";
            if (cb1.isSelected()) msg += "checked\n";
            else msg += "not checked.\n";
            msg += "cb2 is ";
            if (cb2.isSelected()) msg += "checked\n";
            else msg += "not checked.\n";
            JOptionPane.showMessageDialog(null, msg);
        }
    });

}
// ***************** 12. JList **************************
// argument is a list of String
public void run() {

    // Create an array of 5 strings to be added to the JList.
    String[] listItems = new String[30];
    for (int i = 0; i < 5; ++i) listItems[i] = "List Item " + (i + 1);

    // **** creating JLIST ****
    // argument is an array of string
    // <Data Type of the element in the array>
    final JList<String> list = new JList<>(listItems);

    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    list.setLayoutOrientation(JList.VERTICAL);
    // JList.HORIZONTAL
    // JList.VERTICAL_WRAP
    // JList.HORIZONTAL_WRAP


    // **************** 13. BORDER FACTORY ***************
                                                        // (red, green, blue), thickness pixel
                                                        // the higher the number the lighter the shade
                                                        // 0 0 0 is black
                                                        // 255, 255 ,255 is white
    list.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 128), 2));
    


    // *************** 14. SLECTED LIST *****************
    // have to select and press OK to trigger actionPerformed
    butOk.addActionListener(
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent pEvent) {    
                //   getSelectedIndex() returns -1 if nothing is selected 
                int index = list.getSelectedIndex();
                String msg;

                // index starts from 0
                if (index == -1) {
                    msg = "You did not select a list item!";
                } else {
                    msg = "You selected: " + list.getSelectedValue();
                    msg += " which is at index " + index;
                }
                JOptionPane.showMessageDialog(null, msg);
            }
        });   
}

// *************** 15. SET ALIGNMENT METHOD *****************
    // can do to any component
    // 0 means left
    // 0.5 means center
    // 1 means right
    // needs to put f because it's a float

    list.setAlignmentX(0.5f);
    butOk.setAlignmentX(0.5f);


// **************** 16. JSCROLLPANE *******************
public class ListDemo2 {
    public static void main(String[] args) { new ListDemo2().run(); }

    public void run() {
        // can only see 8 rows so need to use ScrollPane
        list.setVisibleRowCount(8);
        // 1) Create a JScrollPane object to contain the JList.
        JScrollPane listScrollPane = new JScrollPane(list);

        // 2) Add the JScrollPane to a Main panel.
        // (dont add Jlist to mainPanel otherwise it will take the entire width)
        JPanel mainPanel = new JPanel();
        mainPanel.add(listScrollPane);
    }
}

