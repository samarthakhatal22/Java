 class Animal {  // class
    public void eat() {   //1st object of class animal
        System.out.println("This animal eats food.");
    }
}

  class Dog extends Animal {  //subclass
    public void bark() {   //1st object of subclass dog
        System.out.println("The dog barks.");
    }
    
    
    public void eat() {    //2nd obj od subclass dog
        System.out.println("The dog eats kibble.");
    }
   }
public class classes {	//main class to get the output	
    public static void main(String[] args) {
        Dog myDog = new Dog();  //new instance myDog is created to get output or store output 
        System.out.println("--- Dog Object Actions ---");
        myDog.eat(); instance is called from above subclass
        myDog.bark(); 

        Animal genericAnimal = new Animal();
        System.out.println("\n--- Animal Object Actions ---");
        genericAnimal.eat(); 
    }
}
