// https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html

public class HelloWorldAnonymousClasses {
  
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    public void sayHello() {
        // ******* local class implements interface **********
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting();

        // They are like local classes except that they do not have a name. Use them if you need to use a local class only once.

        // While local classes are class declarations, anonymous classes are expressions, which means that you define the class in another expression. 
        // The syntax of an anonymous class expression is like the invocation of a constructor, 
        // except that there is a class definition contained in a block of code.


        // ******* Anon class implement interface **************
        // 1. The name of an interface to implement or a class to extend. In this example,
        // the anonymous class is implementing the interface HelloWorld.

        // 2. Parentheses that contain the arguments to a constructor, 
        // just like a normal class instance creation expression.
        // Note: When you implement an interface, there is no constructor,
        // so you use an empty pair of parentheses, as in this example.

        // 3. A body, which is a class declaration body. More specifically,
        // in the body, method declarations are allowed but statements are not.

        HelloWorld frenchGreeting = new HelloWorld() {
            // anon class definition
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };

        
        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp =
            new HelloWorldAnonymousClasses();
        myApp.sayHello();
    }            
}