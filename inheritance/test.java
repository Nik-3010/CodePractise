package inheritance;

import inheritance.animals.Animal;
import inheritance.animals.Dog;

public class test {
    public static void main(String[] args){

        Animal a = new Animal();
        Animal d1 = new Dog();
        Dog d2 = new Dog();

        d1.sayHello();

    }
}
