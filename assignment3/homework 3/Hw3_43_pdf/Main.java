import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {

        Hw3_43 obj = new Hw3_43();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 10, 16, 24, 32, 48, 96, 120, 240, 360, 800, 1600));
        System.out.println(obj.recBinarySearch(list, 150, 0, list.size() - 1));

    }
}
