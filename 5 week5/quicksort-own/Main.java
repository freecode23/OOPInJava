import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    public static void main(String[]args){
        // ArrayList<String> names = new ArrayList<String>(Arrays.asList("Simpson" , "Flintstone", "Jetson", "Explosion" , "Muntz" , "Terwilliger" , "Flanders", "Bouvier" , "Spuckler", "Wiggum", "Skinner"));
        ArrayList<Integer> names = new ArrayList<Integer>(Arrays.asList(3,4,2,9,1,7,5,8,6));
        QuickSorter.sort(names);
        System.out.println(names);
    }
}