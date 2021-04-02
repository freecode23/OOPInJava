// CLASS: Hw1_31
// Sherly Hartono, SHARTON1, sharton1@asu.edu

import java.util.ArrayList;

public class Hw1_31{
    // default constructor
    public Hw1_31(){
    }

    ArrayList<Integer> ex3_1(){
        ArrayList<Integer> list = new ArrayList<>();

        int count = 2; 
        while(count != 0){
            for(int i = 0; i< 5; i++){
                list.add(i);
            }
            count --;
        }
        return list;
    }
}
