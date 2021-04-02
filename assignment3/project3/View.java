//******************************************************************************************************** 
// CLASS: View (View.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019 
// Project Number: 3
//
// AUTHOR
// Sherly Hartono, sharton1, sharton1@asu.edu
//********************************************************************************************************

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.w3c.dom.css.Counter;

/**
 * The View class implements the GUI. It is a subclass of JFrame and implements the ActionListener
 * interface so that we can respond to user-initiated GUI events.
 */
public class View extends JFrame implements ActionListener {

    /**
     * The width of the View.
     */
    public static final int FRAME_WIDTH  = 500;

    /**
     * The height of the View.
     */
    public static final int FRAME_HEIGHT = 250;

    /**
     * When the View() ctor is called from Main.run() to create the View, run() passes a reference
     * to the Main object as the argument to View(). We save that reference into mMain and then
     * later we can use mMain to communicate with the Main class.
     *
     * mMain is made accessible within this class via accessor/mutator methods getMain() and
     * setMain().
     */
    private Main mMain;

    /*
     * Declare GUI related instance variables for the buttons and text fields.
     */ 
    private JButton mClearButton;
    private JTextField[] mExamText;
    private JButton mExitButton;
    private JTextField[] mHomeworkText;
    private JButton mSaveButton;
    private JButton mSearchButton;
    private JTextField mSearchText;

    /**
     * mStudent is a reference to the Student object which we are currently displaying data for
     * in the View. mStudent is made accessible within the View using accessor and mutator methods
     * getStudent() and setStudent().
     */
    private Student mStudent;

    /**
     * View()
     *
     * The View constructor creates the GUI interface and makes the frame visible at the end.
     *
     * @param pMain is an instance of the Main class. This links the View to the Main class so
     * they may communicate with each other.
     */
    public View(Main pMain) {

        /**
         * Save a reference to the Main object pMain into instance var mMain by calling setMain().
         */
        setMain(pMain);

        // PSEUDOCODE DONE
        // Create a JPanel named panelSearch which uses the FlowLayout
        // Add a JLabel "Student Name: " to panelSearch
        // Create mSearchText and make the field 25 cols wide
        // Add mSearchText to the panel
        // Create mSearchButton with the label "Search"
        // Make this View the action listener for the button
        // Add the button to the panel
        JPanel panelSearch = new JPanel();

        panelSearch.add(new JLabel("Student Name: "));
        mSearchText = new JTextField(25);
        panelSearch.add(mSearchText);

        mSearchButton = new JButton("Search");
        mSearchButton.addActionListener(this);
        panelSearch.add(mSearchButton);


        // PSEUDOCODE:
        // Create a JPanel named panelHomework which uses the FlowLayout
        // Add a JLabel "Homework: " to the panel
        // Create mHomeworkText which is an array of CourseConstants.NUM_HOMEWORKS JTextFields
        // For i = 0 to CourseConstants.NUM_HOMEWORKS - 1 Do
        //     Create a textfield mHomeworkText[i] displaying 5 cols
        //     Add mHomeworkText[i] to the panel
        // End For
        // ???
        JPanel panelHomework = new JPanel();
        panelHomework.add(new JLabel("Homework"));

        mHomeworkText = new JTextField[CourseConstants.NUM_HOMEWORKS];

        for(int i = 0; i <= CourseConstants.NUM_HOMEWORKS -1; i++){
            mHomeworkText[i] = new JTextField(5);
            panelHomework.add(mHomeworkText[i]);
        }

        // Create the exam panel which contains the "Exam: " label and the two exam text fields.
        // The pseudocode is omitted because this code is very similar to the code that creates the
        // panelHomework panel above.
        // ???
        JPanel panelExam = new JPanel();
        panelExam.add(new JLabel("Exam"));

        mExamText = new JTextField[CourseConstants.NUM_EXAMS];
        for(int i = 0; i <= CourseConstants.NUM_EXAMS -1; i++){
            mExamText[i] = new JTextField(5);
            panelExam.add(mExamText[i]);
        }


        // PSEUDOCODE Done
        // Create a JPanel named panelButtons using FlowLayout
        // Create the Clear button mClearButton labeled "Clear"
        // Make this View the action listener for mClearButton
        // Add the  Clear button to the panel
        // Repeat the three above statements for the Save button
        // Repeat the three above statements for the Exit button
        // ???
        JPanel panelButtons = new JPanel();

        JButton mClearButton = new JButton("Clear");
        mClearButton.addActionListener(this);
        panelButtons.add(mClearButton);

        JButton mSaveButton = new JButton("Save");
        mSaveButton.addActionListener(this);
        panelButtons.add(mSaveButton);

        JButton mExitButton = new JButton("Exit");
        mExitButton.addActionListener(this);
        panelButtons.add(mExitButton);

        // PSEUDOCODE:
        // Create a JPanel named panelMain using a vertical BoxLayout
        // Add panelSearch to panelMain.
        // Add panelHomework to panelMain
        // Add panelExam to panelMain
        // Add panelButtons to panelMain
        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BoxLayout(panelMain, BoxLayout.Y_AXIS));

