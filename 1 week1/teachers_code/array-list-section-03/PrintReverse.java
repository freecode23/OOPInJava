//**************************************************************************************************
// CLASS: PrintReverse
//
// DESCRIPTION
// Sample program from "The ArrayList Class: Section 3."
//
// Reads a file named "ints-in.txt" containing integers into an ArrayList object. Writes the
// integers to an output file named "ints-out.txt" in reverse order.
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
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reads a file named "ints-in.txt" containing integers and writes the integers to "ints-out.txt"
 * in reverse order.
 */
class PrintReverse {
    public static void main(String[] args) throws FileNotFoundException {

        // Create an ArrayList of integers.
        ArrayList<Integer> list = new ArrayList<>();

        // Open "ints-in.txt" for reading.
        Scanner scanner = new Scanner(new File("ints-in.txt"));

        // Read the integers from "ints-in.txt" placing them in the ArrayList.
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        // Close the input file.
        scanner.close();

        // Open "ints-out.txt" for writing.
        PrintWriter out = new PrintWriter(new File("ints-out.txt"));

        // Walk through the ArrayList in reverse order, printing each element to the output file.
        for (int i = list.size() - 1; i >= 0; --i) {
            out.println(list.get(i));
        }

        // Close the output file.
        out.close();
    }
}
