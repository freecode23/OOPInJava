//******************************************************************************************************** 
// CLASS: OnCampusStudent
//
// DESCRIPTION
// OnCampusStudent is a subclass of Student and implement the abstract method calcTuition that does
// different things than calcTuition in OnlineStudent
// 
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019 // Project Number: 2
//
// AUTHOR
// sherly hartono (sharton1@asu.edu)
//********************************************************************************************************

public class OnCampusStudent extends Student{
    public static final int RESIDENT = 1;
    public static final int NON_RESIDENT = 2;
    private int mResident;
    private double mProgramFee;

    /** 1
    * constructor method instantiate OnCampusStudent using inherited constructor from super class
    */
    public OnCampusStudent(String pId, String pFname, String pLname){
        super(pId, pFname, pLname);
    }

    /** 2
    * calculate tuition fee of a student based on residency status then set their tuition fee.
    */    
    @Override
    public void calcTuition(){

        // a) Declare double variable t
        double t;

        // b)
        // If getResidency() returns RESIDENT Then
        //     t = TuitionConstants.ONCAMP_RES_BASE
        // Else
        //     t = TuitionConstants.ONCAMP_NONRES_BASE
        // End if
        if(getResidency() == RESIDENT){
            t = TuitionConstants.ONCAMP_RES_BASE;
        }else{
            t = TuitionConstants.ONCAMP_NONRES_BASE;   
        }
        
        // c)
        // t = t + getProgramFee();
        // If getCredits() > TuitionConstants.MAX_CREDITS Then
        //     t = t + (getCredits() - TuitionConstants.MAX_CREDITS) × TuitionConstants.ONCAMP_ADD_CREDITS
        // End if
        // Call setTuition(t)
        // End Method calcTuition()
        t = t+ getProgramFee();
        if (getCredits() > TuitionConstants.MAX_CREDITS){
            t = t + (getCredits() - TuitionConstants.MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }

        setTuition(t);
    }

    /** 3
    * accessor method for program fee
    */  
    public double getProgramFee(){
        return mProgramFee;
    }

    /** 4
    * accessor method for Residency status
    */ 
    public int getResidency(){
        return mResident;
    }

    /** 5
    * mutator method for Program fee
    */ 
    public void setProgramFee(double pProgramFee){
        mProgramFee = pProgramFee;
    }

    /** 5
    * mutator method for Residency status
    */ 
    public void setResidency(int pResident){
        mResident = pResident;
    }
}