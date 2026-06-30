package sorting;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args){
        int arr[]={1,2,6,5,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void  insertion(int[] nums){
        for(int i =1; i<nums.length;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
    }
}
