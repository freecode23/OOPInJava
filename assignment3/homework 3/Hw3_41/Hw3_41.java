// CLASS:  Hw3_41

// AUTHOR: Sherly Hartono, sharton1, sharton1@asu.edu
import java.util.ArrayList;
public class Hw3_41{ 
    public Hw3_41(){ 
    }

    public int recLinearSearch(ArrayList<String> pList, String pKey, int pBeginIdx, int pEndIdx){
        // base case
        if(pBeginIdx > pEndIdx){
            // not found 
            return -1;
        }else{
            // if key is found on beginIndex return 0
            if(pKey.equals(pList.get(pBeginIdx))){
                return pBeginIdx;
            }else{
                // keep searching on the next index
                return recLinearSearch(pList, pKey, pBeginIdx + 1, pEndIdx);
            }
        }
    }
}