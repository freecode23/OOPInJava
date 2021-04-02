class OuterClass {
    private int mX;
    private InnerClass mInner;  // an instance of the inner class

    static class StaticNestedClass {
        // ...
    }

    class InnerClass {
        int mY;

        public InnerClass(int pY){
            mY = pY;
            System.out.println("hello");
        }
    }
    
}
