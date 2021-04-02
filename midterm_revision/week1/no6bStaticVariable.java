// REVISION week 1-6b Static variable
public class Static {
    static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();
        obj1.someMethod(); obj1.someMethod(); obj1.someMethod();
        obj2.someMethod(); obj2.someMethod();
        obj3.someMethod();
        System.out.println(obj1.getCounter());
    }
    private static int mCounter = 0;

    public int getCounter() {
        // class so don't need to use this.mCounter
        return mCounter;
    }

    public void someMethod() {
      ++mCounter;
  } 
}