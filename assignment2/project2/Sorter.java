//**************************************************************************************************
// CLASS: Sorter
//
// DESCRIPTION
// Implements the insertion sort algorithm to sort an ArrayList<> of Students.
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019
// Project Number: 2
//
// AUTHOR
// sherly hartono (sharton1@asu.edu)
//**************************************************************************************************
import java.util.ArrayList;

public class Sorter {

    // Pass one of these constants to insertionSort() to specify an ascending or descending sort.
    public static final int SORT_ASCENDING  = 0;
    public static final int SORT_DESCENDING = 1;

    /**
     * Sorts pList into ascending (pOrder = SORT_ASCENDING) or descending (pOrder =
     * SORT_DESCENDING) order using the insertion sort algorithm.
     */
    public static void insertionSort(ArrayList<Student> pList, int pOrder) {
        for (int i = 1; i < pList.size(); ++i) {
            for (int j = i; keepMoving(pList, j, pOrder); --j) {
                swap(pList, j, j - 1);
            }
        }
    }

    /**
     * Returns true if we need to continue moving the element at pIndex until it reaches its
     * proper location.
     */
    private static boolean keepMoving(ArrayList<Student> pList, int pIndex, int pOrder) {
        if (pIndex < 1) return false;
        Student after = pList.get(pIndex);
        Student before = pList.get(pIndex - 1);
        return (pOrder == SORT_ASCENDING) 
            // if true return this
            ? after.compareTo(before) < 0 
            // if falrse return this
            : after.compareTo(before) > 0;
    }

    /**
     *  Swaps the elements in pList at pIndex1 and pIndex2.
     */
    private static void swap(ArrayList<Student> pList, int pIndex1, int pIndex2) {
        Student temp = pList.get(pIndex1);
        pList.set(pIndex1, pList.get(pIndex2));
        pList.set(pIndex2, temp);
    }

}
