// CLASS: Hw1_34
// Sherly Hartono, SHARTON1, sharton1@asu.edu

import java.util.ArrayList;

public class Hw1_34{
    // default constructor
    public Hw1_34(){
    }

    Integer arrayListSum(ArrayList<Integer> pList){
        Integer sum = 0;
        for(Integer num : pList){
            sum+= num;       
        }
        return sum;
    }
}
