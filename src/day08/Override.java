package day08;

public class Override {
    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.cry();
        ((Cat)ani).punch(); //형변환

        Cat realcat = new Cat(); // 아예 다시 만든다
        realcat.punch();

        Cat real = (Cat)ani;
        real.punch();

       // ani = (Cat) ani;
        //ani.punch();  //이건 안된다.
    }
}

class Animal{
    public void cry(){
        System.out.println("cry");
    }
}

class Cat extends Animal{
    public void cry(){
        System.out.println("야옹");
    }
    public void punch(){
        System.out.println("고양이주먹");
    }
}
class dog extends  Animal{
    public void cry(){
        System.out.println("멍멍");
    }
}
