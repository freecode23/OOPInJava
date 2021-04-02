// CLASS:  Hw3_31
// AUTHOR: Sherly Hartono, sharton1, sharton1@asu.edu

public class Hw3_31 { 
    public Hw3_31() { 
    }
    // This is the method you are asked to write for Ex. 3.1. Name it exactly as requested so our testing driver // can call it.
    int sum1toN(int n) {
        // 1) Check for the base case of n = 1 and return 1 when it is detected (the sum of 1 to 1 is 1). // Otherwise, call the method recursively to calculate sum1toN(n - 1).
        if(n == 1){
            return 1;
        // 2) Add n to the return value from sum1toN(n - 1) and return the sum.
        }else{
            return (n + sum1toN(n-1));
        }
    } 
}