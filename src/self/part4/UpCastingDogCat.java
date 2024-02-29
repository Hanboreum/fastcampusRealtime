package self.part4;

import self.model.Animal;
import self.model.Cat;
import self.model.Dog;

public class UpCastingDogCat {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        //형변환
        Dog d = (Dog)ani; //upcasting ani -> Dog
        d.bark();

        ani = new Cat();
        ani.eat();
        //위처럼 쓰면 자식만 가지고 있는 메소드를 못쓴다. 형변환을 해 사용하자
        ((Cat)ani).grrr(); //upcasting 형변환

    }
}
