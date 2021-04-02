// 16
class Main {
    public static void main(String[] args) {
        Square sub1 = new Square(3,9,2); // an instance of class B

        // dont need to instantiate shape or rectangle
        System.out.println("Length of square: " + sub1.getSideLen());

        System.out.println("X coordinate: " + sub1.getX());
        // => 0
        System.out.println("Y coordinate: " + sub1.getY());
        // => 1
    }
}

// just put public abstract class Shape if you want to make it abstract. rest is the same
class Shape {
    private int mX;
    private int mY;

    public Shape() {
        this(0, 0);
    }

    public Shape(int pX, int pY) {
        setX(pX);
        setY(pY);
    }

    public int getX() {
        return mX;
    }

    public int getY() {
        return mY;
    }

    public void move(int pNewX, int pNewY) {
        setX(pNewX);
        setY(pNewY);
    }

    public void setX(int pNewX) {
        mX = pNewX;
    }

    public void setY(int pNewY) {
        mY = pNewY;
    }
}

class Rectangle extends Shape{
    private int mHeight;
    private int mWidth;

    public Rectangle() {
        this(0,0,0,0);
    }

    public Rectangle(int pX, int pY,int pWidth, int pHeight) {
        // calling Shape(int pX, int pY)
        super(pX,pY);

        setWidth(pWidth);
        setHeight(pHeight);        
    }

    // overriding abstract method

    // public void draw(){
        // code to draw rectangle here
    // }

    public int getHeight() {
        return mHeight;
    }

    public int getWidth() {
        return mWidth;
    }

    public void resize(int pNewWidth, int pNewHeight) {
        setWidth(pNewWidth);
        setHeight(pNewHeight);
    }

    public void setHeight(int pNewHeight) {
        mHeight = pNewHeight;
    }

    public void setWidth(int pNewWidth) {
        mWidth = pNewWidth;
    }
}


class Square extends Rectangle {

    public Square() {
        this(0,0,0);
    }

    public Square(int pX, int pY, int pSideLen) {
        // calling Rectangle's constructor method
        // Rectangle(int pX, int pY,int pWidth, int pHeight)
        super(pX,pY,pSideLen,pSideLen);
    }

    public int getSideLen() {
        return getWidth();
    }

    public void resize(int pNewSideLen) {
        // calling Rectangle's method resize
        // need to give the actual number of argument inside
        // can be with or without super because its overload
        resize(pNewSideLen, pNewSideLen);
    }

    public void setSideLen(int pNewSideLen) {
        // calling Rectangle's method - not overload nor override
        setWidth(pNewSideLen);
        setHeight(pNewSideLen);
    }
}
