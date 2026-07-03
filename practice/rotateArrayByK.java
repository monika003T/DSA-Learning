package practice;

import java.util.Arrays;

public class rotateArrayByK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;

        // reverse(arr, 0, n-1);
        // reverse(arr,0,k-1);
        // System.out.println(Arrays.toString(reverse(arr, k, n-1)));
        System.out.println("Reverse the entire array :-> "+Arrays.toString(reverse(arr, 0, n-1)));
        System.out.println("Reverse the Array first k times :->"+Arrays.toString(reverse(arr, 0, k-1)));
        System.out.println("Reverse the remaining n-k elements :-> "+Arrays.toString(reverse(arr, k, n-1)));
        
        
    }
    public static int[] reverse(int[] arr,int start,int end){
        
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        return arr;
}
}