//**************************************************************************************************
// CLASS: Student
//
// DESCRIPTION
// Student is an abstract class and is the superclass for the OnCampusStudent and OnlineStudent
// classes. Remember that in a class hierarchy, the superclass declares data and methods that are
// common to all types of students.
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019
// Project Number: 2
//
// AUTHOR
// sherly hartono (sharton1@asu.edu)
//**************************************************************************************************
public abstract class Student implements Comparable<Student> {

    // 1. Declare private instance data
    private int mCredits;
    private String mFname;
    private String mLname;
    private String mId;
    private double mTuition;

    /** 
     * 2. Student(String, String, String)
     *
     * Creates a Student object and initializes the mId, mFname, and mLname instance variables by
     * calling the mutator methods.
     */
    Student(String pId, String pFname,String pLname){
        setId(pId);
        setFname(pFname);
        setLname(pLname);
    }

    /**
     * 3. abstract calcTuition()
     *
     * calcTuition() is to be implemented by subclasses of Student. Remember that abstract methods
     * are not implemented in a superclass but must either be implemented in a subclass, or if not,
     * then the subclass also becomes an abstract class.
    */
    public abstract void calcTuition();

    /**
     * 4. compareTo()
     *
     * The java.lang.Comparable<T> interface declares one method int compareTo(T obj) that must be
     * implemented by any class which implements the interface. This method is called from Sorter.
     * keepMoving() to compare the mId fields of śwo Students.
     *
     * Compares the mId fields of 'this' Student and pStudent. Returns -1 if this Student's mId
     * field is less than pStudent's mId field. Returns 0 if this Student's mId field is equal to
     * pStudent's mId field. Returns 1 if this Student's mId field is greater than pStudent's mId
     * field.
     *
     * Note that the mId field of a Student is a java.lang.String and String also implements the
     * Comparable<String> interface and consequently, also implements a compareTo() method to
     * compare two strings. Hence, all we have to do here is to call the String class compareTo()
     * method on the two mId strings of 'this' Student and pStudent and return whatever that method
     * returns.
     */

    @Override
    public int compareTo(Student pStudent) {
        return getId().compareTo(pStudent.getId());
    }

    /**
     * 5. Accessor method for mCredits.
     */
    public int getCredits(){
        return mCredits;
    }
    
    /**
     * 6. Accessor method for mFname.
     */
    public String getFirstName(){
        return mFname;
    }
    
    /**
     * 7. Accessor method for mId.
     */
    public String getId(){
        return mId;
    }

    /**
     * 8. Accessor method for mLname.
     */
    public String getLastName(){
        return mLname;
    }

    /**
     * 9. Accessor method for mTuition.
     */
    public double getTuition(){
        return mTuition;
    }

    /**
     * 10. Mutator method for mCredits.
     */
    public void setCredits(int pCredits){
        mCredits = pCredits;
    }

    /**
     * 11. Mutator method for mFname.
     */
    public void setFname(String pFname){
        mFname = pFname;
    }

    /**
     * 12. Mutator method for mId.
     */
    public void setId(String pId){
        mId = pId;
    }

    /**
     * 13. Mutator method for mLname.
     */
    public void setLname(String pLname){
        mLname = pLname;
    }

    /**
     * 14. Mutator method for mTuition.
     */
    protected void setTuition(double pTuition){
        mTuition = pTuition;
    }

}
