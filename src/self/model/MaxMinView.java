package self.model;

import self.MaxMinFinder;

public class MaxMinView {
    public static void main(String[] args) {
        int[] arr = {4,5,7,2,8,10};

        int max = MaxMinFinder.MaxFinder(arr);
        System.out.println("max = " + max);
        int min = MaxMinFinder.MinFinder(arr);
        System.out.println("min = " + min);
    }

}
