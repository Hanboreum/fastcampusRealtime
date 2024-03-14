package self.part4;

import self.model.IntArray;

public class IntArrayView {
    public static void main(String[] args) {
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        System.out.println(list.size());
        System.out.println();
        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
