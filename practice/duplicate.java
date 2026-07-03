package practice;

import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3};
        int[] ans=removeDuplicate(nums);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] removeDuplicate(int[] nums){
        int slow=0;
        for(int fast =1; fast<nums.length; fast++){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }

        }return nums;
    }
}
