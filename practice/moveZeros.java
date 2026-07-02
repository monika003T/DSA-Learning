package practice;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr={0,1,0,3,2};
        // //  int[] arr={1,0,2};
        //  int [] arr={1,2,0,3};
        int[] ans=moveZerosToEnd(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] moveZerosToEnd(int[] arr){
        int left=0;
        for(int right=0;right<arr.length;right++){
             if(arr[right]!=0){
             int temp=arr[left];
             arr[left]=arr[right];
             arr[right]=temp;
              left++;
             
             }
            
             
            
             
        }
        return arr;
    }
}
