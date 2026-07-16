package Arrays.HashSet;

import java.util.HashSet;
import java.util.*;

public class countDistinct {
    public static void main(String[] args) {
        int[] nums={1,1,2,3,4,4,5,6,7,8};
        System.out.println(distinctElement(nums));
          
       
    }
    public static int distinctElement(int[] nums){
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
            
        }
        System.out.println(set);
        return set.size();
      
    }
}
