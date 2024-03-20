package self.mvc;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Print {
    public static void main(String[] args) {
        //개별등록 c - registerProduct, l - addPro
        Product product1 = new Product("banana",9000,"food");
        Product product2 = new Product("Phone",9999999,"IT");
        Controller controller = new Controller();
        Product add1 =controller.registerProduct(product1);
        Product addd2 = controller.registerProduct(product2);
        System.out.println(add1 + "등록");

        //전체 조회 controller - AllProduct, Logic - fnidAll
        List<Product> allProducts = controller.AllProduct();
        for(Product p: allProducts){
            System.out.println("모든 제품"+p.toString());
        }

        //개별조회 controller - oneProduct, logic - findOne
        Product oneProduct = controller.oneProduct(0);
        System.out.println( "개별조회 제품: "+oneProduct);
    }
}

class Controller{
    Logic logic = new Logic();
    public Product registerProduct(Product product){
        Product newProduct = logic.addProduct(product);
        return newProduct;
    }
    public List<Product> AllProduct(){
        List<Product> allProduct= logic.findAll();
        return allProduct;
    }
    public Product oneProduct(int id){
        Product oneProduct = logic.findOne(id);
        return oneProduct;
    }
}

class Logic {
    Map<Integer, Product> db = new HashMap<>();
    int id =0;
    public Product addProduct(Product product){
        db.put(id,product);
        return db.get(id++);
    }
    public List<Product> findAll(){
        return new ArrayList<>(db.values());
    }
    public Product findOne(int id){
        return db.get(id);
    }

}