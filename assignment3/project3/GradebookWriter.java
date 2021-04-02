//******************************************************************************************************** 
// CLASS: GradebookWriter (GradebookWriter.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019 
// Project Number: 3
//
// AUTHOR
// Sherly Hartono, sharton1, sharton1@asu.edu
//********************************************************************************************************

// Import statements.
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 * GradebookWriter inherits from PrintWriter and writes the gradebook info to the file whose name
 * is passed to the ctor.
 */
public class GradebookWriter extends PrintWriter {

    /**
     * Call the super class ctor that takes a String as the argument, i.e, PrintWriter(String).
     * The PrintWriter ctor opens the file named by pFname for writing. It will throw a
     * FileNotFoundException if the file could not be opened for writing. We throw the exception
     * here as well where it will eventually be caught in Main.exit() -- see Software Requirements
     * 11 and 12.
     *
     * @param pFname The name of the output file to be opened for writing.
     */

    public GradebookWriter(String pFname) throws FileNotFoundException{
        super(pFname);
    }

    /**
     * Writes the gradebook info to the output file which was opened in the ctor.
     * 
     * @param pRoster The roster of students.
     *
     * PSEUDOCODE:
     * method writeGradebook(pRoster : Roster() : void
     *     EnhancedFor each student in pRoster.getStudentList() Do
     *         Call println(student)
     *     End For
     *     Call close()
     * end writeGradebook
     */
    public void writeGradebook(Roster pRoster){
        for(Student student : pRoster.getStudentList()){
            println(student);        
        }
        close();
    }   
}