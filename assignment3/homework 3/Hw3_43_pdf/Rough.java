// CLASS:  Hw3_43

// AUTHOR: Sherly Hartono, sharton1, sharton1@asu.edu
import java.util.ArrayList;
public class Rough{ 
    public Rough(){ 
    }

    public int recBinarySearch(ArrayList<Integer> pList, Integer pKey, int pLow, int pHigh){
        // middle index
        int middle = pLow + (pHigh-pLow)/2;

        // 1) MIDDLE INDEX
        System.out.println("1) middle index: " + middle);
        
        // 2) pLOW , pHigh
        System.out.println("2) pLow: " + pLow + "\n   pHigh: " + pHigh);

        // base case
        // if not found
        if(pLow > pHigh){
            // 3A) if-elseif executed
            System.out.println("3) if-elseif line executed:\n   if(pLow > pHigh)\n");
            System.out.println("4) index returned = -1");
            
            return -1;
        }
        
        // if key is found on middle index return 0
        if(pKey.equals(pList.get(middle))){
            // 3B) if-elseif executed
            System.out.println("3) if-elseif line executed:\n  if(pKey.equals(pList.get(middle)))\n");
            return middle;
        // if key is probably on left index
        }else if(pKey < pList.get(middle)){
            // 3C) if-elseif executed
            System.out.println("3) if-elseif line executed:\n   else if(pKey < pList.get(middle))\n");
            return recBinarySearch(pList, pKey, pLow, middle-1);
            // if key is probably on right index    
        }else{
            // 3D) if-elseif executed
            System.out.println("3) if-elseif line executed:\n   else{return recBinarySearch(pList, pKey, middle+1, pHigh);} \n");
            return recBinarySearch(pList, pKey, middle+1, pHigh);
        }
    }
}