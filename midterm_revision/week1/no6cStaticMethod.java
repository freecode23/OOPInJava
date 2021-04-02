class C {
    public void instanceMethod() {

    }
    public void anotherInstanceMethod(D d){
        instanceMethod(); // Calls D instanceMethod on object this of its own class C
        d.instanceMethod(); // Calls C instanceMethod() on object of subclass D

        staticMethod();  // Calls C staticMethod() on no object

        D.classMethod(); // Calls D classMethod() on subclass D
        d.classMethod();  // Calls D classMethod() on object d (this is unusual)
    }

    public static void staticMethod() {
        instanceMethod(); // Illegal: a class method may not call an instance method
    }
 }

class D extends C {
    // Calls C.staticMethod() on no object
    public static void classMethod() {
        staticMethod();
    }

    // Calls C.staticMethod() on no object
    public void instanceMethod() {
        staticMethod();
    }
 }