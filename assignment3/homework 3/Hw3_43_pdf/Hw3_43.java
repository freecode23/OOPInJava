// CLASS:  Hw3_43

// AUTHOR: Sherly Hartono, sharton1, sharton1@asu.edu
import java.util.ArrayList;

public class Hw3_43{ 
    public Hw3_43(){ 
    }

    public int recBinarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh){
        // middle index
        int middle = pLow + (pHigh-pLow)/2;

        // base case (if not found)
        if(pLow > pHigh){
            return -1;
        }
        // if found on middle index  
        if(pKey.equals(pList.get(middle))){
            return middle;
        // if key is probably on the left
        }else if(pKey < pList.get(middle)){
            return recBinarySearch(pList, pKey, pLow, middle-1);
        // if key is probably on the right
        }else{
            return recBinarySearch(pList, pKey, middle+1, pHigh);
        }
    }
}