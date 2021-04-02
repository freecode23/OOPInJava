//**************************************************************************************************
// CLASS: SelectionSorter (SelectionSorter.java)
//
// DESCRIPTION
// Implements the selection sort algorithm.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering
// School of Computing, Informatics, and Decision Systems Engineering
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************
import java.util.ArrayList;

public class SelectionSorter {

    public static final int SORT_ASCENDING  = 0;
    public static final int SORT_DESCENDING = 1;

    /**
     * Searches pList starting at index pStartIndex up to the last element for the maximum element
     * in that range. Returns the index of the maximum element.
     */
    private static int findMaxIndex(ArrayList<Integer> pList, int pStartIndex) {
        int maxIndex = pStartIndex;
        for (int i = pStartIndex + 1; i < pList.size(); ++i) {
            if (pList.get(i).compareTo(pList.get(maxIndex)) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * Searches pList starting at index pStartIndex up to the last element for the minimum element
     * in that range. Returns the index of the minimum element.
     */
    private static int findMinIndex(ArrayList<Integer> pList, int pStartIndex) {
        int minIndex = pStartIndex;
        for (int i = pStartIndex + 1; i < pList.size(); ++i) {
            if (pList.get(i).compareTo(pList.get(minIndex)) < 0) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Sorts pList into ascending (pOrder = SORT_ASCENDING) or descending (pOrder = SORT_DESCENDING)
     * order using the selection sort algorithm.
     */
    public static void selectionSort(ArrayList<Integer> pList, int pOrder) {
        for (int startIndex = 0; startIndex < pList.size() - 1; ++startIndex) {
            if (pOrder == SORT_ASCENDING) {
                int minIndex = findMinIndex(pList, startIndex);
                swap(pList, startIndex, minIndex);
            } else {
                int maxIndex = findMaxIndex(pList, startIndex);
                swap(pList, startIndex, maxIndex);
            }
        }
    }

    /**
     *  Swaps the elements in pList at pIndex1 and pIndex2.
     */
    private static void swap(ArrayList<Integer> pList, int pIndex1, int pIndex2) {
        Integer temp = pList.get(pIndex1);
        pList.set(pIndex1, pList.get(pIndex2));
        pList.set(pIndex2, temp);
    }
}
