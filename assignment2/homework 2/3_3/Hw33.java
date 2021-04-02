class Super {
    double pX;

    public void aMethod(double pX){
        System.out.println(pX + pX);
    }
}
// aMethod is overloaded in Sub class
class Sub extends Super{
    public void aMethod(String pX){
        System.out.println(pX + pX);
    }
}

public class Hw33 {
    public static void main(String[] args){
        Sub sub = new Sub();
        sub.aMethod(2);
    }
}