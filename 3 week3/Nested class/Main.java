public class Main{
    public static void main(String[] args){
        // create static nested class
        // can directly create
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

        // create inner class
        // create Outer object first
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass(5);
    }
}