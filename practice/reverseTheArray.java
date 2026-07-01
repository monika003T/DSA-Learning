package practice;

import java.util.Arrays;

//using two pointers
public class reverseTheArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,8};
        int[] ans=reverse(arr);
    //    System.out.println(Arrays.toString(reverse(arr)));
       for (int i = 0; i < ans.length; i++) {
    System.out.print(ans[i] + " ");
}
    }
    public static int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
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
