// CLASS: Hw1_35
// Sherly Hartono, SHARTON1, sharton1@asu.edu

import java.util.ArrayList;

public class Hw1_35{
    // default constructor
    public Hw1_35(){
    }

    ArrayList<Integer> arrayListCreate(int pLen, int pInitValue){
        ArrayList<Integer> arr_list= new ArrayList<>();

        while(pLen-1 >= 0 ){
            arr_list.add(pInitValue);  
            pLen--;
        }
        return arr_list;
    }
}
