import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        Hw3_41 q3_41 = new Hw3_41();

        ArrayList<String> list = new ArrayList<>();
            list.add("the arm");
            list.add("the boat");
            list.add("digg");
            list.add("the picture");
            list.add("the sun");
            list.add("the key");
        // int idx = recLinearSearch(list, "the key", 0, list.size() - 1);
        System.out.println(q3_41.recLinearSearch(list, "the key", 0, list.size() - 1));

    }

}
