package SlidingWindow.fixed;

import java.util.Scanner;

public class allSubarrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        allSub(nums,k);
       
        
    }
    public static void allSub(int[] nums,int k){
          for(int i=0; i<=nums.length-k;i++){
            System.out.print("[");
            for(int j=i;j<i+k;j++){
                System.out.print(nums[j]);

                if(j<i+k-1){
                    System.out.print(",");
                }
            }
            System.out.println("]");
          }
          
          
    }
}
