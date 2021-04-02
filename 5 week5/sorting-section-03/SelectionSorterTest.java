//**************************************************************************************************
// CLASS: SelectionSorterTest (SelectionSorterTest.java)
//
// DESCRIPTION
// Tests the selection sort algorithm.
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

public class SelectionSorterTest {

    private static final String mTestFile = "input.txt";

    public static void main(String[] pArgs) {
        try {
            new SelectionSorterTest().run();
        } catch (FileNotFoundException pExcept) {
            System.out.println("Failed to open '" + mTestFile + "' for reading.");
        }
    }

    public SelectionSorterTest() {
    }

    private ArrayList<Integer> read(String pFname) throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(new File(pFname));
        while (in.hasNext()) {
            list.add(in.nextInt());
        }
        in.close();
        return list;
    }

    private void run() throws FileNotFoundException {
        ArrayList<Integer> list = read(mTestFile);
        SelectionSorter.selectionSort(list, SelectionSorter.SORT_ASCENDING);
        write("ascending.txt", list);
        SelectionSorter.selectionSort(list, SelectionSorter.SORT_DESCENDING);
        write("descending.txt", list);
    }

    private void write(String pFname, ArrayList<Integer> pList) throws FileNotFoundException {
        PrintWriter out = new PrintWriter(new File(pFname));
        for (Integer n : pList) {
            out.println(n);
        }
        out.close();
    }

}
