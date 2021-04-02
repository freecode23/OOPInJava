//******************************************************************************
// CLASS: Dog (Dog.java)
//
// DESCRIPTION
// Dog is a subclass of Mammal. Remember that if D is a subclass of C, then a D
// is a specific type of C.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science and Engineering
// Fulton Schools of Engineering
// Arizona State University
// Tempe, AZ 85287-8809
//******************************************************************************

/**
 * Dog is a specific type of Mammal so Dog inherits from Mammal. Mammal and Dog
 * are related as a generalization (or inheritance) relationship. Note that
 * Mammal implements the MakesSound interface, so since Dog is a subclass of
 * Mammal then Dog also implements the MakesSound interface.
 */
public class Dog extends Mammal {

    /**
     * Mammal is an abstract class and does not implement the MakesSound.
     * makeSound() method. However, since Dog is a concrete subclass of Mammal
     * then Dog must implement makeSound (or if it does not, then Dog also
     * becomes an abstract class). The sound Dogs make is "Bark".
     *
     * Note also that Dog is implementing the abstract makeSound() method
     * of Mammal. Therefore, to prevent accidental overloading, we use the
     * @Override annotation.
     */
	@Override
	public void makeSound() { 
		System.out.println("Bark");
	} 
} 
