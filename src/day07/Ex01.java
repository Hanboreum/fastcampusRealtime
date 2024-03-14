package day07;

public class Ex01 {
    public static void main(String[] args) {
        Mom mom = new Mom();
        Puppy puppy = new Puppy();

        mom.introduce();
        mom.move();
        mom.introduce();

        puppy.introduce();
        puppy.move();

        mom.introduce(); //같은 걸 상속 받았는데 왜 혼자 제주도에 가니...
        //
    }
}

class FamilyMember {
    String city = "서울"; // protected, default, public
}

class Mom extends FamilyMember {

    // String city = "서울";

    public void introduce() {
        System.out.println("저는 " + city + "에 삽니다.");
    }

    public void move() {
        city = "제주도";
    }
}

class Puppy extends FamilyMember {

    public void introduce() {
        System.out.println("멍멍 "+ city + " 멍멍");
    }

    public void move() {
        city = "인천";
    }
}




