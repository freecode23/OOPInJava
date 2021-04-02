import java.util.ArrayList;

public class recursiveBin{
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(13);
        list.add(17);
        list.add(19);
        list.add(23);
        list.add(29);
        list.add(31);
        list.add(37);

        int pKey = 7;

    }
        
    public int recursiveBinarySearch (ArrayList<T> pList, T pKey, int pLow, int pHigh) {
        // Base case. When pLow is greater than pHigh, we essentially have an empty
        // list, and pKey cannot be in an empty list so we return -1 (not found).
        if (pLow > pHigh) {
            return -1;
        }
        int middle = (pLow + pHigh) / 2;
        if (pKey.equals(pList.get(middle))) {
          return middle;
        } else if (pKey < pList.get(middle)) {
          return recursiveBinarySearch(pList, pKey, pLow, middle - 1);
        } else {
          return recursiveBinarySearch(pList, pKey, middle + 1, pHigh);
        }
    }

    // better middle index
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

