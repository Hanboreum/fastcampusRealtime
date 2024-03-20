package self.personMVC;

import self.mvc.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonPrint {
    public static void main(String[] args) {
      //등록 c - signupPerson , l - add
        Controller controller = new Controller();
        Person person1 = new Person("Kim",21,170);
        Person person2 = new Person("Lee",33,160);
        Person person3 = new Person("Park",44,190);
        Person result1 = controller.signUpPerson(person1);
        Person result2 = controller.signUpPerson(person2);
        Person result3 = controller.signUpPerson(person3);
        System.out.println(result3 + "등록됨.");
        System.out.println(result1 + "등록됨.");
        System.out.println(result2 + "등록됨.");


        //전체조회 c - viewAllPeople, L - showAllPeople
        List<Person> allPeople = controller.viewAllPeople();
        for(Person p: allPeople){
            System.out.println("모든 사람: "+ p.getName());
        }

        //개별조회 c - viewOne , l - showOne
        Person person_1 = controller.viewOnePerson(0);
        System.out.println(person_1);
        Person person_2 = controller.viewOnePerson(1);
        System.out.println(person_2);

    }
}

class Controller{
    Logic logic = new Logic();
    public Person signUpPerson(Person person){
        Person savedPerson = logic.addPerson(person);
        return savedPerson;
    }
    public List<Person> viewAllPeople(){
       List<Person> allPeople = logic.showAllPeople();
       return allPeople;
    }
    public Person viewOnePerson(int id){
        Person onePerson = logic.showOnePerson(id);
        return onePerson;
    }

}

class Logic{
    Map<Integer, Person> db = new HashMap<>();
    int id =0;
    public Person addPerson(Person person){
        db.put(id,person);
        return db.get(id++);
    }
    public List<Person> showAllPeople(){
        return new ArrayList<>(db.values());
    }
    public Person showOnePerson(int id){
        return db.get(id);
    }

}
