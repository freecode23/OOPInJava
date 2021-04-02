// CLASS:  Hw3_61
// AUTHOR: Sherly Hartono, sharton1, sharton1@asu.edu

import java.lang.Comparable;

public class Point implements Comparable<Point> {
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

    private double calcDistanceToOrigin() {
      return Math.sqrt(mX * mX + mY * mY);
    }
    
    public int compareTo(Point pCoord) {
        double thisDist = calcDistanceToOrigin();
        double coordDist = pCoord.calcDistanceToOrigin();
        if (thisDist < coordDist) {
            return -1;
        } else if (thisDist > coordDist) {
            return 1;
        } else {
            return 0; 
        }
    }     
}
