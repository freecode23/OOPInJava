class Sandwich {

}

class Sub extends Sandwich{
    
}

class Main {
    public static void main(String[] args){
        Sandwich x = new Sandwich();
        Sub y = new Sub();

        // 3.2 (a)
        // legal
        // Sub y can become (assigned to) Sandwich x, becos sub is a sandwich
        // Sandwich = Sub
        // x = y;

        // 3.2 (b)
        // illegal 
        // Sandwich x cannot become (assigned to) Sub y, because sandwich is not a sub.
        // Sub = Sandwich XX
        // y = x;

        // 3.2 (c)
        // illegal 
        // 1. variable y is already defined
        // 2. Sandwich x cannot become (assigned to) Sub y, because sandwich is not a sub.
        // Sub = Sandwich XX
        // Sub y = new Sandwich();

        // 3.2 (d)
        // illegal
        // 1. variable x is already defined
        // 2. if keyword Sandwich is not used its legal
        x = new Sub();

        System.out.println(x);
        System.out.println(y);
    }
}