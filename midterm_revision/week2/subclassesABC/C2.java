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