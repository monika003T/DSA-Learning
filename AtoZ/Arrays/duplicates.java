package Arrays;
import java.util.*;
class Solution{
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3,3,3};
        int k=removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums){
        int slow=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[slow]){
             slow++;
            nums[slow]=nums[i];
           
           }
        }
        return slow+1;
    }

}