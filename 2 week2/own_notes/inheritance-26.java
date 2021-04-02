public class Point {
    
    @Override
    public String toString(){
        return "[Point: mX = " + getX() + ", mY = " + getY() + "]\n";
    }

    @Override
    // paramater is an object, because we are inheriting from object
    public boolean equals(Object pObject) {
        // Must typecast pObject to Point.
        Point point = (Point) (pObject);

        // Rule 1: If point is null, return false.
        if (point == null)
            return false;

        // Rule 2: If this and point refer to the same object, return true.
        else if (this == point)
            return true;

        // Rule 3: If the mX and mY instance variables of this Point and point are //
        // equal, return true.
        else if (getX() == point.getX() && getY() == point.getY())
            return true;

        // Rule 4: Otherwise, return false.
        else
            return false;
    }
}