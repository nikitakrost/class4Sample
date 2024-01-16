// public class Dog  {
// we are extending the original from above to be able to use the new extended class being ANimal
public class Dog extends Animal {

    //State - the collection of all the properities that represents the object
    //public String Type;
   // public String Color;
    // The properties are type & color

    //Constructor. Inside the brackets we are going to put the parameters When u talk about properties you use upper case and when u do parameters u use lowercase but doesnt matter
    public Dog (String type, String color) {
        super("Dog", color, type);
        // when u use bigger letters for the line above to address ie: type and color, then on the left of the equal sign u also use small c
        //this.Color = color;
        //this.Type = type;

    }

    //behaviour
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
