package self.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Print {
    public static void main(String[] args) {
        //view - controller - logic
        //1. 버튼 누르면 - 컨트롤러가 신호 받고 - 원하는 값(조회) 출력

        Controller controller = new Controller();
        Product product1 = new Product("keyboard",30000,"Computer");
        Product product2 = new Product("Almond",8000,"Food");
        Product result1 = controller.registerProducts(product1);
        Product result2 = controller.registerProducts(product2);
        System.out.println(result2.toString() + " 등록 완료");
        //로직이 컨트롤로에게 받은걸 출력

    }
}

class Controller{
    Logic logic = new Logic();

    //2.view 에게 요청을 받았다. logic 에게 요청 (addProduct)
    public Product registerProducts(Product product){
        Product savedProduct = logic.addProduct(product);
        return savedProduct;
    }

}

class Logic{
    Map<Integer, Product> db = new HashMap<>();
    int id =0;

    //3. controller에게 전달 받은 내역 수행, 다시 controller에게 전달
    public Product addProduct(Product product){
        db.put(id,product);
        return db.get(id++);
    }
}