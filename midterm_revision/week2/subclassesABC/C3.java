public class C3 extends C2 {
    public int z1;
    protected int z2; 
    private int z3;
    public void c3Method1() {
        System.out.println("**In subsub class**");
        System.out.println("super class public protected members accessible");
        // C1 variables
        System.out.println("c3Method1 x1 is: " + x1);
        System.out.println("c3Method1 x2 is: " + x2);

        // C2 variables
        System.out.println("c3Method1 x2 is: " + y1);
        System.out.println("c3Method1 y2 is: " + y2+ "\n");
    }
    protected void c3Method2() {
        // System.out.println("c3Method2 x2 is: " + x2);
    }
    private int c3Method3() {
        return x2;
    }
}