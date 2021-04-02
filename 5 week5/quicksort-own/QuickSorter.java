// import java.util.ArrayList;

// // https://codereview.stackexchange.com/questions/4022/java-implementation-of-quick-sort

// public class QuickSorter {
//     public static void sort(ArrayList<String> pList){
//         quickSort(pList, 0, pList.size() - 1);
//     }

//     private static int partition(ArrayList<String> pList, int pFromIdx, int pToIdx) {
        
//         String pivot = pList.get(pFromIdx);
//         int leftIndex = pFromIdx - 1 ;
//         int rightIndex = pToIdx + 1 ;
        
//         while (true) {
//             leftIndex++;
//             rightIndex--;

//             while ( leftIndex < pToIdx && pList.get(leftIndex).compareTo(pivot) < 0)
//             leftIndex++;
            
//             while (rightIndex > pFromIdx && pList.get(rightIndex).compareTo(pivot) > 0)
//             rightIndex--;
            
//             if (leftIndex < rightIndex)
//             swap(pList, leftIndex, rightIndex);
//             else
//             return rightIndex;
//         }
//     }
    
//     private static void quickSort(ArrayList<String> pList, int pFromIdx, int pToIdx){
//         if(pFromIdx < pToIdx){
//             int partitionIdx = partition(pList,pFromIdx,pToIdx);
//             quickSort(pList, pFromIdx, partitionIdx);
//             quickSort(pList, partitionIdx + 1 ,pToIdx);
//         }
//     }
//     private static void swap(ArrayList<String> pList, int pIdx1, int pIdx2) {
//         String temp = pList.get(pIdx1);
//         pList.set(pIdx1, pList.get(pIdx2));
//         pList.set(pIdx2,temp);
//     }
// }
import java.util.ArrayList;

// https://codereview.stackexchange.com/questions/4022/java-implementation-of-quick-sort

public class QuickSorter {
    public static void sort(ArrayList<Integer> pList){
        quickSort(pList, 0, pList.size() - 1);
    }

    private static int partition(ArrayList<Integer> pList, int pFromIdx, int pToIdx) {
        
        Integer pivot = pList.get(pFromIdx);
        int leftIndex = pFromIdx - 1 ;
        int rightIndex = pToIdx + 1 ;
        
        while (true) {
            leftIndex++;
            rightIndex--;

            while ( leftIndex < pToIdx && pList.get(leftIndex).compareTo(pivot) < 0)
            leftIndex++;
            
            while (rightIndex > pFromIdx && pList.get(rightIndex).compareTo(pivot) > 0)
            rightIndex--;
            
            if (leftIndex < rightIndex)
            swap(pList, leftIndex, rightIndex);
            else
            return rightIndex;
        }
    }
    
    private static void quickSort(ArrayList<Integer> pList, int pFromIdx, int pToIdx){
        if(pFromIdx < pToIdx){
            int partitionIdx = partition(pList,pFromIdx,pToIdx);
            quickSort(pList, pFromIdx, partitionIdx);
            quickSort(pList, partitionIdx + 1 ,pToIdx);
        }
    }
    private static void swap(ArrayList<Integer> pList, int pIdx1, int pIdx2) {
        Integer temp = pList.get(pIdx1);
        pList.set(pIdx1, pList.get(pIdx2));
        pList.set(pIdx2,temp);
    }
}
