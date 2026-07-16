package Arrays.HashSet;

import java.util.HashSet;

public class check {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5}; int key=5;
        System.out.println(checkElement(nums, key));
        
    }
    public static boolean checkElement(int [] nums, int key){
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
           
        }
         if(!set.contains(key)) return false;
        return set.contains(key);

    }
}
