package self.model;

public class Cat extends Animal{
    public void eat(){ //override 재정의, 부모에게 받은 것을 나에게 맞게
        System.out.println("Cat : eat");
    }
    public void grrr(){
        System.out.println("Cat: grrr");
    }
}
