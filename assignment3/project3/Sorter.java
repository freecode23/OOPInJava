//******************************************************************************************************** 
// CLASS: Sorter (Sorter.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019 
// Project Number: 3
//
// AUTHOR
// Sherly Hartono, sharton1, sharton1@asu.edu
//********************************************************************************************************

import java.util.ArrayList;

/**
* A class which implements the quicksort algorithm. 
* All of the method are static and sort(ArrayList<Student> pList) is the only public method 
* and calls private quickSort(pList, 0, pList.size() - 1) to sort the list. 
*/

public class Sorter {
    public static void sort(ArrayList<Student> pList){
        quickSort(pList, 0, pList.size() - 1);
    }

    private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
        
        String pivot = pList.get(pFromIdx).getLastName();
        int leftIndex = pFromIdx - 1 ;
        int rightIndex = pToIdx + 1 ;
        
        while (true) {
            leftIndex++;
            while ( leftIndex < pToIdx && pList.get(leftIndex).getLastName().compareTo(pivot) < 0)
            leftIndex++;
            
            rightIndex--;
            while (rightIndex > pFromIdx && pList.get(rightIndex).getLastName().compareTo(pivot) > 0)
            rightIndex--;
            
            if (leftIndex < rightIndex)
            swap(pList, leftIndex, rightIndex);
            else
            return rightIndex;
        }
    }
    
    private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx){
        if(pFromIdx < pToIdx){
            int partitionIdx = partition(pList,pFromIdx,pToIdx);
            quickSort(pList, pFromIdx, partitionIdx);
            quickSort(pList, partitionIdx + 1 ,pToIdx);
        }
    }
    private static void swap(ArrayList<Student> pList, int pIdx1, int pIdx2) {
        Student temp = pList.get(pIdx1);
        pList.set(pIdx1, pList.get(pIdx2));
        pList.set(pIdx2,temp);
    }
}










