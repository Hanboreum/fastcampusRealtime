package self.mvc;

public class Person {
    private String name;
    private int tel;
    public Person(){}
    public Person(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tel=" + tel +
                '}';
    }
}
