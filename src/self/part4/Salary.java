package self.part4;

public class Salary extends Person{

    public void pay(){
        System.out.println(" 급여를 받습니다.");
    }//부모는 없는 메서드, 형변환 downcasting을 해야함

    public Salary(){
        super();
    }

    public Salary(String name, int age, int tel) {
       super(name, age, tel);

    }
    public void Zzz(){
        System.out.println("회사원은 6시간을 잔다. ");
    }

}
