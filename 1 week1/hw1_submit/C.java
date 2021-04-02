// CLASS: C
// Hw1_65
// Sherly Hartono, SHARTON1, sharton1@asu.edu

public class C{
    // 1) a private int instance variable named mX;
    private int mX;

    // 2) a private int class variable named mY initialized to 0
    private static int mY = 0;

    // 3) a private int class constant named A which is equivalent to 100;
    private static final int A = 100;

    // 4) a public int class constant named B which is equivalent to 200; 
    public static final int B = 200;

    // 5)  public accessor and mutator methods for mX named getX() and setX();
    public int getX(){
        return mX;
    }

    public void setX(int pX){
        mX = pX;
    }

    // 6) public accessor and mutator methods for mY named getY() and setY();
    public int getY(){
        return mY;
    }

    public static void setY(int pY){
        mY = pY;
    }

    // 7) a constructor that has one int input parameter named pX which calls setX() to initialize mX to pX;
    public C(int pX){
        mX = pX;
    }

    // 8) a default constructor that calls C(int) to initialize mX to -1.
    public C(){
        // calls C(-1);
        this(-1);
    }  
}