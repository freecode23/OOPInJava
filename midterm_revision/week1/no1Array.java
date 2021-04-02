// REVISION week 1 array
public class no1Array{
    public static void main(String[] args){
        // ************** 1 ******************
        // a) array declaration 
        // [length]
        // length can be integer literal  => 6
        //               integer variable => int x = 6
        //               integer constant => final String L = 5
        int[] my_array = new int[6];


        // b) initialize and declaring at the same time
        int[] my_array2 = {10,20,30,40,50};

        // c) change array elements
        // array subscript or index operator => []
        my_array2[0] = 30;

        // d) for loop
        for (int i = 0; i < my_array2.length; ++i) {
            System.out.println(my_array2[i]);
        }
        // e) enhanced for loop
        for (int num : my_array2) {
            System.out.println(num);
        }

        // ************** 2 ******************
        // a) array is a reference type
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };
        a = b; /** a stores reference to {4,5,6} */

        // b) if you want to the contents of a use for loop
        // this a value will not change if we change b
        for (int i = 0; i < b.length; ++i) {
            a[i] = b[i]; 

        }

        // ************** 3 ******************
        // a)
        // 2D array declaration
        int[][] my_array3 = new int[5][4]; /** [row][column] */

        // initialize and declare
        int[][] my_array4 = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };

        // b)
        // iterating 2D array using nested loops
        // i++ and ++i works the same in for loop
        // work differently in an expression
        for (int row = 0; row < my_array4.length; ++row) { /** for each row; number of row = array.length  */
            for (int col = 0; col < my_array4[0].length; ++col) { /** in each column; number of column = row length (array[0].length) */
              System.out.print(my_array4[row][col]);
            }
            System.out.println();
          }
    }

    // ************** 2 ******************
    // c) array is passed as a reference. (the argument is not the actual content)
    // any changes to the array in the method will actually change the contents of the array
    public void decEveryOtherElement(int[] anArray) {
        for (int i = 0; i < anArray.length; i += 2) {
          --anArray[i]; /** this means value of anArray[i]-1  */
        }
    }

    // d) return an array
    public String[] createArray() {
        String[] my_array5 = {"1","b","c","d"};
        return my_array5;
    }


}