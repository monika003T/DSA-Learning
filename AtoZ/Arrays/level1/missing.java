package Arrays.level1;

import java.util.Arrays;
import java.util.HashMap;

public class missing {
    public static void main(String[] args) {
        int[] nums={1,0,3};
        System.out.println((missing(nums)));
        
    }
    public static int missing(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for( int num:nums){
            map.put(num,1);
        }
        for(int i=0;i<=nums.length;i++){
         if(!map.containsKey(i)){
            return i;
         }
        }
        return -1;
    }
}
