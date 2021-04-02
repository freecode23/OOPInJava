import java.util.ArrayList;
import java.lang.*;

public class QuickSorterNum {
    public static int countquick = 1;
    public static void sort(ArrayList<Integer> pList){
        quickSort(pList, 0, pList.size() - 1);
    }

    // actual sorting and comparing
    private static int partition(ArrayList<Integer> pList, int pFromIdx, int pToIdx) {

        Integer pivot = pList.get(pFromIdx);
        int leftIndex = pFromIdx - 1 ;
        int rightIndex = pToIdx + 1 ;
        int count = 1;
        
        // keep doing this
        while (true) {     
            // move pointer forward
            leftIndex++;
            rightIndex--;

            // if left haven't reached the end and value L is smaller than pivot, keep moving
            while ( leftIndex < pToIdx && pList.get(leftIndex) < pivot){
                leftIndex++;
            }
            
            // if right havent't reached the end and value R is bigger than pivot, keep moving
            while (rightIndex > pFromIdx && pList.get(rightIndex) > pivot){
                rightIndex--;
            }
            
            // come out of the two while loop means, the value on the left is supposed to be on the right and vice versa
            // if its true that this integer is on the left, swap
            System.out.println("While loop pass " + count + " :");
            System.out.println("\t left index ends up at " + leftIndex + " ," + "right index ends up at " + rightIndex);
            
            if (leftIndex < rightIndex){
                System.out.println("\t left index < right index so swap list[" + leftIndex+"]" + " and list[" + rightIndex+ "]");
                swap(pList, leftIndex, rightIndex);
            } else{
                // otherwise return this "middle index" to partition again
                System.out.println("\t while loop terminates because left index = " + leftIndex + " is >= " + "right index =" + rightIndex);
                return rightIndex;
            }
            count ++;
        }
    }
    
    // recursive partition
    private static void quickSort(ArrayList<Integer> pList, int pFromIdx, int pToIdx){
        
        System.out.println("Quick sort count " + countquick + " :");
        if(pFromIdx < pToIdx){
            // partition index is actually like "middle index" where right have crossed left
            int partitionIdx = partition(pList,pFromIdx,pToIdx);
            
            ArrayList<Integer> leftlist = new ArrayList<>();
            for(int i = pFromIdx; i <= partitionIdx; i++){
                leftlist.add(pList.get(i));
            }
            ArrayList<Integer> rightlist = new ArrayList<>();
            for(int i = partitionIdx + 1; i <= pToIdx; i++){
                rightlist.add(pList.get(i));
            }
     
            System.out.print("partition() returns " + partitionIdx + ", so listL = "+ leftlist );
            System.out.println(" and listR = "+ rightlist +"\n\n");
            
            // partition left , as if splitting, but not actually making new List. (no copy Array)
            quickSort(pList, pFromIdx, partitionIdx);

            // partition right
            quickSort(pList, partitionIdx + 1 ,pToIdx);
        }
        countquick++;
    }
    private static void swap(ArrayList<Integer> pList, int pIdx1, int pIdx2) {
        Integer temp = pList.get(pIdx1);
        pList.set(pIdx1, pList.get(pIdx2));
        pList.set(pIdx2,temp);
    }
}