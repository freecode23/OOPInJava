// REVISION week 1-6 Object and Classes

public class Main {
    public static void main(String[] args) {
        C cObject = new C();
        cObject.someMethod();
        cObject.someOtherMethod();
    } 
}

// **********************2********************************
// instance method can be called by other instance method
public class C {
    // When we declare an object variable(pete) it is initialized(assigned some values to) to null.
    Point pete;
    // When the object is instantiated (create with keyword new) the object variable(pete) will be initialized with a reference to the object.
    pete = new Point(10, 20);

    private int a;  // Instance data members are always private. initialized to a null
    public C() {    // Constructors are always public.
        a = 0;
    }
    
    private void someMethod() {       // Private instance method.
        --a;
    }

    private void someOtherMethod() {  // Private instance method.
        someMethod();
    }

}

public class Point {
    private int x;
    private int y;
    
    public Point() {  // Default constructor caling second constructor
        this(0,0);
    }
    
    public Point(double initX, double initY) {  // A second constructor.
        setX(initX);
        setY(initY);
    } 
    
    // One us of this
    // Every object has an instance variable named this which is automatically declared by the Java
    // compiler. this is a reference to itself.
    // but lets avoid using this by using mX,mY for instance member and pX pY for parameters
    public void move(double x, double y) { 
        this.x = x;
        this.y = y;
    }
}
