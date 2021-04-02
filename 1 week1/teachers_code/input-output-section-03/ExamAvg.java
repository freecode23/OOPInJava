//**************************************************************************************************
// CLASS: ExamAvg
//
// DESCRIPTION
// Sample program from "Input/Output: Section 3."
//
// Reads a file named "scores-in.txt" containing three exam scores per student on a line. Calculates
// and displays the average exam score.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class ExamAvg {
    public static void main(String[] args) throws FileNotFoundException {
        // Open "scores-in.txt" for reading.
        Scanner in = new Scanner(new File("scores-in.txt"));

        // Open "scores-out.txt" for writing.
        PrintWriter out = new PrintWriter(new File("scores-out.txt"));

        // Print the column headers.
        out.println("Exam 1  Exam 2  Exam 3  Exam Avg");
        out.println("------  ------  ------  --------");

        // Read the exam scores from "scores-in.txt", calculate the exam average, and
        // print the formatted output to the output file.
        while (in.hasNext()) {
            int e1 = in.nextInt();
            int e2 = in.nextInt();
            int e3 = in.nextInt();
            double avg = (e1 + e2 + e3) / 3.0;
            out.printf("%6d  %6d  %6d  %8.1f\n", e1, e2, e3, avg);
        }

        // Close the input file.
        in.close();

        // Close the output file.
        out.close();
    }
}
