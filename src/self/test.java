package self;

public class test {
    public static void main(String[] args) {
        String literal1 = "Hello world";
        String literal2 = "Hello world";
        String obj1 = new String (literal1);
        String obj2 = new String(literal2);

        System.out.println(literal1 ==literal2);
        System.out.println(literal1.equals(literal2));
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(literal1 ==obj1);
        System.out.println(literal1.equals(obj1));
    }
}

