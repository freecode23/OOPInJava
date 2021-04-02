// class Human{
//     //Overridden method
//     public void eat()
//     {
//        System.out.println("Human is eating");
//     }
//  }
//  class Boy extends Human{
//     //Overriding method
//     public void eat(){
//        System.out.println("Boy is eating");
//     }
//     public static void main( String args[]) {
//        Boy obj = new Boy();
//        //This will call the child class version of eat()
//        obj.eat();
//     }
//  }

class Practice{
    public static void main(String args[]){

        Bar Treehouse[] = new Bar[2];

        // Baz becomes (assigned to ) Bar
        Treehouse[0] = new Baz();
        Treehouse[0].doBar(3); //this one works
        // Treehouse[0].doBar(3,4);  // why this one doesn't work?
        // Treehouse[0] is a Bar not a Baz.
    }
}

class Bar {
    public void doBar(int x) {
        System.out.println("this is dobar"+ x);
    }
}

class Baz extends Bar {
    public void doBar(int x, double y) {
        System.out.println("x and y"+ x +" "+y);
    }
}