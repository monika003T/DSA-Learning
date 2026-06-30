package Hashmaps;


import java.util.HashMap;
import java.util.Scanner;

public class twoSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] result=twoSumof(arr, k);
        System.out.println("["+result[0]+","+result[1]+"]");

        int[] opt = optimized(arr, k);
        System.out.println("["+opt[0]+","+opt[1]+"]");

        
    }
    //brute

    public static int[] twoSumof(int[]arr, int target){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                    // Found the pair, but method needs to return indices or something; for now, just fix syntax
                }
            }
        }
        return  new int[]{-1,-1};

    }
    //optimized
    public static int[] optimized(int[] nums, int k){
        HashMap <Integer,Integer> map=new HashMap<>();
        //build frequency                  
        for(int i=0; i<nums.length;i++){
            int curr=nums[i];
            int diff=k-curr;
                                                           
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};

            }
            //store
            map.put(curr, i);
        }
        return  new int[]{-1,-1};   

    }
}
