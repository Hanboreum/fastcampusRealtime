package day07;

public class MomandDog {
    public static void main(String[] args) {
        Mom mom = new Mom();
        Dog dog = new Dog();

        mom.introduce();
        dog.introduce();
    }
}
    class Mom{

        public void introduce(){
            System.out.println("서울 삽니다");
        }
    }
    class Dog{
        public void introduce(){
            System.out.println(" 멍멍");
        }
    }

