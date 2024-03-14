package self.part4;

import self.model.Cat;

public class PersonTest {
    public static void main(String[] args) {

    Salary sal = new Salary("salname",33,3344);
    Student std = new Student("Stdname",22,1122);
        System.out.println(sal);
        System.out.println(std);

    Person p = new Salary("44name",44,44455);
     p.Zzz(); // 이게 다형성
    p = new Student();
    p.Zzz();// 다형성. 하나의 메세지로 두개 생성


    }
}
