package inheritance.animals;

public class Dog extends Animal{

    public String breed;
    public String color;

    @Override
    public void sayHello(){
        System.out.println("Woof Woof");
    }

}
