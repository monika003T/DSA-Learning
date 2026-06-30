package revision;
import java.util.*;
public class zero {
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
           move(nums);
           System.out.println(Arrays.toString(nums));
    }
    public static void move(int[] nums){
        int k=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
            }
        }
    }
}
