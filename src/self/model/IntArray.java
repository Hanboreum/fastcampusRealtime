package self.model;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY =5;
    private int size = 0;
    private int[] elements;

    public IntArray(){
        elements = new int[DEFAULT_CAPACITY];
    }
    public void endureCapacity(){
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    public void add(int element){
        if(size ==elements.length){
            endureCapacity();
        }
        elements[size++] = element;
    }
    public int get(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(" 범위 초과");
        }
        return elements[index];
    }
    public int size(){return size;}
}
