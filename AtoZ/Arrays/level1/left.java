package Arrays.level1;
import java.util.*;
public class left {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println(Arrays.toString(leftRotate(nums)));
    }
    public static int[] leftRotate(int[] nums){
        int temp=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=temp;
        return nums;

    }
}
