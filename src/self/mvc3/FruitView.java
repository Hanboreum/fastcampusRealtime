package self.mvc3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitView {
    public static void main(String[] args) {
        Controller controller = new Controller();
        //등록, 개별조회, 전체조회, 삭제
        Fruit orange = new Fruit("orange",5000);
        Fruit registerOrange = controller.registerFruit(orange);
        Fruit cherry = new Fruit("Cherry",10000);
        Fruit registerCherry = controller.registerFruit(cherry);
        System.out.println(registerOrange.getName()+"등록됨");
        System.out.println(registerCherry.getName() +" 등록됨");

        Fruit oneFruit = controller.searchOne(0);
        System.out.println("개별 조회" +oneFruit.getPrice());

        Fruit removeFruit = controller.deleteOne(0);
        System.out.println(removeFruit.getName() + " 삭제 됨");

        List<Fruit> allFruits = controller.searchAll();
        for(Fruit f  : allFruits){
            System.out.println("전체 조회 "+f.getName());
        }

    }
}
class Controller{
    Logic logic =new Logic();
    public Fruit registerFruit(Fruit fruit){
        Fruit newFruit = logic.addFruit(fruit);
        return newFruit;
    }
    public List<Fruit> searchAll(){
      List<Fruit> allFruits = logic.findAll();
       return allFruits;
    }
    public Fruit searchOne(int id){
        Fruit oneFruit = logic.findOne(id);
        return oneFruit;
    }

    public Fruit deleteOne(int id){
        Fruit deleteOne = logic.removeOne(id);
        return deleteOne;
    }
}
class Logic{

    Map<Integer, Fruit> db = new HashMap<>();
    int id =0;
    public Fruit addFruit(Fruit fruit){
        db.put(id,fruit);
        return db.get(id++);
    }

    public List<Fruit> findAll(){
        return new ArrayList<>(db.values());
    }
    public Fruit findOne(int id){
        return db.get(id);
    }

    public Fruit removeOne(int id){
        return db.remove(id);
    }

}
