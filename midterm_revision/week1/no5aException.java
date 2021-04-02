// REVISION week 1-5 Exception using finally 
// close files regardless exist or not so we have to declare the Scanner and PrintWriter file before try and catch clause

// An exception is an object of a class which gets thrown when something bad happens. 
// The InputMismatchException is the one that got thrown when the characters in the input file ("Fred") 
// did not match the expected data type that we were trying to read (int).
// The throws FileNotFoundException clause of ExamAvg.main() told the Java compiler that main() 
// would throw (i.e., rethrow) any exception objects of the java.io.FileNotFoundException class that 
// were thrown while main() was executing. When main() throws an exception—of any type—the 
// Java Virtual Machine (JVM) causes the program to terminate and generates an error message 
// like the one you see above (this is called a stack trace).
// In the real world, no Java program would ever have main() throw a FileNotFoundException. 
// Rather, main() or some other method in the program, is supposed to catch and handle this exception. 
// This is accomplished by writing an exception handler.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exception {

    public static void main (String[] args) {
        new Hw1_43().run();
    }

    public Hw1_43(){
    }

    private void run(){
        String input_filename = getInputFilename();   
        readWriteFile(input_filename);
    }

    private String getInputFilename(){
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a file name to read: ");
        String filename = user_input.next();
        user_input.close();
        return filename;
    }

    private void readWriteFile(String input_filename){
        // create output filename using input filename
        String output_filename = input_filename +".txt";
        
        // prepare to read input file
        int line_count = 0;
        String current_line = "";


        // Initialize input and output file here so it will be in scope in finally clause so we can close it
        Scanner input_file = null;
        PrintWriter my_print_writer = null;
    
        try {    
            // Open the file to read
            input_file = new Scanner(new File(input_filename));

            if (input_file != null){
                // Create the file for writing.
                my_print_writer = new PrintWriter(new FileWriter(new File(output_filename), true));

                // loop through input file
                while(input_file.hasNext()){
                    line_count++;
                    // read input file
                    current_line = input_file.nextLine();
                    // write on output file
                    // my_print_writer.write(line_count + ": " + current_line + "\n");
                    my_print_writer.printf("[%03d] %s\n" ,line_count, current_line);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("=========================================================");
            System.err.println("A FileNotFoundExceptionException was caught!\n");
            System.err.println("Make the correct input file exist\n");
            System.out.println(ex);
            System.err.println("==========================================================");
            
        } catch (IOException ex) {
            System.err.println("=========================================================");
            System.err.println("An IOException was caught!\n");
            System.err.println("Here is what it says:\n");
            System.out.println(ex);
            System.err.println("==========================================================");
            
        // The code in a finally clause is always executed whether an exception occurs or not. The purpose is to
        // ensure that some resource (Scanner object and PrintWriter object) that was acquired by the code in the try clause is released.
        } finally {
            if(my_print_writer != null){
                my_print_writer.close();
            }                
            if(input_file != null){
                input_file.close();             
            }           
        }  
        // 1) next() can throw NoSuchElementException and IllegalStateException, both are unchecked exceptions (they are subclasses of RuntimeException).
        // 2) nextInt() can throw NoSuchElementException, IllegalStateException, InputMismatchException/ all of which are unchecked exceptions.    
    }
}

