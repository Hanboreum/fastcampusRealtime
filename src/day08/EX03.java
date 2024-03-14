package day08;

public class EX03 {
    public static void main(String[] args) {
        Child child = new Child();
        child.method("string"); //child
        child.method(); //parent
    }
}

class Parent{
    public void method(){
        System.out.println("parent's method");
    }
}

class Child extends Parent{

    public void method(){
        //오버라이딩. 이걸생성하는 순간
        //child.method()는 나의 것 chlid's method가 됨
    }
    public void method(String alphabet){
        System.out.println("child's method");
    }
}
