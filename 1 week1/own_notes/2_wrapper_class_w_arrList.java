import java.util.ArrayList;

class WrapperArrList{
    public static void main(String[] args){

        ArrayList<String> names= new ArrayList<>();

        names.add("Emily");
        names.add("Cindy");
        names.add("Bob");

        System.out.println(names.size());

        // 1) set method return the value that was replaced:
        String who_is = names.set(1, "Joe");
        System.out.println(who_is + " has been replaced");

        // 2) int will give syntax error because its primitive data types
        // error unexpected type:
        // required: reference
        // found: int

        // ArrayList<int> my_num = new ArrayList<>();

        // 3) The correct way to add integer to ArrayList
        ArrayList<Integer> my_Int_ArrList = new ArrayList<>();
        my_Int_ArrList.add(1);
        
        // can assign it to primitive int
        int x = my_Int_ArrList.get(0);
        System.out.println("x is: " + x);
        
    }
}
