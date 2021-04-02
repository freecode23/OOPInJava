
import java.util.ArrayList;


public class Master{
    public static void main(String[] args){
        Hw1_31 hw3_1 = new Hw1_31();
        System.out.println(hw3_1.ex3_1());

        ArrayList<Integer> plist = new ArrayList<>();
        for(int i = 0; i< 5; i++){
            plist.add(i);
        }

        Hw1_34 hw3_4 = new Hw1_34();
        System.out.println(hw3_4.arrayListSum(plist));

        Hw1_35 hw3_5 = new Hw1_35();
        System.out.println(hw3_5.arrayListCreate(4, 2323));
        
    }
}