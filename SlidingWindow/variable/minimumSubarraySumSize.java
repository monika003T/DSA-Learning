//Minimum size Subarray sum>=k
package SlidingWindow.variable;
import java.util.Scanner;
public class minimumSubarraySumSize{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("smallest size is : "+minimum(nums,k));
    }
    public static int minimum(int[] nums, int k){
        int left=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;
        for(int right=0; right<nums.length; right++){
            sum+=nums[right];
            while(sum>=k){
                minlength=Math.min(minlength,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return minlength==Integer.MAX_VALUE?0:minlength;
    }
}