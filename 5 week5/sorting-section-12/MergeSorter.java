//**************************************************************************************************
// CLASS: MergeSorter (MergeSorter.java)
//
// DESCRIPTION
// This class contains methods that implement the recursive merge sort algorithm.
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

public class MergeSorter {
    private static int count = 0;
    private static int countMerge = 0;

    /**
     * Creates and returns a new ArrayList consisting of the elements from pList at indices
     * pFromIndex (inclusive) to pToIndex (exclusive).
     */
    private static ArrayList<Integer> arrayListCopy(ArrayList<Integer> pList, int pFromIndex,
    int pToIndex) {
        ArrayList<Integer> pCopy = new ArrayList<>();
        for (int i = pFromIndex; i < pToIndex; ++i) {
            pCopy.add(pList.get(i));
        }
        return pCopy;
    }

    /**
     * Copies elements from pSrcList[pSrcIndex..pSrcList.size - 1] to pDstList starting at
     * index pDstIndex.
     */
    private static void copyRest(ArrayList<Integer> pSrcList, int pSrcIndex,
    ArrayList<Integer> pDstList, int pDstIndex) {
        while (pSrcIndex < pSrcList.size()) {
            pDstList.set(pDstIndex, pSrcList.get(pSrcIndex));
            ++pSrcIndex;
            ++pDstIndex;
        }
    }

    /**
     * The primary recursive routine that merge sorts pList.
     */
    public static void mergeSort(ArrayList<Integer> pList) {
        // The base case is reached when the size of pList is 1. The list is sorted
        count +=1;
        System.out.println("===recursive count===: " + count);
        System.out.println("array: " + pList);

        if (pList.size() < 2){
            System.out.println("\n");
            return;
        }

        // Otherwise, split the list into two halves: a left half and a right half. Recursively
        // merge sort each half.                                              
        ArrayList<Integer> listL = arrayListCopy(pList, 0, pList.size() / 2); 
        ArrayList<Integer> listR = arrayListCopy(pList, pList.size() / 2, pList.size()); 
        System.out.println("listL: " + listL + "\t listR: "+ listR +"\n");
        mergeSort(listL);
        mergeSort(listR);

        // On return from the two method calls above, both listL and listR will be sorted.
        // Merge them to form a sorted list.
        merge(listL, listR, pList);
    }

    /**
     * Merges pListL and pListR into pList.
     */
    private static void merge(ArrayList<Integer> pListL, ArrayList<Integer> pListR,
    ArrayList<Integer> pList) {
        countMerge += 1;
        System.out.println("***actual sort count**: " + countMerge);
        System.out.println("listL: " + pListL + "\t listR: "+ pListR );

        int leftIndex = 0, rightIndex = 0, listIndex = 0;
        while (leftIndex < pListL.size() && rightIndex < pListR.size()) {
            if (pListL.get(leftIndex).compareTo(pListR.get(rightIndex)) <= 0) {
                pList.set(listIndex, pListL.get(leftIndex));
                ++leftIndex;
            } else {
                pList.set(listIndex, pListR.get(rightIndex));
                ++rightIndex;
            }
            ++listIndex;
        }
        if (leftIndex < pListL.size()) {
            copyRest(pListL, leftIndex, pList, listIndex);
        } else {
            copyRest(pListR, rightIndex, pList, listIndex);
        }
        System.out.println("merged result: " + pList + "\n");
    }
}
