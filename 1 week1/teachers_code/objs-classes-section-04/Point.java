//**************************************************************************************************
// CLASS: Point (Point.java)
//
// DESCRIPTION
// This is the Point class from "Objects and Classes: Section 4".
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************

public class Point {
    public double mX;
    public double mY;

    // Constructor.
    public Point(double pX, double pY) {
        setX(pX);
        setY(pY);
    }

    // Accessor method for mX.
    public double getX() {
        return mX;
    }

    // Accessor method for mY.
    public double getY() {
        return mY;
    }

    // Mutator method for mX.
    public void setX(double pX) {
        mX = pX;
    }

    // Mutator method for mY.
    public void setY(double pY) {
        mY = pY;
    }
}
