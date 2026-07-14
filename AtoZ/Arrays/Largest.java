package Arrays;

import java.util.Arrays;

public class Largest {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,4};
        int res=LargestFromArray(nums);
        System.out.println(((res)));
    }
    public static int LargestFromArray(int[] nums){
        int largest=nums[0];
       
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
              largest=nums[i];
            }
        }
        return largest;
    }
}
