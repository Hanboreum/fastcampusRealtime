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
        //로직이 컨트롤로에게 받은걸 출력
        System.out.println(result2.toString() + " 등록 완료");

        //전체 항목 조회
        List<Product> allProducts = controller.showAllProducts();
        for (Product p:allProducts) {
            System.out.println(p.toString());
        }

        //개별 조회
        Product selectedProduct = controller.oneProduct(0);
        System.out.println(selectedProduct.getName());


    }
}

class Controller{
    Logic logic = new Logic();

    //2.view 에게 요청을 받았다. logic 에게 요청 (addProduct)
    public Product registerProducts(Product product){
        Product savedProduct = logic.addProduct(product);
        return savedProduct;
    }

    public List<Product> showAllProducts(){
        List<Product> allProducts = logic.findAllProducts();
        return allProducts;
    }
    public Product oneProduct(int id){
        Product selectedProduct = logic.findOneProduct(id);
        return selectedProduct;
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
    public List<Product>findAllProducts(){
        return new ArrayList<>(db.values());
    }
    public Product findOneProduct(int id){
        return db.get(id);
    }
}