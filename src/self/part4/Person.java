package self.part4;

public class Person { //접근제한자로 public, default 만 가능
    //필드
   private String name;
    private int age;
    private int tel;

    public void Zzz(){
        System.out.println("사람은 10시간을 자야한다.");
    }
   public Person(){
       //기본 생성자
   }

    public Person(String name, int age, int tel) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        //오버로딩
        //객체변수가 private을 쓸 수 있게
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel=" + tel +
                '}';
    }

}


