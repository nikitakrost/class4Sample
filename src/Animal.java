// abstract class allows us to create methods without implementation
public abstract class Animal implements IAnimal {

    // we are setting the states for the animal:
    public String Type;
    public String Color;
    public String Kind;

    // abstract classes dont need a constructor. because it cant be instaniated into an object

    public Animal(String kind, String color, String type){
        this.Color = color;
        this.Kind = kind;
        this.Type = type;

    }
    // the abtract method is:
    public abstract void makeSound();
    // we dont implement it but we are just assigning it.

}
