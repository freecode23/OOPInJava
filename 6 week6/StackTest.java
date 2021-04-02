//**************************************************************************************************
// CLASS: StackTest (StackTest.java)
//
// DESCRIPTION
// Tests the Stack class.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************

/**
 * Tests the Stack class.
 */
public class StackTest {

    public static void main(String[] pArgs) {
        new StackTest().run();
    }

    private StackTest() {
    }

    private void passOrFail(int pCase, Stack pStack, String pExpected) {
        String stackAsString = pStack.toString();
        if (!stackAsString.equals(pExpected)) {
            System.out.println("failed [" + stackAsString + "]");
        } else {
            System.out.println("passed");
        }
    }

    private void run() {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
    }

    /**
     * Test Case 1: tests pushing one element.
     */
    private void testCase1() {
        System.out.print("Running test case 1... ");
        Stack stack = new Stack();
        stack.push(1);
        passOrFail(1, stack, "1 ");
    }

    /**
     * Test Case 2: tests pushing multiple elements.
     */
    private void testCase2() {
        System.out.print("Running test case 2... ");
        Stack stack = new Stack();
        stack.push(1);
        
        // prepend
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        // stack.indexzero();
        // index 0 is 6
        passOrFail(2, stack, "6 5 4 3 2 1 ");
    }

    /**
     * Test Case 3: tests peeking.
     */
    private void testCase3() {
        System.out.print("Running test case 3... ");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        Integer x = stack.peek();
        if (x != 6) {
            System.out.println("failed");
        } else {
            System.out.println("passed");
        }
    }

   /**
     * Test Case 4: tests popping one element.
     */
    private void testCase4() {
        System.out.print("Running test case 4... ");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        Integer x = stack.pop();
        if (x != 6) System.out.println("failed");
        passOrFail(4, stack, "5 4 3 2 1 ");
   }

   /**
     * Test Case 5: tests popping multiple elements.
     */
    private void testCase5() {
        System.out.print("Running test case 5... ");
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        Integer x = stack.pop();
        if (x != 6) System.out.println("failed");
        x = stack.pop();
        if (x != 5) System.out.println("failed");
        x = stack.pop();
        if (x != 4) System.out.println("failed");
        x = stack.pop();
        if (x != 3) System.out.println("failed");
        x = stack.pop();
        if (x != 2) System.out.println("failed");
        x = stack.pop();
        if (x != 1) System.out.println("failed");
        passOrFail(5, stack, "");
   }

}