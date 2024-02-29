package self;

public class test {
    public static void main(String[] args) {
        int chan ='A'-'a';

        char[]up ={'D','F'};
        char[] lo = new char[up.length];

        for(int i=0; i<up.length; i++){
            lo[i] = (char)(up[i]-chan);
        }
        System.out.println(lo);
    }
}
