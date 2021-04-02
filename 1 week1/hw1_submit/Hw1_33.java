// HW1_33 optional
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;

public class Hw1_33{

    public static void main(String[] args){

        ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(1,2,-3,-5,6,4,-78,34));
        int count = 0;
        for(Integer num : list){
            if( num <0){
                count++;    
            }
        }
        System.out.println(count);
    }
}
