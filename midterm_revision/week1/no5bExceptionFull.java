//Revision week 1-5b
// close files in other method. so don't need finally clause to close it. 
// if the file doesnt exist it will just throw an exception and wont read the next line of code

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionFull {

    public static void main(String[] args){
        new Main().run();
    }
    /** 1)
     * run()
     * Calls other methods to implement the sw requirements.
    */
    private void run(){

        ArrayList<Student> studentList = null;
        
        // try to read
        try{
            studentList = readFile();
        } catch (FileNotFoundException ex) {
            System.err.println("Sorry, could not open 'p02-students.txt' for reading. Stopping.");
            System.exit(-1);
        }

        calcTuition(studentList);
        Sorter.insertionSort(studentList, Sorter.SORT_ASCENDING);
        
        // try to write
        try{
            writeFile(studentList);
        }catch (FileNotFoundException ex){
            System.err.println("Sorry, could not open 'p02-tuition.txt' for reading. Stopping.");
            System.exit(-1);
        }

    }

     private void calcTuition(ArrayList<Student> pStudentList){
         for(Student student : pStudentList){
             student.calcTuition();
            // a polymorphic method call
            // can be called on OnCampusStudent object and OnlineStudent object.
         }
     }

    /** 4)
     * read File
     */

    private ArrayList<Student> readFile() throws FileNotFoundException{
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner in = new Scanner(new File("p02-students.txt"));
        while(in.hasNext()){
            String studentType = in.next();
            if(studentType.equals("C")){
                studentList.add(readOnCampusStudent(in));        
            }else{
                studentList.add(readOnlineStudent(in));
            }
        }
        in.close();
        return studentList;
    }

    /** 4)
     * read and set Campus
     */
    private OnCampusStudent readOnCampusStudent(Scanner pIn){
        String id = pIn.next();
        String lname = pIn.next();
        String fname = pIn.next();
        OnCampusStudent student = new OnCampusStudent(id,fname,lname);

        String res = pIn.next();
        double fee = pIn.nextDouble();
        int credits = pIn.nextInt();

        if(res.equals("R")){
            student.setResidency(OnCampusStudent.RESIDENT);
        }else{
            student.setResidency(OnCampusStudent.NON_RESIDENT);
        }
        student.setProgramFee(fee);
        student.setCredits(credits);
        return student;
    }
    
    /** 5)
     * read and set Online
     */
    
    private OnlineStudent readOnlineStudent(Scanner pIn){
        String id = pIn.next();
        String lname = pIn.next();
        String fname = pIn.next();

        OnlineStudent student = new OnlineStudent(id,fname,lname);
        String fee = pIn.next();
        int credits = pIn.nextInt();

        if(fee.equals("T")){
            student.setTechFee(true);
        }else{
            student.setTechFee(false);
        }
        student.setCredits(credits);
        return student;
    }

    /** 6)
     * writeFile()
     */
    private void writeFile(ArrayList<Student> pStudentList) throws FileNotFoundException{
        PrintWriter out = new PrintWriter(new File("p02-tuition.txt"));
        int sum = 0;
        for(Student student : pStudentList){
            out.printf("%-16s"+"%-20s"+"%-15s"+"%8.2f"+"\n",student.getId(), student.getLastName(),student.getFirstName(),student.getTuition());
        }
        out.close();
    }
}
