class Test{
    int instance_var = 0;
    
    // instance method
     int get(){
        return instance_var;              
    }

    // static method
    static int add() { 
        return 2;
    }

    //  CALLING FROM : INSTANCE METHOD
    void instanceMethod(){
        // calling static method 
        // no object is OK
        add();

        // calling instance method
        // no object is OK
        get();

        System.out.println("instance method! \nadd is:" + add() + " get is: " + get());
    }


    // CALLING FROM: STATIC METHOD  
    static void statMethod(){
        // calling static method
        // no object is OK
        add();

        // calling instance method
        // need the object
        // otherwise it says : non-static method get() cannot be referenced from a static context
        Test my_test = new Test();
        int get = my_test.get();

        System.out.println("Static method! \nadd is:" + add() + " get is: " + get);

    }
}

class Main{
    public static void main(String[] args){
        Test test1 = new Test();
        test1.instanceMethod();
        test1.statMethod();
        
    }
}