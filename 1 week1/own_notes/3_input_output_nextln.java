import java.util.Scanner;
import java.io.*;

class inputPractice{

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("my_text.txt"));
        // 1) print Pebbles Flinstone
        String x = scanner.next();

        // 2) print Pebbles
        // String x = scanner.nextLine();

        //  3) cannot print int, because the first line is not an integer
        //  incompatible types: String cannot be converted to int
        // int x = scanner.nextLine();

        String y = scanner.next();
        String empty = scanner.nextLine();

        System.out.println(x);
        System.out.println(y);

        // return empty string because there is nothing left in the that line other than \n
        // ( Pebbles and Flinstone has been read)
        System.out.println(empty);

        scanner.close();
    }

}