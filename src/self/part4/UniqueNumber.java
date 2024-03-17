package self.part4;

import self.model.IntArray;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumber {
    public static void main(String[] args) {
      int[] nums = {1,1,2,2,3,6,5,3,8,9};
      Set<Integer> unique = new HashSet<>();

      for( int n : nums){
          unique.add(n);
      }

      for( int n : unique){
          System.out.println(n);
      }
    }
}
