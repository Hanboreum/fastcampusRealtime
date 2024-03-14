package day10;

import java.util.HashMap;
import java.util.Map;

public class View {
    public static void main(String[] args) {
        //view -> controller -> model
        //1. 버튼이 눌림,  출력.
        Controller controller = new Controller();
       Product product =
               new Product("img_strawberry.jpg","딸기",10000,"맛있다");
       //Product result = controller.registerProduct(product);

       //5. controller에게 받은 결과를 출력한다.
        //System.out.println(result.name);
    }
}

//view한테 요청 받으면 제어, 조작 역할. 중간 제어자
//모델에게 일을 시킨다. 데이터 덩어리가 아니라 로직에게 시킨다.
class Controller{

    Logic logic = new Logic();

    public String registerProduct(Product product){ //반환타입?
        //2.view에게 요청 받음 logic에게 일 시키기
        logic.addProduct(product);

        //4. logic에게 받은 결과물을 view에게 준다.
        //반환 타입은 어떻게 결정? = 반환 타입은 사용자 화면 고민.
        return "상품 등록 완료";
    }


}

//모델 중 로직 역할
class Logic{
    //DB대신 쓸 Map 만들거, hash? 검색이 빠르다
    Map<Integer, Product> db = new HashMap<>();

    //3.controller에게 전달받은, 요청받은 일 수행 한 다음, 결과를 controller에게 다시 전달.
    //상품 등록
    public void addProduct(Product product){
       db.put(1, product); //value는 view로부터 받아 저장
   }
}
