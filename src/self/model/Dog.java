package self.model;

public class Dog extends Animal {
    public void eat(){
        System.out.println("Dog : eat");
    } // 오버라이드나에게맞게
    public void bark(){
        System.out.println("Dog: walwal!");
    }
}
