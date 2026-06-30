package SlidingWindow.fixed;
import java.util.Scanner;
public class negativeCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int result=countSubarrays(nums, k);
        System.out.println(result);
    }
    public static int countSubarrays(int[] nums,int k){
        int count=0;
        int maxneg=0;
        for(int i=0; i<k; i++){
            if(nums[i]<0) count++;
        }
        for(int j=k; j<nums.length; j++){
            if(nums[j]<0) count++;
            if(nums[j-k]<0) count--;
            maxneg=Math.max(maxneg,count);
        }
        return maxneg;
    }
}
