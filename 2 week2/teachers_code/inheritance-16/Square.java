//**************************************************************************************************
// CLASS: Square (Square.java)
//
// DESCRIPTION
// This is the Square class from "Inheritance : Section 16".
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
 * Represents a Square that can be drawn on a graphical window. Square is a subclass of Rectangle
 * and inherits all of the instance variables of Rectangle: mX, mY, mWidth, and mHeight. Square may
 * also call any public or protected method in Rectangle.
 */
public class Square extends Rectangle {
    /**
     * Default ctor. Initializes all instance variables to 0 by calling the second ctor.
     */
    public Square() {
        this(0, 0, 0);
    }

    /**
     * Second ctor.
     */
    public Square(int pX, int pY, int pSideLen) {
        super(pX, pY);
        setSideLen(pSideLen);
    }

    /**
     * Accessor method for the mSideLen data member.
     */ 
    public int getSideLen() {
        return getWidth();
    }

    /**
     * Change the size of this Square.
     */
    public void resize(int pNewSideLen) {
        super.resize(pNewSideLen, pNewSideLen);
    }

    /**
     * Mutator method for the mSideLen data member.
     */
    public void setSideLen(int pNewSideLen) {
        setWidth(pNewSideLen);
        setHeight(pNewSideLen);
    }
}
