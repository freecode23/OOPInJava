public class Outer {
    // inner class declaration
    private Inner mInner;

    private class Inner {
        int mY;
        public Inner(int pY){
            mY = pY;
        }
    }

    public void aMethod(){
        // local class declaration
        class LocalClass(){   
        }

        LocalClass aLocalClassObject = new LocalClass();
    }
}

