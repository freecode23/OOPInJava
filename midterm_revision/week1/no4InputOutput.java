// REVISION week 1-4 Input Output
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class no4InputOutput{
    public static void main(String[] args){
        // ********************1*************************

        // WRITE
        // 1- Create print writer object to write
        PrintWriter out = new PrintWriter(new File("scores-out.txt"));
        // 2- Write
        out.println("Exam 1  Exam 2  Exam 3  Exam Avg");
        out.println("------  ------  ------  --------");

        // READ
        // 1- Create scanner object to read
        Scanner in = new Scanner(new File("scores-in.txt"));

        // 2- if there is next integer : (do wahtever you want to do with it)
        while (in.hasNext()) {
            int e1 = in.nextInt();
            int e2 = in.nextInt();
            int e3 = in.nextInt();
            double avg = (e1 + e2 + e3) / 3.0;
            out.printf("%6d  %6d  %6d  %8.1f\n", e1, e2, e3, avg);
        }
        // ************* 2 FORMAT SPECIFIERS ******************
        // 1) % 
        // 2) optional: a) - => left justified (optional)
        //              b) , => just means coma for integers e.g. 
        // 3) field width
        // 4) data type: a) d for int
        //               b) s for string
        //               c) f for double
        out.printf("%-16s"+"%-20s"+"%-15s"+"%8.2f"+"\n","132141341", "Hartono","Sherly",7500);
        
         // will print 456,789
        int y = 456789;
        System.out.printf("%-,8d\n", y);

        // Close the input file.
        in.close();

        // Close the output file.
        out.close();   


    }
    // ************* 3 GET USER INPUT ******************
    private getInputFilename(){
        // 1. Create Scanner on input machine
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a file name to read: ");
        
        // 2. Save whatever is read by the scanner
        String filename = user_input.next();
        user_input.close();
    }
}