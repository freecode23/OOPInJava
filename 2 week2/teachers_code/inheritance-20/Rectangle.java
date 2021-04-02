//**************************************************************************************************
// CLASS: Rectangle (Rectangle.java)
//
// DESCRIPTION
// This is the revised Rectangle class discussed in "Inheritance: Section 20".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************

/**
 * Represents a Rectangle that can be drawn on a graphical window.
 */
public class Rectangle extends Shape {
    private int mHeight;
    private int mWidth;

    /**
     * Default ctor. Initializes all instance variables to 0 by calling the second ctor.
     */
    public Rectangle() {
        this(0, 0, 0, 0);
    }

    /**
     * Second ctor.
     */
    public Rectangle(int pX, int pY, int pWidth, int pHeight) {
        super(pX, pY);
        setWidth(pWidth);
        setHeight(pHeight);        
    }

    /**
     * Accessor method for the mHeight data member.
     */ 
    public int getHeight() {
        return mHeight;
    }

    /**
     * Accessor method for the mWidth data member.
     */ 
    public int getWidth() {
        return mWidth;
    }

    /**
     * Change the size of this Rectangle.
     */
    public void resize(int pNewWidth, int pNewHeight) {
        setWidth(pNewWidth);
        setHeight(pNewHeight);
    }

    /**
     * Mutator method for the mHeight data member.
     */
    public void setHeight(int pNewHeight) {
        mHeight = pNewHeight;
    }

    /**
     * Mutator method for the mWidth data member.
     */
    public void setWidth(int pNewWidth) {
        mWidth = pNewWidth;
    }
}
