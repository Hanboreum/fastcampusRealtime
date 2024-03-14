package self.part4;

import self.model.Dog;

public class PersonDowncasting {
    public static void main(String[] args) {

     Person p = new Student("name",34,534534); //1다운 1생성
    Student std = (Student) p;
    ((Student) p).graduation(); //downcasting
        System.out.println(p.toString());

     Person sal = new Salary(); //다운 하려면 각각의 부모 객체가 필요함
         ((Salary)sal).pay();
         sal.Zzz(); //override 재정의
        //overload

    }
}
