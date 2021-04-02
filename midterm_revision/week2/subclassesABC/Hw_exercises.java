public class Hw_exercises {
    public static void main(String[]args){
        C1 aC1 = new C1();
        aC1.c1Method1();

        // can access public variables by using object (not directly unlike subclasses)
        aC1.x1 = 1;

        // illegal
        // System.out.println("public variable x1: " + x1);
        System.out.println("public variable x1: " + aC1.x1);

        aC1.x2 = 1;
        System.out.println("protected variable x2: " + aC1.x2+ "\n");

        C2 aC2 = new C2();
        aC2.c2Method1();
 

        C3 aC3 = new C3();
        aC3.c3Method1();


    }
}



