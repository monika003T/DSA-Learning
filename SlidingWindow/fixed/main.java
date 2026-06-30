package SlidingWindow.fixed;

import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
      
        int [] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        double result = findaverage(nums, k);

        System.out.println(result);
    }
    public static double findaverage(int[] nums,int k){
       
        int left=0;
        int sum=0;
        for(int i=0; i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        for(int j=k;j<nums.length;j++){
            sum+=nums[j];
            sum-=nums[left];
            left++;
            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;
    }
}