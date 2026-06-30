package SlidingWindow.fixed;

import java.util.*;

public class count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int target=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int result = countSubarrays(nums, k, target);
        System.out.println(result);
    }
    public static int countSubarrays(int[] nums,int k, int target){
     
        int sum=0;
        int count=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
           
        }
         if(sum<target) count++;
        for(int j=k; j<nums.length; j++){
            sum+=nums[j];
            sum-=nums[j-k];
            
            if(sum<target) count++;
        }
        return count;
    }
}
