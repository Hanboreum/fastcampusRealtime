public class Person { //접근제한자로 public, default 만 가능
    //필드
    String name ="han";
    int age;

    public Person(){
        //기본생성자
        //오버로딩은 생성자부터 시작됐다.
    }
    //생성자: 객체를 생성할 때 한 번 호출하는 특별한 메소드
    // -무조건 이름이 클래스와 같아야 함
    // -반환타입이 없어
    public Person(String n){//객체를 생성하는 기능
       name = n;
    }
    //오버로딩
    //메소드

    //오버라이딩

    //자바에서 메소드는 클래스 안에서만 선언할 수 있다
    public void eat(){
        System.out.println("eateat");
    }


}
