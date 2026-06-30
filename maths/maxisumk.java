// Maximum sum  of exactly k element 

package maths;
import java.util.*;

public class maxisumk {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(sum(nums,k));
    }
    public static int sum(int[] nums, int k){
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);

        }
        return k*max + (k*(k-1))/2;
    }
}
