package Arrays;
import java.util.*;
public class move {
    public static void main(String[] args) {
         int nums[]={1,0,2,0,3};
        
        System.out.println(Arrays.toString(moveZeros(nums)));
        System.out.println(Arrays.toString(optimized(nums)));
    }
    //brute
    public static  int[] moveZeros(int[] nums){
       int n=nums.length;
        int[] temp=new int[n];
        int index=0;
        //traverse the input
        for(int i=0; i<n;i++){
            if(nums[i]!=0){
                temp[index]=nums[i];
                index++;
            }
        }
        //copy temp back
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
      return nums;
    }
    public static int[] optimized(int[] nums){
        int j=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}
