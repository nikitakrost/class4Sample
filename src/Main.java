// entry point of our program. EVERY file must have a main in order to run.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Dog myDog = new Dog( "Labrador", "White");
        // Labrador myDog = new Labrador( "Black");
       // Chiwawa myDog = new Chiwawa( "White");

        //using parent class to access child classes
       // Dog myDog = new Labrador("Black");

        //Animal myAnimal = new Labrador ( "Black");
        Animal myAnimal1 = new Labrador ("Black");
        Animal myAnimal2 = new Cat ( "Persion",  "White");
        List<Animal> myList = new ArrayList<>();
        myList.add(myAnimal1);
        myList.add(myAnimal2);

        for (Animal myAnimal : myList) {
            System.out.println("My " + myAnimal.Kind + " is a " + myAnimal.Type + " He is " + myAnimal.Color);
            myAnimal.makeSound();
            }
    }
}

