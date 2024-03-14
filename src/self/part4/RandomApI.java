package self.part4;

import java.util.Random;

public class RandomApI {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[6];
        int i=0;

        while ( i< 6){
            int num = rand.nextInt(45)+1;
            boolean isDuplicate = false;

            for(int j=0; j<i; j++){
                if(arr[i] == num){
                    isDuplicate = true;
                    break;
                }
            }
            if(arr[i] != num){ //if(!isDuplicate)도 가능한듯
                arr[i++] = num;
            }
        }
        for( int num : arr){
            System.out.println(num);
        }
    }
}
