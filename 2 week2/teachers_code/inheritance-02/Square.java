//**************************************************************************************************
// CLASS: Square (Square.java)
//
// DESCRIPTION
// This is the Square class from "Inheritance : Section 2".
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
 * Represents a Square that can be drawn on a graphical window.
 */
public class Square {
    private int mSideLen;
    private int mX;
    private int mY;

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
        setX(pX);
        setY(pY);
        setSideLen(pSideLen);
    }

    /**
     * Accessor method for the mSideLen data member.
     */ 
    public int getSideLen() {
        return mSideLen;
    }

    /**
     * Accessor method for the mX data member.
     */ 
    public int getX() {
        return mX;
    }

    /**
     * Accessor method for the mY data member.
     */ 
    public int getY() {
        return mY;
    }

    /**
     * Moves this Square to a new location.
     */
    public void move(int pNewX, int pNewY) {
        setX(pNewX);
        setY(pNewY);
    }

    /**
     * Change the size of this Square.
     */
    public void resize(int pNewSideLen) {
        setSideLen(pNewSideLen);
    }

    /**
     * Mutator method for the mSideLen data member.
     */
    public void setSideLen(int pNewSideLen) {
        mSideLen = pNewSideLen;
    }

    /**
     * Mutator method for the mX data member.
     */
    public void setX(int pNewX) {
        mX = pNewX;
    }

    /**
     * Mutator method for the mY data member.
     */
    public void setY(int pNewY) {
        mY = pNewY;
    }
}
