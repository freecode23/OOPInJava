class Super {
    public int mPublic;
    protected int mProtected;
    private int mPrivate;
    private int mPrivate2;

    protected int getPrivate(){
        return mPrivate;
    }

    protected void setPrivate(int pNewPrivate){
        mPrivate = pNewPrivate;
    }

    public int getPrivate2(){
        return mPrivate2;
    }
    
    public void setPrivate2(int pNewPrivate2){
        mPrivate2 = pNewPrivate2;
    }
}

class Sub extends Super{
    public Sub(){
        mPublic = 0; // legal public
        mProtected = 0; // legal protected

        setPrivate(0); // legal protected
        int x = getPrivate(); // legal protected
        System.out.println("sub getPrivate(): " + x);
         
        setPrivate2(4); // legal public 
        x = getPrivate2(); // legal public
        System.out.println("sub getPrivate2(): " + x);
    }
}

class C{
    // Composition relationship 
    private Super my_super;
    private Sub sub;

    public C(){

        // accessing SUPER
        my_super = new Super();   

        // 1) variable
        my_super.mPublic = 0; // Legal public
        my_super.mProtected = 2; // Legal protected ????
        // my_super.mPrivate =0; // Illegal private

        // 2) methods
        my_super.setPrivate(3); // Legal protected ????
        System.out.println("my_super.getPrivate(): " + my_super.getPrivate()); // Legal protected
        my_super.getPrivate(); // Legal public 
        my_super.setPrivate(0); // Legal public
        

        // accessing SUB 
        sub = new Sub();

        // variables
        sub.mPublic = 0; // Legal
        sub.mProtected = 12; // Legal ????
        System.out.println("sub.mProtected: " + sub.mProtected);
        // sub.mPrivate = 0; // illegal  

        // methods
        int y = sub.getPrivate(); // Legal protected ????
        sub.setPrivate(0); // Legal protected ?????
        int x = sub.getPrivate2(); // Legal public
        sub.setPrivate2(5); // Legal public
    }
}

public class Test{
    public static void main(String[] args){
        C c1 = new C(); 
    }
}