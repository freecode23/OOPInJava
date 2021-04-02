// REVISION week 1-3 arrayList
// import for ArrayList
import java.util.ArrayList;
import java.lang.Integer;

public class no3ArrayList{
    public static void main(String[] args){
        // ************** 1 ******************
        // a) intro and rules
        // - arraylist is a generic class meaning: 
        // - it can store object of any class
        // - need to specify the type parameter during declaration
        // - need to import
        // - the type cannot be primitive data types (int, double, char, boolean, etc)
        
        ArrayList<String> names = new ArrayList<String>();
        
        // b) adding elements
        names.add("Emily");

        // c) get size
        System.out.println(names.size());

        // d) access
        System.out.println(names.get(0));
        // (index, replaced value)
        names.set(0, "Carolyn");

        // ************** 2 ******************
        // a) insert elements at index , if there are other elements behind, it will move back 
        names.add(1, "Ann");

        // b) remove element
        String s = names.remove(1);


        // ************** 3 ******************
        // using wrapper class
        // - need to import
        // - for integer => import java.lang.Integer;
        
        // declare arraylist of wrapper objects
        ArrayList<Integer> listOfInt = new ArrayList<>();
    }
}