// REVISION week 1-2 wrapper class

// ************** 1 ******************
// they encapsulate values of primitive data types
import java.lang.Boolean;
import java.lang.Byte;
import java.lang.Char;
import java.lang.Double; /** encapsulate double */
import java.lang.Integer; /** encapsulate int */

public class no3WrapperClass{
    public static void main(String[] args){
        // ************** 1 ******************
        // a) a class that encapsulates (containing) primitive types so we can store in arrayList
        // Integer K = new Integer(200); 
        // use capital letter
        Integer K = valueOf(1); /** K encapsulates 1 */
        Integer I = valueoOf(200); /** I encapsulates 200 */

        // b) compare
        // returns 0 if before == after
        // return 1 if before > after
        // returns -1 if before < after
        I.compareTo(K); /** before.comapreTo(after) */

        // c) autoboxing
        // take the value of x_int directly to X_Int integer value. 
        // ( no need to "WRAPPER CLASS inconvenient (deprecated anyway")
        int x_int = 2;
        Integer X_Int = x_int;
        System.out.println("X_Int: " + X_Int);


    }
}