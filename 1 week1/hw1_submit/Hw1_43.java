// CLASS: Hw1_43
// Sherly Hartono, SHARTON1, sharton1@asu.edu

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Hw1_43 {

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


        // Initialize input and output file here so it will be in scope in finally clause
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
            
        } finally {
            if(my_print_writer != null){
                my_print_writer.close();
            }                
            if(input_file != null){
                input_file.close();             
            }           
        }      
    }
}

