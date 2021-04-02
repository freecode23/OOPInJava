import java.util.ArrayList; 

public class Main { 

	public static void main(String[] args) {
	    new Main().run();
    } 
    
	public void run() { 
		ArrayList<MakesSound> critters = new ArrayList<>(); 
		critters.add(new Dog()); 
		critters.add(new Cat()); 
		critters.add(new Cricket()); 
		critters.add(new Cat()); 
		critters.add(new Cricket()); 
	
        // add some Bees
        Bee jimmy = new Bee();
        Bee deli = new Bee();
        critters.add(jimmy); 
        critters.add(deli); 
        
        // add some Frogs
        Frog ben = new Frog();
        Frog nancy = new Frog();
        critters.add(ben); 
        critters.add(nancy); 
		beNoisy(critters); 
	} 

	public void beNoisy(ArrayList<MakesSound> pCritters) { 
		for (MakesSound critter : pCritters) { 
			critter.makeSound(); 
		} 
	} 
} 
