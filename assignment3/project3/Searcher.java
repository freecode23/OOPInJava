//******************************************************************************************************** 
// CLASS: Searcher (Searcher.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Fall 2019 
// Project Number: 3
//
// AUTHOR
// Sherly Hartono, sharton1, sharton1@asu.edu
//********************************************************************************************************


// This class implement one public static method int search(ArrayList<Student> pList, String pKey) 
// which searches the Roster for a student with the specified last name stored in pKey. 
// Since the roster is sorted into ascending order by last name, 
// you shall implement either the iterative or recursive binary search algorithm. 
// The method returns the index of the student in the list or -1 if the student is not found. 
// Template not provided; use the UML class diagram as a guide and the lecture notes.
import java.util.ArrayList;

public class Searcher{
    public static int search(ArrayList<Student> pList, String pKey){
        return recBinarySearch(pList, pKey, 0, pList.size()-1);
    }

    private static int recBinarySearch(ArrayList<Student> pList, String pKey, int pLow, int pHigh){
        // middle index
        int middle = pLow + (pHigh-pLow)/2;

        // base case (if not found)
        if(pLow > pHigh){
            return -1;
        }
        // if found on middle index  
        if(pKey.equals(pList.get(middle).getLastName())){
            return middle;
        // if key is probably on the left
        }else if(pKey.compareTo(pList.get(middle).getLastName()) < 0){

            return recBinarySearch(pList, pKey, pLow, middle-1);
        // if key is probably on the right
        }else{
            return recBinarySearch(pList, pKey, middle+1, pHigh);
        }
    }

}

