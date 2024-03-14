package PolyJava;

public class Main {
    public static void main(String[] args) {
        InheritAndImplement display = new Samsung();
        display.nameAndPhoneAndBuy();
        display.nameAndPhoneAndTurnOn();
        display.phoneIsTurningOn();

        System.out.println();
        System.out.println();

        display = new Apple();
        display.nameAndPhoneAndBuy();
        display.nameAndPhoneAndTurnOn();
        display.phoneIsTurningOn();


    }
}
abstract class InheritAndImplement{
    public void buy(){
        System.out.print("샀습니다.");
    }
    public void turnOn(){ System.out.print("켰습니다."); }
    public abstract void phoneIsTurningOn();
    public abstract void name();

    public abstract void phone();

    public void nameAndPhoneAndBuy() {
        name();
        phone();
        buy();
        System.out.println();
    }
    public void nameAndPhoneAndTurnOn(){
        name();
        phone();
        turnOn();
        System.out.println();
    }
}

class Samsung extends InheritAndImplement {

    @Override
    public void name() {
        System.out.print("재용님이 ");
    }

    @Override
    public void phone() {
        System.out.print("삼송폰을 ");
    }

    @Override
    public void phoneIsTurningOn() {
        System.out.println("★★★ 폰 켜지는 중 ★★★");
    }


}


class Apple extends InheritAndImplement {

    @Override
    public void name() {
        System.out.print("잡스님이 ");
    }

    @Override
    public void phone() {
        System.out.print("사과폰을 ");
    }

    @Override
    public void phoneIsTurningOn() { System.out.println("@@@ 폰 켜지는 중 @@@");}

}

