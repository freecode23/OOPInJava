import java.util.ArrayList;

public class Hw4_35{

    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(6);
        QuickSorterNum.sort(list);
        System.out.println(list);
    }

}


