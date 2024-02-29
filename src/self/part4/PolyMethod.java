package self.part4;

import self.model.Animal;
import self.model.Cat;
import self.model.Dog;

public class PolyMethod {
    public static void main(String[] args) {
        Animal ani = new Dog();
       display(ani);

       ani = new Cat();
       display(ani);
    }
    public static void display(Animal ani){
        ani.eat();
        if( ani instanceof Cat){ //display사용시 cat이면
            ((Cat)ani).grrr();//grr 출력
        }
        if(ani instanceof Dog){ //display사용시 dog이면
            ((Dog)ani).bark();//bark 사용
        }
    }
}
