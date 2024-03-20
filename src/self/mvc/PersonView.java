package self.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonView {
    public static void main(String[] args) {
        Person person1 = new Person("1_name",0101000);
        Person person2 = new Person("2_name",0102000);

        PersonController controller = new PersonController();
        Person addPerson1 = controller.joinPerson(person1);
        System.out.println(addPerson1.getName() +"님 등록");
        Person addPerson2 = controller.joinPerson(person2);

        List<Person> allPeople = controller.viewAll();
        for( Person p : allPeople){
            System.out.println("모든 회원"+p.toString());
        }
        Person onePerson = controller.viewOne(0);
        System.out.println("개별조회" + onePerson);
    }
}

class PersonController{
    //생성, 삭제, 전체조회, 개별조회
    PersonLogic logic = new PersonLogic();

    public Person joinPerson(Person person){
        Person joinPerson = logic.addPerson(person);
        return joinPerson;
    }

    public List<Person> viewAll(){
        List<Person> allPeople = logic.findAll();
        return allPeople;
    }
    public Person viewOne(int id){
        Person onePerson = logic.findOne(id);
        return onePerson;
    }
}

class PersonLogic{
    Map<Integer,Person> db = new HashMap<>();
    int id = 0;
    public Person addPerson(Person person){
        db.put(id,person);
        return db.get(id ++ );
    }
    public List<Person> findAll(){
        return new ArrayList<>(db.values());
    }
    public Person findOne(int id){
       return db.get(id);

    }

}

