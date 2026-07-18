package Arrays.HashMap;

import java.util.HashMap;

public class diffDuplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int k=3;
        System.out.println(contains(nums, k));
    }
    public static boolean contains(int[] nums, int k){
        
       for(int i=0; i<nums.length;i++){
           for(int j=i+1; j<nums.length;j++){
            if(nums[i]==nums[j]){
                 int diff=Math.abs(i-j);
                 if(diff<=k) return true;
            }
             
           }
           
       }
       return false;
       
    }
    public static boolean optimized(int[] nums, int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int diff=
        }
    }
}
