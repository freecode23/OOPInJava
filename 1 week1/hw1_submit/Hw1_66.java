// CLASS: Hw1_66
// Sherly Hartono, SHARTON1, sharton1@asu.edu


public class Hw1_66{

    public static void main(String[] args){
        // 6.6 Write a statement which instantiates a C object named cObj1 
        // by calling the default constructor.
        C cObj1 = new C();

        // 6.7 instantiates another C object named cObj2 by calling the second constructor 
        // to initialize the mX instance variable to 10    
        C cObj2 = new C(10);
        int a7 = cObj1.getY();
        System.out.println(a7);
    }
}   


// (a) int a1 = C.mX; 
// (b) int a2 = C.mY;
// (c) int a3 = C.A;
// (d) int a4 = C.B;
// (e) cObj1.C(20);


// ANSWERS TO Qns. 6.8 b,c,f,h,k,m (are also in pdf)
// (a) int a1 = C.mX; 
// illegal
// mX is a private class variable. Since it has the keyword "private", it can only be accessed from the class C. 
// we are now in class Hw1_66, therefore we cannot retrieve the value of mY.

// (b) int a2 = C.mY;
// illegal
// ERROR MESSAGE: mY has private access in  C.
// mY is a private class variable

// (c) int a3 =C.A;
// illegal 
// ERROR MESSAGE: A has private access in C.
// A is a private class constant

// (d) int a4 = C.B;
// illegal
// B is private

// (e) cObj1.C(20);
// illegal.
// C() is a constructor method. it's not meant to be called on an object.
// constructor methods are called only when a new instance of an object is created
// but cObj1 is already created

// (f) int a5 = cObj1.getX()
// legal
// WHEN STATEMENT IS EXECUTED:
// 1) a variable called a5 that will store an int is declared.
// 2) getX() method is called on the object cObj1 which will return the mX value of this object. The value is -1.
//    This is because cObj1 is instantiated using the default constrauctor that sets the mX value to -1.
// 3) this value is stored in the variable a5

// (h) cObj2.setX(cObj1.getX())
// legal
// WHEN STATEMENT IS EXECUTED:
// 1) getX() method is called on the object cObj1 which will return the mX value of this object. The value is -1.
// 2) This value is passed on as an argument to the method setX();
// 3) cObj2.setX(-1); will be executed
// 4) setX(-1) method is called on cObj2.
// 5) the instance variable mX of cObj2 will be assigned the value -1    

// (k) int a7 = cObj1.getY()        
// legal
// WHEN STATEMENT IS EXECUTED:
// 1) a variable called a7 that will store an int is declared.
// 2) getY() is an instance method. It is called on the object cObj1 which will return mY value. mY is a class variable with the value 0
// 3) this value is stored in the variable "a"

// (m) int a8 = C.getY()
// illegal
// getY() is an instance method. It should be called on an object like cObj1. and not the class C 