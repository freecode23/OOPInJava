//**************************************************************************************************
// CLASS: MergeSorterTest (MergeSorterTest.java)
//
// DESCRIPTION
// Tests the insertion sort algorithm.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MergeSorterTest {

    // private static final String mTestFile = "input.txt";

    public static void main(String[] pArgs) {
        ArrayList<Integer> list = new ArrayList<>();
        // 5 3 1 6 2 4
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(4);
        
        MergeSorter.mergeSort(list);

    }
}