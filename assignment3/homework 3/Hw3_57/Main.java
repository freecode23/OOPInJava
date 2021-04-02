import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String args[]) {
        Hw3_57 obj = new Hw3_57();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 10, 16, 24, 32, 77,13));

        int low = 0; 
        int high = 8;
        Integer key = 5; 
  
        // Search the pKey using ternarySearch 
        int answer = obj.ternarySearch(list, key, low, high); 
  
        // Print the result 
        System.out.println("Index of " + key + " is " + answer); 
  
        // Checking for 50 

        // pKey to be searched in the array 
        key = 50; 
  
        // Search the pKey using ternarySearch 
        answer = obj.ternarySearch(list, key, low, high); 
  
        // Print the result 
        System.out.println("Index of " + key+ " is " + answer); 

    }
}
