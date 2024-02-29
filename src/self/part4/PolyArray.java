package self.part4;

import self.model.Animal;
import self.model.Cat;
import self.model.Dog;

import java.sql.Array;

public class PolyArray {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c = new Cat();

        Animal[]ani = new Animal[2];
        ani[0] = c;
        ani[1] =d;
        display(ani);
    }
    public static  void display(Animal ani[]){
        for(int i=0; i<ani.length; i++){
            ani[i].eat();
            if(ani[i] instanceof Cat){
                ((Cat)ani[i]).grrr();
            }
            if(ani[i] instanceof Dog){
                Dog d = (Dog)ani[i];
                d.bark();
            }
        }
    }
}
