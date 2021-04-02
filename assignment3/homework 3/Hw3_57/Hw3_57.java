// CLASS:  Hw3_57

// AUTHOR: Sherly Hartono, sharton1, sharton1@asu.edu

import java.util.ArrayList;
import java.util.Arrays;

public class Hw3_57 { 
  
    // Function to perform Ternary Search 
    static int ternarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh ) { 
        if (pHigh >= pLow) { 
  
            // initialize 2 middle index
            int oneThird = pLow + (pHigh - pLow) / 3; 
            int twoThird = pHigh - (pHigh - pLow) / 3; 
  
            // if key is present at any mid 
            if (pKey.equals(pList.get(oneThird))) { 
                return oneThird; 
            } 
            if (pKey.equals(pList.get(twoThird))) { 
                return twoThird; 
            } 
  
            if (pKey < pList.get(oneThird)) { 
                // The pKey lies in between pLow and oneThird
                return ternarySearch(pList, pKey, pLow, oneThird-1); 
            } 
            else if (pKey > pList.get(twoThird)) { 
                // The pKey lies in between twoThird and pHigh 
                return ternarySearch(pList, pKey, twoThird + 1, pHigh); 
            } 
            else { 
                // The pKey lies in between oneThird and twoThird 
                return ternarySearch(pList, pKey, oneThird + 1, twoThird - 1); 
            } 
        } 
        // pKey not found 
        return -1; 
    } 
} 