        panelMain.add(panelSearch);
        panelMain.add(panelHomework);
        panelMain.add(panelExam);
        panelMain.add(panelButtons);

        // Set the title of the View to whatever you want by calling setTitle()
        setTitle("Hey llo");
        
        // Set the size of the View to FRAME_WIDTH x FRAME_HEIGHT
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        // Make the View non-resizable
        setResizable(false);
        
        // Set the default close operation to JFrame.EXIT_ON_CLOSE. What this does is if the user
        // clicks on the button in the View's titlebar to close the View, then the View will
        // be closed (as opposed to making the View dance around on the screen).
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add panelMain to the View.
        add(panelMain);

        // *** If you are a Mac user, call pack() now to pack the View. I'm not exactly sure what
        // *** this does but if you do not do it, your View window may be too small for the
        // *** contents.
        this.pack();
        // Now display the View by calling setVisible().
        setVisible(true);
    }

    /**
     * actionPerformed()
     *
     * Called when one of the JButtons is clicked. Detects which button was clicked and handles it.
     *
     * Make sure to write the @Override annotation to prevent accidental overloading because we are
     * overriding JFrame.actionPerformed().
     *
     * PSEUDOCOODE:
     * method actionPerformed(pEvent : ActionEvent) : void
     * If the source of the event was the Search button Then
     *     lastName = retrieve the text from the mSearchText text field
     *     If lastName is the empty string Then
     *         Call messageBox() to display "Please enter the student's last name."
     *     Else
     *         -- Main contains a method named search() which given the last name of a student
     *         -- will search the Roster for the student. search() either returns the Student
     *         -- object if found, or if there is no student with that last name in the Roster,
     *         -- then search() returns null.
     *         student = Call getMain().search(lastName)
     *         If student is null Then
     *             Call messageBox() to display "Student not found. Try again."
     *         Else
     *             Call setStudent(student) to save the Student reference into instance var mStudent
     *             Call displayStudent(student)  -- display the student's scores
     *         End if
     *     End If
     * Else if the source of the event was the Save button Then
     *     If getStudent() is not null Then Call saveStudent(getStudent())
     * Else if the source of the event was the Clear button Then
     *     Call clear()
     * Else if the source of the event was the Exit button Then
     *     If getStudent() is not null Then Call saveStudent(getStudent())
     *     Call getMain().exit() to terminate the application
     * End If
     * end actionPerformed
     */
    @Override 
    public void actionPerformed(ActionEvent pEvent){
        if(pEvent.getActionCommand() == "Search"){
            String lastName = mSearchText.getText();
            if(lastName.isEmpty()){
                messageBox("Please enter the student's last name.");
            }else{
                Student student = getMain().search(lastName);
                if(student == null){
                    messageBox("Student not found. Try again");
                }else{
                    setStudent(student);
                    displayStudent(student);
                }
            }
        }else if(pEvent.getActionCommand() == "Save"){
            if(getStudent()!= null){
                saveStudent(getStudent());
            }
        }else if(pEvent.getActionCommand() == "Clear"){
            clear();
        }else if(pEvent.getActionCommand() == "Exit"){
            saveStudent(getStudent());
            getMain().exit();
        }
    }
    

    /**
     * clear()
     *
     * Called when the Clear button is clicked. Clears all of the text fields by setting the
     * contents of each to the empty string.
     *
     * After clear() returns, no student information is being edited or displayed and mStudent
     * has been set to null.
     *
     * PSEUDOCODE:
     * method clear() : void
     *     Set the mSearchText text field to ""
     *     Set each of the homework text fields to "" -- note use a for loop
     *     Set each of the exam text fields to "" -- using a for loop
     *     call setStudent(null) to set the mStudent reference to null
     * end clear
     */
    private void clear(){
        for(int i = 0; i <= CourseConstants.NUM_HOMEWORKS -1; i++){
            mHomeworkText[i].setText("");
        }

        for(int i = 0; i <= CourseConstants.NUM_EXAMS -1; i++){
            mExamText[i].setText(""); 
        }
        setStudent(null);
    }

    /**
     * displayStudent()
     *
     * Displays the homework and exam scores for a student in the mHomeworkText and mExamText text
     * fields.
     *
     * @param pStudent is the Student who's scores we are going to use to populate the text fields.
     *
     * PSEUDOCODE:
     * method displayStudent(pStudent : Student) : void
     *     For i = 0 to CourseConstants.NUM_HOMEWORKS - 1 Do
     *         int hw = pStudent.getHomework(i)
     *         String hwstr = convert hw to a String (Hint: Integer.toString())
     *         mHomeworkText[i].setText(hwstr)
     *     End For
     *     Write a similar for loop to place the student's exams scores into the text fields
     * end displayStudent
     */

    private void displayStudent(Student pStudent){

        for(int i = 0; i <= CourseConstants.NUM_HOMEWORKS -1; i++){
            int hw = pStudent.getHomework(i);
            String hwstr = Integer.toString(hw);
            mHomeworkText[i].setText(hwstr);
        }

        for(int i = 0; i <= CourseConstants.NUM_EXAMS -1; i++){
            int exam = pStudent.getExam(i);
            String examstr = Integer.toString(exam);
            mExamText[i].setText(examstr); 
        }
    }


    /**
     * Accessor method for mMain.
     */ 
    private Main getMain() {
        return mMain;
    }    

    /**
     * Accessor method for mStudent.
     */ 
    private Student getStudent() {
        return mStudent;
    }

    /**
     * messageBox()
     *
     * Displays a message box containing some text. Note: pass 'this' as the first argument to
     * JOptionPane.showMessageDialog() to make the View the parent window of the message dialog.
     * This will cause the message dialog to be centered in the View. If you pass null as the
     * first argument, then the message dialog will not have a parent window and it will be
     * displayed in the center of the screen.
     *
     * PSEUDOCODE:
     * method messageBox(pMessage : String) : void
     *     Call JOptionPane.showMessageDialog() to display pMessage.
     * end messageBox
     */
    public void messageBox(String pMessage) {
        JOptionPane.showMessageDialog(this, pMessage, "Message", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * saveStudent()
     *
     * Retrieves the homework and exam scores for pStudent from the text fields and writes the
     * results to the Student record in the Roster.
     *
     * PSEUDOCODE:
     * method saveStudent(pStudent : Student) : void
     *     For i = 0 to CourseConstants.NUM_HOMEWORKS - 1 Do
     *         String hwstr = mHomeworkText[i].getText()
     *         int hw = convert hwstr to an int (Hint: Integer.parseInt())
     *         Call pStudent.setHomework(i, hw)
     *     End For
     *     Write a similar for loop to save the exam scores in pStudent
     * end method saveStudent
     */
    private void saveStudent(Student pStudent){
        for(int i = 0; i <= CourseConstants.NUM_HOMEWORKS -1; i++){
            String hwstring = mHomeworkText[i].getText();
            if(!hwstring.isEmpty()){
                int hw = Integer.parseInt(hwstring);
                pStudent.setHomework(i, hw);
            }
        }

        for(int i = 0; i <= CourseConstants.NUM_EXAMS -1; i++){
            String examstring = mExamText[i].getText();
            if(!examstring.isEmpty()){
                int exam = Integer.parseInt(examstring);
                pStudent.setExam(i, exam);
            }
        }
    }
    
    
    /**
     * Mutator method for mMain.
     */ 
    private void setMain(Main pMain) {
        mMain = pMain;
    }    

    /**
     * Mutator method for mStudent.
     */ 
    private void setStudent(Student pStudent) {
        mStudent = pStudent;
    }

}
