// CLASS:  Hw3_32
// AUTHOR: Sherly Hartono, sharton1, sharton1@asu.edu

import java.lang.Math;

public class Hw3_32 { 
    public Hw3_32() { 
    }
    double power(double x, int n) {
        // 1) base case is when n == 0, means: x * x^0 = x
        if(n == 0){
            return 1;
        }else{
            // 2) return : x * x^(n-1)
            return (x * power(x, n-1));
        }
    } 
}


static int factorial(int n){    
    if (n == 0)    
      return 1;    
    else    
      return(n * factorial(n-1));    
}    