import java.util.Scanner;
import java.io.*;

class outputPractice{

    public static void main(String[] args) throws IOException {
        
        // 1 ========== PrintWriter (less efficient) ============

        // create a java.io.File object (argument: file name)
        File my_file = new File("output.txt");

        // create PrintWriter object (argument: File object)
        // will make if it doesnt exist yet
        PrintWriter out = new PrintWriter(my_file);

        // shortcut
        PrintWriter my_print_writer = new PrintWriter(new File("output.txt"));

        // write 
        my_print_writer.print(20 + " " + 3.14159265);
        my_print_writer.close();

        // 2 ========= BufferedWriter (more efficient) ============

        // create FileWriter object (argument: file name)
        FileWriter my_file_writer = new FileWriter("output.txt");

        // create BufferedWriter object (argument: FileWriter object)
        BufferedWriter my_buffered_writer = new BufferedWriter(my_file_writer);

        // write
        my_buffered_writer.write("Hello, this is buffered writer.\n");
        my_buffered_writer.write("miau.\n");
        my_buffered_writer.close();

    }
}