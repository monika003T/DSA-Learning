package Arrays;

import java.util.Arrays;

public class RotateK {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;

        // reverse(arr, 0, n-1);
        // reverse(arr,0,k-1);
        // System.out.println(Arrays.toString(reverse(arr, k, n-1)));
        System.out.println("Reverse the entire array :-> "+Arrays.toString(reverse(nums, 0, n-1)));
        System.out.println("Reverse the Array first k times :->"+Arrays.toString(reverse(nums, 0, k-1)));
        System.out.println("Reverse the remaining n-k elements :-> "+Arrays.toString(reverse(nums, k, n-1)));
        System.out.println(Arrays.toString(rotateLeft(arr,k)));
        
        
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

    public static int[] rotateLeft(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        for (int r = 0; r < k; r++) {

            // Store first element
            int first = arr[0];

            // Shift all elements left by one
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Place first element at the end
            arr[n - 1] = first;
        }
        return arr;
}
}