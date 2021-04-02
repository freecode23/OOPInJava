import java.util.ArrayList;
import java.util.Arrays;


public class Hw3_55 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 10, 16, 24, 32, 77,13));
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd= new ArrayList<>();

        split(list,even,odd);
        System.out.println(even);
        System.out.println(odd);
    }

    static void split(ArrayList<Integer> pList, ArrayList<Integer> pEvenList, ArrayList<Integer> pOddList) {
        int counter = 0;
        for (int n : pList) {
            if (n % 2 == 0){
                counter++;
                System.out.println("add even: " + counter);
                pEvenList.add(n);
            }else{ 
                counter++;
                System.out.println("add odd: " + counter);
                pOddList.add(n); 
            }
        }
    }
}

