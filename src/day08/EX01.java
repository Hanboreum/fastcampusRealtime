package day08;

public class EX01 {
    public static void main(String[] args) {
        //movie
        //
       // Actor spider = new Spiderman();
        //spider.printInfo();

    }


class Actor{
        public void printInfo(){
            System.out.println("지정되지 않음");
        }
    }

class Spiderman extends Actor{

        public void printInfo(){
            System.out.println("spiderman info");
        }

class Ironman extends Actor{
            public void printInfo(){
                System.out.println("Ironman infor");
            }
        }


    }
}
