class C1 {
    public int x1; // accessible by C1, C2, C3 (current and subclass and subsubclass)
    protected int x2; // accessible by C1,C2,C3 (current and subclass and subsubclass)
    private int x3; // accessible by C1

    public void c1Method1() {
        // all sub class members not accessible even public
        // would return error: cannot find symbol

        // C2 variables
        // System.out.println("c1Method1 y1 is: " + y1); 
        // System.out.println("c1Method1 y2 is: " + y2);

        // C3 variables
        // System.out.println("c1Method1 z1 is: " + z1); 
        // System.out.println("c1Method1 z2 is: " + z2);
    }
    protected void c1Method2() {
    }

    private void c1Method3() {
        
    }
}

class C2 extends C1 {
    public int y1; // accessible by C1, C2 and C3
    protected int y2; // accessible by C2 and C3 (current, subclass and subsubclass)
    private int y3; // accessible by C2 (current)

    public void c2Method1() {
        
        System.out.println("**In sub class**");
        // "super class public and protected members accessible directly no need to instantiate the object"
        
        // C1 variables
        System.out.println("c2Method1 x1 is: " + x1);
        System.out.println("c2Method1 x2 is: " + x2+ "\n");

        // all subclass members not accessible

        // C3 variables
        // System.out.println("c2Method3 z1 is: " + z1);
        // System.out.println("c2Method3 z2 is: " + z2);
        
    }
    protected void c2Method2() {
    }
    private void c2Method3() {

    }
}
class C3 extends C2 {
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

class JJ{
    void someMethod(){
        // cannot find symbol
        // c1Method1();

        // cannot find symbol
        // int x = x1; 
    }
}