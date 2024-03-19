package day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
        view: FE
        controller: BE 앞잡이. 일 안해요,
          주로 하는 역할은 뷰의 요청 받아 로직에 전달, 로직의 값을 받고 그걸 뷰에 전달.
        logic : BE 의 로직, 데이터 담당.
         */
public class View {
    public static void main(String[] args) {
        //view -> controller -> model
        //1. 버튼이 눌림,  출력.
        Controller controller = new Controller();
       Product product1 =
               new Product("img_strawberry.jpg","딸기",10000,"맛있다");
       Product result1 = controller.registerProduct(product1);

        Product product2 =
                new Product("img_strawberry.jpg","사과",15000,"비싸다..");
        Product result2 = controller.registerProduct(product2);

       //5. controller에게 받은 결과를 출력한다.
        System.out.println(result1.name+ " 등록");
        System.out.println(result2.name+ " 등록");

        //상품전체조회
       List<Product> allProducts =  controller.queryAll();

      /* for(int i=0; i < allProducts.size(); i++){
           System.out.println(allProducts.get(i).name);
       }*/
        for (Product p: allProducts) {
            System.out.println(p.name);
        }
        System.out.println();

        //상품의 개별 페이지, 상세 페이지. 데이터가 뿌려지는 상세 페이지.
        //controller.로직시켜서 개별조회해와()
        Product selectedProduct = controller.queryOne(0);
        System.out.println(selectedProduct.name);
    }
}

//view한테 요청 받으면 제어, 조작 역할. 중간 제어자
//모델에게 일을 시킨다. 데이터 덩어리가 아니라 로직에게 시킨다.
class Controller{

    Logic logic = new Logic();

    public Product registerProduct(Product product){ //반환타입?
        //2.view에게 요청 받음 logic에게 일 시키기
        Product savedProduct = logic.addProduct(product);
        //4. logic에게 받은 결과물을 view에게 준다.
        //반환 타입은 어떻게 결정? = 반환 타입은 사용자 화면 고민.
        return savedProduct;
    }
    public List<Product> queryAll(){
        List<Product> allProducts = logic.findAllProducts();
        return allProducts;
    }
    public Product queryOne(int id){
        Product selectedProduct = logic.findOneProduct(id);
        return selectedProduct;
    }
}

//모델 중 로직 역할
class Logic{
    //DB대신 쓸 Map 만들거, hash? 검색이 빠르다
    Map<Integer, Product> db = new HashMap<>();
    int id =0; //key

    //3.controller에게 전달받은, 요청받은 일 수행 한 다음, 결과를 controller에게 다시 전달.
    //상품 등록
    public Product addProduct(Product product){
       db.put(id, product); //value는 view로부터 받아 저장 //왜 딸기만 뜨는데?키 값이 1이니까..키값늘리기

        return db.get(id++); //다음엔 하나 추가해 들어오기
    }

    public List<Product> findAllProducts(){ //ArrayList<Product> -> 업캐스팅 한 것이 list
        //전체 조회
        //db에 잇는 val 값을 arraylist로 반환
        return new ArrayList<>(db.values()); //product 배열 - 중간에 빈 칸 생김 냅둠, List - 중간에 빈 칸 생기면 땡김. 삭제돼도 빈칸 없이 유지
    }
    public Product findOneProduct(int id){ //하나만 주니까 product
        return db.get(id);
    }
}
