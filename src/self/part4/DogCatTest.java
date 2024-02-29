package self.part4;

import self.model.Cat;
import self.model.Dog;

public class DogCatTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.eat();
        c.grrr();
        c.eat();
    }
}
