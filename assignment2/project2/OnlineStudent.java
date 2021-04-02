//******************************************************************************************************** 
// CLASS: OnlineStudent
//
// DESCRIPTION
// OnlineStudent is a subclass of Student and implement the abstract method calcTuition

// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019
// Project Number: 2
//
// AUTHOR
// sherly hartono (sharton1@asu.edu)
//********************************************************************************************************


public class OnlineStudent extends Student{
    private boolean mTechFee;

    /** 1
    * constructor method instantiate OnlineStudent using inherited constructor from super class
    */
    public OnlineStudent(String pId, String pFname, String pLname){
        super(pId, pFname, pLname);
    }

    /** 2
    * calculate tuition fee of a student based on residency status then set their tuition fee.
    */    
    @Override
    public void calcTuition(){
        // a)
        // Declare double variable t = getCredits() × TuitionConstants.ONLINE_CREDIT_RATE
        double t = getCredits()* TuitionConstants.ONLINE_CREDIT_RATE;

        // b)
        // If getTechFee() returns true Then
        //     t = t + TuitionConstants.ONLINE_TECH_FEE
        // End if
        if(getTechFee()){
            t = t + TuitionConstants.ONLINE_TECH_FEE;
        }

        // c)
        // Call setTuition(t)
        setTuition(t);
    }

    /** 3
    * accessor method for tech fee (whether or not the student is charge a technology fee)
    */  
    public boolean getTechFee(){
        return mTechFee;
    }

    /** 4
    * mutator method for tech fee
    */  
    public void setTechFee(boolean pTechFee){
        mTechFee = pTechFee;
    }
}