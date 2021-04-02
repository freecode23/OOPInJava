//******************************************************************************************************** 
// CLASS: Student (Student.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019 
// Project Number: 3
//
// AUTHOR
// Sherly Hartono, sharton1, sharton1@asu.edu
//********************************************************************************************************


import java.util.ArrayList;

/**
 * The Student class stores the gradebook information for one Student.
 *
 * Note that Student implements the java.lang.Comparable<Student> interface because we are going
 * to be sorting the roster of students by last name so we need to be able to compare the last
 * names of two students A and B to determine if A < B, or if A = B, or if A > B. See the
 * compareTo() method.
 */
public class Student implements Comparable<Student> {

    /**
     * mExamList is an ArrayList of Integers storing the student's exam scores.
     */
    
    private ArrayList<Integer> mExamList;
    
    /**
     * The student's first name.
     */
    
    private String mFirstName;

    /**
     * mHomework List is an ArrayList of Integers storing the student's homework scores.
     */
    
    private ArrayList<Integer> mHomeworkList;

    /**
     * The student's lst name.
     */
    
    private String mLastName;

    /**
     * Student()
     *
     * PSEUDOCODE done
     * method Student(pFirstName : String, pLastName : String)
     *     save parameters pFirstName and pLastName to instance variables by calling mutators
     *     -- Note that we only create the exam list here, it will be populated later
     *     create an ArrayList<Integer> and pass it off to setExamList()
     *     -- Note that we only create the homework list here, it will be populated later
     *     create an ArrayList<Integer> and pass it off to setHomeworkList()
     * end Student()
     */
    
    public Student(String pFirstName, String pLastName){
        setFirstName(pFirstName);
        setLastName(pLastName);
        setExamList(new ArrayList<Integer>());
        setHomeworkList(new ArrayList<Integer>());

    }

    /**
     * addExam()
     *
     * Adds an exam score pScore to the exam list
     *
     * @param pScore
     *
     * PSEUDOCODE done
     * method addExam(pScore : int) : void
     *     call add(pScore) on getExamList() to add a new exam score to the list of exam scores.
     * end addExam
     */
    
    public void addExam(int pScore){
        getExamList().add(pScore);
    }

    /**
     * addHomework()
     *
     * Adds a homework score pScore to the homework list
     *
     * @param pScore
     *
     * PSEUDOCODE:
     * method addHomework(pScore : int) : void
     *     call add(pScore) on getHomeworkList() to add a new homework score to the list of
     *     homework scores
     * end addHomework
     */
    
    public void addHomework(int pScore){
        getHomeworkList().add(pScore);
    }
    

    /**
     * compareTo()
     *
     * @param pStudent is a Student
     *
     * This method compares the last name of 'this' Student to the last name of pStudent to
     * determine if the last name of 'this' Student is <, =, or > the last name of pStudent.
     * It is called during the quick sort routine in Sorter.partition().
     *
     * Provide the annotation that prevents accidental overloading since we are overriding the
     * String.compareTo() method.
     *
     * PSEUDOCODE:
     * method compareTo(pStudent : Student) : int
     *     return: -1 if the last name of this Student is < the last name of pStudent
     *     return:  0 if the last name of this Student is = the last name of pStudent
     *     return:  1 if the last name of this Student is > the last name of pStudent
     *     hint: the last names are Strings and String already implements compareTo().
     * end compareTo
     */
    @Override 
    public int compareTo(Student pStudent){
        if(this.mLastName.compareTo(pStudent.mLastName) < 0){
            System.out.println(this.mLastName);
           return -1; 
        }else if(this.mLastName.compareTo(pStudent.mLastName) > 0){
            System.out.println(this.mLastName);
            return 1;
        }else {
            return 0;
        }   
    }

    /**
     * getExam()
     *
     * Accessor method to retrieve an exam score from the list of exams.
     *
     * @param pNum The exam number for which we wish to retrieve the score. The number of
     * exams is in 1, 2, 3, ..., CourseConstants.NUM_EXAMS.
     *
     * @return The homework score.
     */
    public int getExam(int pNum) {
        return getExamList().get(pNum);
    }

    /**
     * getExamList()
     *
     * Accessor method for mExamList.
     */
    private ArrayList<Integer> getExamList() {
        return mExamList;
    }

    /**
     * getFirstName()
     *
     * Accessor method for mFirstName.
     */
    public String getFirstName() {
        return mFirstName;
    }

    /**
     * getHomework()
     *
     * Accessor method to retrieve a homework score from the list of homeworks.
     *
     * @param pNum The homework number for which we wish to retrieve the score. The number of
     * homeworks is in 1, 2, 3, ..., CourseConstants.NUM_HOMEWORKS.
     *
     * @return The homework score.
     */
    public int getHomework(int pNum) {
        return getHomeworkList().get(pNum);
    }

    /**
     * getHomeworkList()
     *
     * Accessor method for mHomeworkList.
     */
    private ArrayList<Integer> getHomeworkList() {
        return mHomeworkList;
    }

    /**
     * getLastname()
     *
     * Accessor method for mLastName.
     */
    public String getLastName() {
        return mLastName;
    }

    /**
     * setExam()
     *
     * Mutator method to store an exam score into the list of exam scores.
     *
     * @pNum is the index into the list of exams, where 0 is the index of the first exam score.
     */
    public void setExam(int pNum, int pScore) {
        getExamList().set(pNum, pScore);
    }

    /**
     * setExamList()
     *
     * Mutator method for mExamList.
     */
    private void setExamList(ArrayList<Integer> pExamList) {
        mExamList = pExamList;
    }

    /**
     * setFirstName()
     *
     * Mutator method for mFirstName.
     */
    public void setFirstName(String pFirstName) {
        mFirstName = pFirstName;
    }

    /**
     * setHomework()
     *
     * Mutator method to store a homework score into the list of homework scores.
     *
     *
     * @pNum is the index into the list of homeworks, where 0 is the index of the first hw score.
     */
    public void setHomework(int pNum, int pScore) {
        getHomeworkList().set(pNum, pScore);
    }

    /**
     * setHomeworkList()
     *
     * Mutator method for mHomeworkList.
     */
    private void setHomeworkList(ArrayList<Integer> pHomeworkList) {
        mHomeworkList = pHomeworkList;
    }

    /**
     * setLastname()
     *
     * Mutator method for mLastName.
     */
    public void setLastName(String pLastName) {
        mLastName = pLastName;
    }

    /**
     * toString()
     *
     * Returns a String representation of this Student. The format of the returned string shall be
     * such that the Student information can be printed to the output file in this format:
     *
     *     lastname firstname hw1 hw2 hw3 hw4 exam1 exam2
     *
     * where the fields are separated by spaces, except there is not space following exam2.
     *
     * Hint: The String class has a method named trim() that removes leading and trailing white-
     * space from a string.
     */
    @Override  
    public String toString() {
      return "" + mLastName.trim() + " " + mFirstName.trim() + " " + mHomeworkList.get(0) + " "+ mHomeworkList.get(1)+ " " + mHomeworkList.get(2) + " "+ mHomeworkList.get(3) +" "+ mExamList.get(0)+ " "+ mExamList.get(1);

    }

}
