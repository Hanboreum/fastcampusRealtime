package self;

import self.model.MaxMinView;

public class MaxMinFinder {
    private MaxMinFinder(){

    }

    public static int MaxFinder(int arr[]){
        int max = arr[0];

        for(int i=0; i< arr.length; i++){
            if( arr[i] >max){
                max =arr[i];
            }
        }
        return max;

    }

    public static int MinFinder(int arr[]){
        int min = arr[0];

        for(int i=0; i< arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
