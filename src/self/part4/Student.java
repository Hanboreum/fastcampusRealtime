package self.part4;

public class Student extends Person{

   public void graduation(){
        System.out.println("졸업 유무와 연도 정보입니다.");
    }//부모는 없는 메서드, 형변환 downcasting을 해야함

    public  Student(){
        super();}

    //overload Student(different parameter)
    public Student(String name, int age, int tel) {
        super(name, age, tel);
    }

    //override Zzz()
    public void Zzz(){
        System.out.println("학생은 6시간을 잔다.");
    }

}
