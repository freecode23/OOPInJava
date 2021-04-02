//**************************************************************************************************
// CLASS: QueueTest (QueueTest.java)
//
// DESCRIPTION
// Tests the QueueTest class.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http:www.devlang.com
//
// (c) 2014 Kevin R. Burger
//**************************************************************************************************

/**
 * Tests the Queue class.
 */
public class QueueTest {

    public static void main(String[] pArgs) {
        new QueueTest().run();
    }

    private QueueTest() {
    }

    private void passOrFail(int pCase, Queue pQueue , String pExpected) {
        String queueAsString = pQueue.toString();
        if (!queueAsString.equals(pExpected)) {
            System.out.println("failed [" + queueAsString + "]");
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
     * Test Case 1: tests enqueueing one element.
     */
    private void testCase1() {
        System.out.print("Running test case 1... ");
        Queue queue = new Queue ();
        queue.enqueue(1);
        passOrFail(1, queue, "1 ");
    }

    /**
     * Test Case 2: tests enqueueing multiple elements.
     */
    private void testCase2() {
        System.out.print("Running test case 2... ");
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        passOrFail(2, queue, "1 2 3 4 5 6 ");
    }

    /**
     * Test Case 3: tests peeking.
     */
    private void testCase3() {
        System.out.print("Running test case 3... ");
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        Integer x = queue.peek();
        if (x != 1) {
            System.out.println("failed");
        } else {
            System.out.println("passed");
        }
    }

   /**
     * Test Case 4: tests dequeuing one element.
     */
    private void testCase4() {
        System.out.print("Running test case 4... ");
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        Integer x = queue.dequeue();
        if (x != 1) System.out.println("failed");
        passOrFail(4, queue, "2 3 4 5 6 ");
   }

   /**
     * Test Case 5: tests dequeuing multiple elements.
     */
    private void testCase5() {
        System.out.print("Running test case 5... ");
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        Integer x = queue.dequeue();
        if (x != 1) System.out.println("failed");
        x = queue.dequeue();
        if (x != 2) System.out.println("failed");
        x = queue.dequeue();
        if (x != 3) System.out.println("failed");
        x = queue.dequeue();
        if (x != 4) System.out.println("failed");
        x = queue.dequeue();
        if (x != 5) System.out.println("failed");
        x = queue.dequeue();
        if (x != 6) System.out.println("failed");
        passOrFail(5, queue, "");
   }

}