//**************************************************************************************************
// CLASS: GradebookWriter
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
//**************************************************************************************************

// Import statements.
???

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
    ???

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
    ???
}
